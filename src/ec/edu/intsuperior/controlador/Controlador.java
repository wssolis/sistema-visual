/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Punto;
import java.awt.List;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class Controlador {

    int $num;
    
    private Punto arreglo[];

    public void dimension(String dim) {
        $num=5;
        JOptionPane.showMessageDialog(null,$num);
        arreglo = new Punto[Integer.parseInt(dim)];
    }

    
    public void validar(java.awt.event.KeyEvent evt) {
        Character c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
        // TODO add your handling code here:
    }

    public void ingresar(String x, String y) {
        if (getDimension() != elementosIngresados()) {
            if (x.equals("")) {
                System.out.println("error se inicializara conn 0");
                x = "0";
            }
            if (y.equals("")) {
                System.out.println("error se inicializara conn 0");
                y = "0";
            }
            int i = 0;
            while (arreglo[i] != null) {
                i++;
            }
            arreglo[i] = new Punto(Integer.parseInt(x), Integer.parseInt(y));
        } else {
            JOptionPane.showMessageDialog(null, "el arreglo ya esta lleno");
        }
    }

    public int elementosIngresados() {
        int b = 0;
        for (Punto p : arreglo) {
            if (p != null) {
                b++;
            }
        }
        return b;
    }

    public String imprimir() {
        String acumPuntos = "";
        for (Punto p : arreglo) {
            acumPuntos += "\n" + p.toString();
// JOptionPane.showMessageDialog(null, p);
        }

        return acumPuntos;
    }

//    public void dimensionar(String dim){
//        // int dim = Integer.parseInt(JOptionPane.showInputDialog("ingrese dimension"));
//        arreglo=new Punto[Integer.parseInt(dim)];
//    }
//    
    public int getDimension() {
        return arreglo.length;
    }

}
