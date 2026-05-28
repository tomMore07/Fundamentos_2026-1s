/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tickets;

import com.mycompany.tickets.controlador.ClienteControlador;
import com.mycompany.tickets.vista.ClienteVista;

/**
 *
 * @author tomy
 */
public class Tickets1 {

    public static void main(String[] args) {
        ClienteControlador clienteControlador = new ClienteControlador(new ClienteVista());
    }
}
