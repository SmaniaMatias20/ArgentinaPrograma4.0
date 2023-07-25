package entidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    Scanner entrada = new Scanner(System.in);

    public Juego() {

    }

    public void inicioJuego() {

        System.out.println("-----ADIVINA EL NUMERO-----");
        int numero = (int) (Math.random() * 500 + 1);

        validarNumero(numero);

    }

    private int ingresarNumero() throws InputMismatchException {

        System.out.print("\nINGRESE EL NUMERO: ");
        int numero = entrada.nextInt();

        return numero;
    }

    private void validarNumero(int numero) {
        boolean bandera = false;
        int contador = 0;
        int numeroIngresado = 0;

        try {
            while (bandera == false) {

                numeroIngresado = ingresarNumero();

                if (numero != numeroIngresado) {
                    if (numero > numeroIngresado) {
                        System.out.println("INTENTE CON UN NUMERO MAS GRANDE");
                        contador++;
                    } else {
                        System.out.println("INTENTE CON UN NUMERO MAS CHICO");
                        contador++;
                    }
                } else {
                    bandera = true;
                }

            }
        } catch (InputMismatchException a) {
            System.out.println("ERROR: DEBE INGRESAR UN NUMERO ");
            contador++;
            System.out.println("CANTIDAD DE INTENTOS: " + contador);
        }

        if (bandera == true) {
            System.out.println("\nEL NUMERO INGRESADO ES CORRECTO...");
            System.out.println("CANTIDAD DE INTENTOS: " + contador);
        }

    }

}
