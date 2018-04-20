/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Marcos
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cola c = new Cola();
       c.Añadir(7);
       c.Añadir(8);
       c.Añadir(9);
       c.Mostrar();
       c.Sacar();
        System.out.println("");
        c.Mostrar();
        Queue<Integer> cola=new LinkedList();
    }
    
    
}
