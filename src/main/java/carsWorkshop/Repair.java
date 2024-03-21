package carsWorkshop;

public class Repair {
    String licensePlate;
    String status;
   
package com.mycompany.placa;
 
import java.util.Arrays;

import javax.swing.JOptionPane;
 

public class Placa {
 
    public static void main(String[] args) {

      String  placa1 = JOptionPane.showInputDialog(null, "Ingrese la placa del vehiculo");

      String placas[]={"asd","f","g"};

      String []vectornuevo = new String[placas.length];

      vectornuevo=placa(placa1,placas);

        System.out.println(Arrays.toString(vectornuevo));



    }

    public static String[] placa(String x,String[]v){

         String menu="  1-listo para entraga"+"\n"

                 + "    2-En proceso de reparacion"+"\n"

                 + "    3-Pendiente de reparacion";

         String opcion;

         String []h=new String[v.length];


        for (int i = 0; i < v.length; i++) {

           if(v[i]==x){

               System.out.println("la el vehiculo se encuentra en la lista de hiculos");

               opcion=JOptionPane.showInputDialog(menu);

               h[i]=x+opcion;   

           }

           else{

               JOptionPane.showConfirmDialog(null, "la placa no concuerda con ningun vehiculo");

           }

        }

        return h;

    }

}

}
