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
    
    private static final int MAX_A = 11;
    private static final int MAX_B = 22;
    private static final int MAX_C = 33;
    private static final int MAX_D = 44;

    public ClienteDAO() {
        listaCliente = new ArrayList<>();
    }

    private int contarBoletos(char localidad) {
        int total = 0;
        for (Cliente c : listaCliente) {
            if (c.getLocalidad() == localidad)
                total += c.getCantBoletos();
        }
        return total;
}


    public boolean registrar(Cliente cliente) {
        if (buscar(cliente.getDocumento()) != null)
            return false; 

        int max = switch (cliente.getLocalidad()) {
            case 'A' -> MAX_A;
            case 'B' -> MAX_B;
            case 'C' -> MAX_C;
            case 'D' -> MAX_D;
            default  -> 0;
        };

        if (contarBoletos(cliente.getLocalidad()) + cliente.getCantBoletos() > max)
            return false; 

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
