package com.mycompany.apjava;

/**
 *
 * @author ilari
 */
public class ApJAVAC1E2d {
    public static void main(String[] args) {
        
        /*pueden cambiar estas variables para ir probando*/

        float ingresos = 483083;
        int vehiculos = 0;
        int inmuebles = 1;
        int embarcacion = 0;
        int aeronave = 0;
        boolean activoSoc = true;

/*********************************************/
        if ((ingresos >= 489083) ||                                         //evaluamos las condiciones
        ( inmuebles >= 3) ||
        (vehiculos >= 3) ||
        (aeronave >= 1)||
        (embarcacion >= 1) ||
        (activoSoc == true)) {
        System.out.println("Pertenece al sector de altos ingresos");        //Texto a mostrar en caso de que se cumple una o màs de las condiciones
        } else {
        System.out.println("No pertenece al sector de altos ingresos");     //Texto a mostrar en cas de que  no se cumpla ninguna de las condiciones
        }
    }
}
