/**
 *
 * @author ilari
 */
public class ApJAVAC3E1c {

    public static void main(String[] args) {

        int vectorDeNumeros [] = new int[]{12,58,9};
        int referencia = 9;
        int suma = 0;

        for (int i=0; i< vectorDeNumeros.length-1; i++){
            if (vectorDeNumeros[i] > referencia) {
                suma = suma + vectorDeNumeros[i];
            }
        }

        System.out.println("La suma de los números que son mayores que " + referencia + " da como resultado " + suma +".");

    }
}