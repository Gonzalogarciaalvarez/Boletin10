/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {
        int numramdom = (int) (Math.random() * 50);
        boolean respuesta = false;

    public void numeroAletorio() {
        System.out.println(numramdom);
        while (respuesta != true) {
            int numres = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una respuesta"));
            if (numres == numramdom){
                respuesta = true;
                JOptionPane.showMessageDialog(null, "Has acertado");
            }if (numres>numramdom){
                if((numres-numramdom)<6){
                    JOptionPane.showMessageDialog(null, "Muy cerca");
            }
                if((numres-numramdom)<10 && (numres - numramdom) >5){
                    JOptionPane.showMessageDialog(null, "Cerca");
            }
                if((numres-numramdom)<=20 && (numres-numramdom)>=10){
                    JOptionPane.showMessageDialog(null, "Lejos");
            }
                if((numres-numramdom)>20){
                    JOptionPane.showMessageDialog(null, "Muy lejos");
            }
            }else if (numres<numramdom){
                if((numramdom-numres)<6){
                    JOptionPane.showMessageDialog(null, "Muy cerca");
            }  
                if((numramdom-numres)<10 && (numramdom-numres)>5){
                    JOptionPane.showMessageDialog(null, "Cerca");
            }
                if((numramdom-numres)<=20 && (numramdom-numres)>=10){
                    JOptionPane.showMessageDialog(null, "Lejos");
            }
                if((numramdom-numres)>20){
                    JOptionPane.showMessageDialog(null, "Muy lejos");
            }
        }
    }
    }
}
