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


public class ClienteControlador implements ActionListener{
    private ClienteVista vista;
    private ClienteDAO modelo;
    private Cliente cliente;
    
    public ClienteControlador(ClienteVista vista){
        this.cliente = cliente;
        this.modelo = new ClienteDAO();
        
        
        this.vista.buscar.addActionListener(this);
        this.vista.eliminar.addActionListener(this);
        this.vista.modificar.addActionListener(this);
        this.vista.registrar.addActionListener(this);
        
        this.vista.setVisible(true);
    }
      

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.registrar))
            registrar();
        if(e.getSource().equals(this.vista.modificar))
            modificar();
        if(e.getSource().equals(this.vista.buscar))
            buscar();
        if(e.getSource().equals(this.vista.eliminar))
            eliminar();
    }

    private void registrar() {
        cliente = new Cliente();
        
        int identificacion = Integer.valueOf(this.vista.documentoIn.getText());
        String nombre = this.vista.nombre.getText();
        int boletosBox = (int) this.vista.boletosBox.getSelectedItem();
        
        char localidad= '\0';
        if(this.vista.localidadA.isSelected()){
            localidad = 'A';
        }else if(this.vista.localidadB.isSelected()){
            localidad = 'B';
        }else if(this.vista.localidadC.isSelected()){
            localidad = 'C';
        }else if(this.vista.localidadD.isSelected()){
            localidad = 'D';
        }else{ localidad = '\0';}
           
        
                
        cliente.setIdentificacion(identificacion);
        cliente.setNombre(nombre);
        cliente.setCantBoletos(boletosBox);
        cliente.setLocalidad(localidad);
        
        if(modelo.registrar(cliente))
            JOptionPane.showMessageDialog(null, "Se registro exitosamente su boleto");
            else
            JOptionPane.showMessageDialog(null, "F vv te quedaste sin boletos");
            
        
    }

    private void modificar() {
        int index = modelo.buscarIndice(cliente);
        this.modelo.modificar(index, cliente);
    }
    private void buscar() {
        int documento = Integer.valueOf(this.vista.documentoIn.getText());
        
        cliente = modelo.buscar(documento);
        if(cliente == null)
        JOptionPane.showMessageDialog(null, "Mor no estas registrade");
    else this.vista.nombre.setText(cliente.getNombre());
         this.vista.boletosBox.setText(cliente.get());

    }
    private void eliminar() {
        this.modelo.eliminar(cliente);
    }
}
