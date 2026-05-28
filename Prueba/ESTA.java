package com.mycompany.tickets.controlador;

import com.mycompany.tickets.modelo.dto.Cliente;
import com.mycompany.tickets.modeloDAO.ClienteDAO;
import com.mycompany.tickets.vista.ClienteVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ClienteControlador implements ActionListener {

    private ClienteVista vista;
    private ClienteDAO   modelo;
    private Cliente      cliente;

    public ClienteControlador(ClienteVista vista) {
        this.vista    = vista;           // ✅ FIX: asignar la vista al atributo
        this.modelo   = new ClienteDAO();
        this.cliente  = null;            // ✅ FIX: inicializar en null, no en una variable inexistente

        this.vista.buscar.addActionListener(this);
        this.vista.eliminar.addActionListener(this);
        this.vista.modificar.addActionListener(this);
        this.vista.registrar.addActionListener(this);

        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.registrar))  registrar();
        if (e.getSource().equals(this.vista.modificar))  modificar();
        if (e.getSource().equals(this.vista.buscar))     buscar();
        if (e.getSource().equals(this.vista.eliminar))   eliminar();
    }

    // ── REGISTRAR ──────────────────────────────────────────────────────────────

    private void registrar() {
        // Validar que los campos no estén vacíos
        if (this.vista.documentoIn.getText().isEmpty() ||
            this.vista.nombreIn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor completa todos los campos.");
            return;
        }

        cliente = new Cliente();

        int    identificacion = Integer.parseInt(this.vista.documentoIn.getText()); // ✅ FIX: parseInt, no valueOf
        String nombre         = this.vista.nombreIn.getText();                      // ✅ FIX: nombreIn (JTextField), no nombre (JLabel)
        int    cantBoletos    = Integer.parseInt(                                   // ✅ FIX: getSelectedItem() retorna String, hay que parsear
                                    (String) this.vista.boletosBox.getSelectedItem());

        char localidad = '\0';
        if      (this.vista.localidadA.isSelected()) localidad = 'A';
        else if (this.vista.localidadB.isSelected()) localidad = 'B';
        else if (this.vista.localidadC.isSelected()) localidad = 'C';
        else if (this.vista.localidadD.isSelected()) localidad = 'D';

        if (localidad == '\0') {
            JOptionPane.showMessageDialog(null, "Selecciona una localidad.");
            return;
        }

        cliente.setDocumento(identificacion);   // ✅ FIX: setDocumento, no setIdentificacion (ese método no existe)
        cliente.setNombre(nombre);
        cliente.setCantBoletos(cantBoletos);
        cliente.setLocalidad(localidad);

        if (modelo.registrar(cliente))
            JOptionPane.showMessageDialog(null, "¡Boleto registrado exitosamente!");
        else
            JOptionPane.showMessageDialog(null, "Ya existe un registro con ese documento.");
    }

    // ── BUSCAR ─────────────────────────────────────────────────────────────────

    private void buscar() {
        if (this.vista.documentoIn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa un documento para buscar.");
            return;
        }

        int documento = Integer.parseInt(this.vista.documentoIn.getText());
        cliente = modelo.buscar(documento);

        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún registro con ese documento.");
        } else {
            // ✅ FIX: mostrar los datos encontrados en la vista
            this.vista.nombreIn.setText(cliente.getNombre());
            this.vista.boletosBox.setSelectedItem(              // ✅ FIX: setSelectedItem, JComboBox no tiene setText
                    String.valueOf(cliente.getCantBoletos()));

            // Marcar la localidad correcta
            this.vista.localidadA.setSelected(cliente.getLocalidad() == 'A');
            this.vista.localidadB.setSelected(cliente.getLocalidad() == 'B');
            this.vista.localidadC.setSelected(cliente.getLocalidad() == 'C');
            this.vista.localidadD.setSelected(cliente.getLocalidad() == 'D');

            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.getNombre());
        }
    }

    // ── MODIFICAR ──────────────────────────────────────────────────────────────

    private void modificar() {
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Primero busca el cliente que deseas modificar.");
            return;
        }

        // ✅ FIX: actualizar los datos del cliente con lo que hay en la vista ANTES de modificar
        cliente.setNombre(this.vista.nombreIn.getText());
        cliente.setCantBoletos(Integer.parseInt(
                (String) this.vista.boletosBox.getSelectedItem()));

        char localidad = '\0';
        if      (this.vista.localidadA.isSelected()) localidad = 'A';
        else if (this.vista.localidadB.isSelected()) localidad = 'B';
        else if (this.vista.localidadC.isSelected()) localidad = 'C';
        else if (this.vista.localidadD.isSelected()) localidad = 'D';
        cliente.setLocalidad(localidad);

        int index = modelo.buscarIndice(cliente);
        if (index >= 0) {
            modelo.modificar(index, cliente);
            JOptionPane.showMessageDialog(null, "Registro modificado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el registro para modificar.");
        }
    }

    // ── ELIMINAR ───────────────────────────────────────────────────────────────

    private void eliminar() {
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Primero busca el cliente que deseas eliminar.");
            return;
        }

        int confirmar = JOptionPane.showConfirmDialog(null,
                "¿Seguro que deseas eliminar a " + cliente.getNombre() + "?",
                "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            modelo.eliminar(cliente);
            cliente = null;
            // Limpiar la vista
            this.vista.documentoIn.setText("");
            this.vista.nombreIn.setText("");
            this.vista.boletosBox.setSelectedIndex(0);
            this.vista.localidadA.setSelected(false);
            this.vista.localidadB.setSelected(false);
            this.vista.localidadC.setSelected(false);
            this.vista.localidadD.setSelected(false);
            JOptionPane.showMessageDialog(null, "Registro eliminado.");
        }
    }
}

