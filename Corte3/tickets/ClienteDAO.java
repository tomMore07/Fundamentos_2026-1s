/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tickets.modeloDAO;

import com.mycompany.tickets.modelo.dto.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SARA/tomy
 */
public class ClienteDAO {

    private List<Cliente> listaCliente;

    public ClienteDAO() {
        listaCliente = new ArrayList<>();
    }

    public boolean registrar(Cliente cliente) {
        if (buscar(cliente.getDocumento()) != null) {
            return false;
        }
        return listaCliente.add(cliente);
    }


    public Cliente buscar(int documento) {
        for (Cliente cliente : listaCliente) {
            if (documento == cliente.getDocumento())
                return cliente;
        }
        return null;
    }
    /**
     * 
     * @param index
     * @param cliente 
     */
  
    public void modificar(int index, Cliente cliente) {
        listaCliente.set(index, cliente);
    }

    public void eliminar(Cliente cliente) {
        listaCliente.remove(cliente);
    }

    public int buscarIndice(Cliente cliente) {
        return listaCliente.indexOf(cliente);
    }
}
