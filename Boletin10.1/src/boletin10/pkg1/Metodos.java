/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {
    int numramdom = (int) (Math.random() * 50);
    int i;
    boolean respuesta = false; 
    public void numeroAletorio() {
        int oportunidades= Integer.parseInt(JOptionPane.showInputDialog("Cuantas oportunidades deseas tener?"));
        System.out.println(numramdom);
        for(int i=0;i<oportunidades;i++){
            int numres = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una respuesta"));
            if(numres>numramdom){
                JOptionPane.showMessageDialog(null, "Tu numero es demasiado grande");
            }
            if(numres<numramdom){
                JOptionPane.showMessageDialog(null, "Tu numero es demasiado pequeño");
            }
            if (numres==numramdom){
                JOptionPane.showMessageDialog(null, "Correcto");
                break;
            }
            int x=--oportunidades;
            int y=--x;
            JOptionPane.showMessageDialog(null,"Te quedan "+y+" intentos");            
        }    

    }
}
