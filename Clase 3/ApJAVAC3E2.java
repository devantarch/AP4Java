/**
 *
 * @author ilari
 */
public class ApJAVAC3E2 {

    public static void main(String[] args) {

        String abecedario = " abcdefghijklmnñopqrstuvwxyz*";
        int desplazamiento = 1;
        String mensaje = "Fin de semana en Carlos Paz";
        String codificado = "";
        String decodificado = "";
        String caracter;

        System.out.println("El mensaje original es: " + mensaje);


            for (int i = 0; i < mensaje.length(); i++) {
                caracter = mensaje.substring(i, i + 1).toLowerCase();
                codificado = codificado + caracter.replace(abecedario.charAt(abecedario.indexOf(caracter)), abecedario.charAt(abecedario.indexOf(caracter) + desplazamiento));
            }
            System.out.println("El mensaje codificado es " + codificado);

            for (int i = 0; i < mensaje.length(); i++) {
                caracter = codificado.substring(i, i + 1).toLowerCase();
                decodificado = decodificado + caracter.replace(abecedario.charAt(abecedario.indexOf(caracter)), abecedario.charAt(abecedario.indexOf(caracter) - desplazamiento));
            }

            System.out.print("El mensaje nuevamente decodificado es: " + decodificado);
        }


    }


