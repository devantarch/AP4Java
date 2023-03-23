package com.mycompany.apjava;

/**
 *
 * @author ilari
 */
public class ApJAVAC1E1b {
    
    public static void main(String[] args) {
        
        int numeroInicio = 5;                               // Indica valor de inicio
        int numeroFin = 14;                                 // Indica valor de fin
        
        while (numeroInicio <= numeroFin){                  //Realiza el bucle mientras numeroInicio sea menor o igual a numeroFin
                if (numeroInicio % 2 == 0){                 // Valida que el número sea par
                    System.out.println(numeroInicio);       // Imprime valor actual de numeroInicio
                }                      
               
                numeroInicio++;                             //aumenta en una unidad el valor de numeroInicio
        }
    
}
}
    