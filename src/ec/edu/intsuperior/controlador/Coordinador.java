/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Punto;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class Coordinador {

    Punto array[];

    public void dimension(int dim) {
        array = new Punto[dim];
    }

    public int getLongitud() {
        return array.length;
    }
    public void llenarArreglo(int x, int y){
       int i=0;
        while(array[i]!=null){ 
                 i++;
            }
                array[i]=new Punto(x, y);
//        for (int i = 0; i < array.length; i++) {
//            array[i]=new Punto(x, y);
//        }
        
       
    }

    public String imprimir(){
//         JOptionPane.showMessageDialog(null,""
//                + "Los Puntos son:/n"
               return Arrays.toString(array);
    }
  public  void  ingresar (String x,String y){
      if(x.equals("")){
          System.out.println("error se inicializara con 0");
          x="0";
      }
      if(y.equals("")){
          System.out.println("error se inicializara con 0");
          y= "0";
      }
    
  }
}
