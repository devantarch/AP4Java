/**
 *
 * @author ilari
 */
public class ApJAVAC3E1b {

    public static void main(String[] args) {

        int vectorDeNumeros [] = new int[]{12,58,9};
        char orden = 'd';
        int contador = 0;

        for (int i=0; i <vectorDeNumeros.length-1; i++) {
            for (int j=0; j <vectorDeNumeros.length-1; j++) {
                switch (orden) {
                    case 'a':
                        if (vectorDeNumeros[j]>vectorDeNumeros[j+1]) {
                            contador = vectorDeNumeros[j];
                            vectorDeNumeros[j] = vectorDeNumeros[j+1];
                            vectorDeNumeros[j+1] = contador;
                        }
                    break;
                    case 'd':
                        if (vectorDeNumeros[j]<vectorDeNumeros[j+1]) {
                            contador = vectorDeNumeros[j];
                            vectorDeNumeros[j] = vectorDeNumeros[j+1];
                            vectorDeNumeros[j+1] = contador;
                        }
                    break;
                    default:
                        System.out.println("No seleccionó un orden correcto, debe elegir (a)scendente o (d)escendente");

                }
            }
        }

        System.out.println("El vector de números ordenado es el siguiente: ");
        for (int i = 0; i < vectorDeNumeros.length; i++) {
            System.out.print("Posición [" + i +"] = " +vectorDeNumeros[i] + ", ");
        }

    }
}