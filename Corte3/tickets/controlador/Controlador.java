/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tickets.controlador;

import com.mycompany.tickets.modelo.dto.Cliente;
import com.mycompany.tickets.modeloDAO.ClienteDAO;
import com.mycompany.tickets.vista.ClienteVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author SARA
 */

public class ClienteControlador implements ActionListener {

    private ClienteVista vista;
    private ClienteDAO modelo;
    private Cliente cliente;

    public ClienteControlador(ClienteVista vista) {
        this.vista = vista;           
        this.modelo = new ClienteDAO();
        this.cliente = null;          

        this.vista.buscar.addActionListener(this);
        this.vista.eliminar.addActionListener(this);
        this.vista.modificar.addActionListener(this);
        this.vista.registrar.addActionListener(this);

        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.registrar))  
            registrar();
        if (e.getSource().equals(this.vista.modificar))  
            modificar();
        if (e.getSource().equals(this.vista.buscar))     
            buscar();
        if (e.getSource().equals(this.vista.eliminar))   
            eliminar();
    }

    
    private void registrar() {
        if (this.vista.documentoIn.getText().isEmpty() ||
            this.vista.nombreIn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bro se te olvido llenar todos los datos");
            return;
        }

        cliente = new Cliente();

        int identificacion= Integer.parseInt(this.vista.documentoIn.getText()); 
        String nombre= this.vista.nombreIn.getText();                      
        int cantBoletos= Integer.parseInt((String) this.vista.boletosBox.getSelectedItem());

        char localidad = '\0';
        if (this.vista.localidadA.isSelected()) localidad = 'A';
        else if (this.vista.localidadB.isSelected()) localidad = 'B';
        else if (this.vista.localidadC.isSelected()) localidad = 'C';
        else if (this.vista.localidadD.isSelected()) localidad = 'D';

        if (localidad == '\0') {
            JOptionPane.showMessageDialog(null, "Seleccione una localidad.");
            return;
        }

        cliente.setDocumento(identificacion);   
        cliente.setNombre(nombre);
        cliente.setCantBoletos(cantBoletos);
        cliente.setLocalidad(localidad);

        if (modelo.registrar(cliente))
            JOptionPane.showMessageDialog(null, "¡Boleto registrado exitosamente!");
        else
            JOptionPane.showMessageDialog(null, "Ya existe un registro con ese documento o te quedaste sin boleto :(");
    }


    private void buscar() {
        if (this.vista.documentoIn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un documento para buscar.");
            return;
        }

        int documento = Integer.parseInt(this.vista.documentoIn.getText());
        cliente = modelo.buscar(documento);

        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún registro con ese documento");
        } else {
            this.vista.nombreIn.setText(cliente.getNombre());
            this.vista.boletosBox.setSelectedItem(              
                    String.valueOf(cliente.getCantBoletos()));

            this.vista.localidadA.setSelected(cliente.getLocalidad() == 'A');
            this.vista.localidadB.setSelected(cliente.getLocalidad() == 'B');
            this.vista.localidadC.setSelected(cliente.getLocalidad() == 'C');
            this.vista.localidadD.setSelected(cliente.getLocalidad() == 'D');

            JOptionPane.showMessageDialog(null, "Sus boletos son válidos," + cliente.getNombre());
        }
    }


    private void modificar() {
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Primero busque el cliente que deseas modificar.");
            return;
        }

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
            JOptionPane.showMessageDialog(null, "Registro modificado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el boleto registrado para modificar");
        }
    }


    private void eliminar() {
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Primero busque el cliente que desee eliminar.");
            return;
        }

        int confirmar = JOptionPane.showConfirmDialog(null,
                "¿Seguro que desea eliminar sus boletos " + cliente.getNombre() + "?",
                "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            modelo.eliminar(cliente);
            cliente = null;
            this.vista.documentoIn.setText("");
            this.vista.nombreIn.setText("");
            this.vista.boletosBox.setSelectedIndex(0);
            this.vista.localidadA.setSelected(false);
            this.vista.localidadB.setSelected(false);
            this.vista.localidadC.setSelected(false);
            this.vista.localidadD.setSelected(false);
            JOptionPane.showMessageDialog(null, "Registro de boletos eliminado");
        }
    }
}
