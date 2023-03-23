package com.mycompany.apjava;
import java.util.Scanner;

/**
 *
 * @author ilari
 */
public class ApJAVAC1E1c {
        public static void main(String[] args) {
        
        int numeroInicio = 5;                               // Indica valor de inicio
        int numeroFin = 14;                                 // Indica valor de fin
        
        String par = "1";                                   // String para identificar selección "par"
        
        
        System.out.println ("Elija si desea mostrar números pares o impares");

        System.out.println ("Por favor introduzca 1 si desea visualizar números pares, 2 para impares. Luego presione ENTER:");

        String entradaTeclado;                              //Creación de String para alojar lo ingresado por teclado

        Scanner entradaEscaner = new Scanner (System.in);   //Creación de un objeto Scanner

        entradaTeclado = entradaEscaner.nextLine ();        //Invocamos un método sobre un objeto Scanner

        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        
        if (entradaTeclado.equals(par)){
        
        while (numeroInicio <= numeroFin){                  //Realiza el bucle mientras numeroInicio sea menor o igual a numeroFin
                if (numeroInicio % 2 == 0){                 // Valida que el número sea par
                    System.out.println(numeroInicio);       // Imprime valor actual de numeroInicio
                }                      
               
                numeroInicio++;                             //aumenta en una unidad el valor de numeroInicio
        }}
        else {
            while (numeroInicio <= numeroFin){              //Realiza el bucle mientras numeroInicio sea menor o igual a numeroFin
                if (numeroInicio % 2 != 0){                 // Valida que el número sea impar
                    System.out.println(numeroInicio);       // Imprime valor actual de numeroInicio
                }                      
               
                numeroInicio++;                             //aumenta en una unidad el valor de numeroInicio
        }
    
}
    
}
}
