package servicios;

import entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        String letra;
        for (int i = 0; i < cadena.getLongitud(); i++) {

            letra = cadena.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
                contador++;
            }
        }
        System.out.println("LA CANTIDAD DE VOCALES QUE TIENE LA FRASE ES: " + contador);

    }

    public void invertirFrase(Cadena cadena) {

        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {

            System.out.print(cadena.getFrase().charAt(i));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena cadena) {
        int contador = 0;

        System.out.print("INGRESE UNA LETRA: ");
        String letra = entrada.next();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(cadena.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }
        System.out.println("EL CARACTER " + letra + " SE REPITE: " + contador);
    }

    public void compararLongitud(Cadena cadena) {
        System.out.print("INGRESE UNA FRASE: ");
        entrada.nextLine();
        String frase = entrada.nextLine();

        if (cadena.getFrase().length() != frase.length()) {
            System.out.println("LAS FRASES TIENEN DISTINTA LONGITUD");
        } else {
            System.out.println("LAS FRASES TIENEN LA MISMA LONGITUD");
        }

    }

    public void unirFrases(Cadena cadena) {
        System.out.print("INGRESE UNA FRASE: ");
        String frase = entrada.nextLine();
        System.out.println("AMBAS FRASES UNIDAS: " + cadena.getFrase().concat(" " + frase));

    }

    public void remplazar(Cadena cadena) {
        System.out.print("INGRESE UNA LETRA: ");
        String nuevaCadena = "", letra = entrada.next();

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("A")) {
                nuevaCadena = cadena.getFrase().replace("A", letra).replace("a", letra);
            }
        }
        System.out.print("LA NUEVA CADENA ES: " + nuevaCadena);
        System.out.println("");
    }

    public void contiene(Cadena cadena) {
        boolean contieneLetra;
        System.out.print("INGRESE UNA LETRA: ");
        String letra = entrada.next();

        contieneLetra = cadena.getFrase().contains(letra);
        System.out.println("LA FRASE CONTIENE LA LETRA INGRESADA POR EL USUARIO: " + contieneLetra);

    }

}
