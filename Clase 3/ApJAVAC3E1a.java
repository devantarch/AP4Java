/**
 *
 * @author ilari
 */
public class ApJAVAC3E1a {

    public static void main(String[] args) {

        String string = "infinito";
        char letra = 'i';
        String[] deletreada = string.split( "");
        int contador = 0;

        System.out.println("La palabra a analizar es: " + string);
        System.out.println("Tiene " + string.length() + " letras.");
        System.out.println("Estamos buscando la letra: " + letra);

        for (int i=0; i< string.length(); i++) {
            if (string.charAt(i) == letra)  {
                contador = contador + 1;}
            };
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces." );

        }
    }