//modelodto 

package com.mycompany.tickets.modelo.dto;

import java.io.Serializable;

public class Cliente implements Serializable {

    private int    documento;
    private String nombre;
    private int    cantBoletos;
    private char   localidad;   // ✅ FIX: faltaba declarar este atributo

    public int getDocumento()            { return documento; }
    public void setDocumento(int d)      { this.documento = d; }

    public String getNombre()            { return nombre; }
    public void setNombre(String n)      { this.nombre = n; }

    public int getCantBoletos()          { return cantBoletos; }
    public void setCantBoletos(int c)    { this.cantBoletos = c; }

    public char getLocalidad()           { return localidad; }
    public void setLocalidad(char l)     { this.localidad = l; }
}

//DAO

package com.mycompany.tickets.modeloDAO;

import com.mycompany.tickets.modelo.dto.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private List<Cliente> listaCliente;

    public ClienteDAO() {
        listaCliente = new ArrayList<>();
    }

    /** Registra un cliente. Devuelve false si el documento ya existe. */
    public boolean registrar(Cliente cliente) {
        // ✅ FIX: verificar duplicados por documento antes de agregar
        if (buscar(cliente.getDocumento()) != null) {
            return false;
        }
        return listaCliente.add(cliente);
    }

    /** Busca por documento. Retorna null si no existe. */
    public Cliente buscar(int documento) {
        for (Cliente c : listaCliente) {
            if (documento == c.getDocumento())
                return c;
        }
        return null;
    }

    /** Modifica el cliente en la posición index. */
    public void modificar(int index, Cliente cliente) {
        listaCliente.set(index, cliente);
    }

    /** Elimina un cliente de la lista. */
    public void eliminar(Cliente cliente) {
        listaCliente.remove(cliente);
    }

    /** Devuelve el índice de un cliente en la lista. */
    public int buscarIndice(Cliente cliente) {
        return listaCliente.indexOf(cliente);
    }
}

//main

package com.mycompany.tickets;

import com.mycompany.tickets.controlador.ClienteControlador;
import com.mycompany.tickets.vista.ClienteVista;

public class Tickets1 {
    public static void main(String[] args) {
        // ✅ Correcto: el controlador recibe la vista y conecta todo
        new ClienteControlador(new ClienteVista());
    }
}
