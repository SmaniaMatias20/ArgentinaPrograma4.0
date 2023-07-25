package paquete;

import java.util.Scanner;

public class Juego {

    private int jugador1;
    private int jugador2;
    private final int cantidadIntentos;

    public Juego() {
        this.jugador1 = 0;
        this.jugador2 = 0;
        this.cantidadIntentos = 3;
    }

    public Juego(int jugador1, int jugador2, int cantidadIntentos) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.cantidadIntentos = cantidadIntentos;
    }

    public void iniciar_juego() {
        Scanner entrada = new Scanner(System.in);
        int intentos = 0;
        int bandera = 1;

        while (bandera == 1) {
            bandera = 2;
            System.out.println("---JUEGO ADIVINA EL NUMERO (MAXIMO 3 INTENTOS)---");
            System.out.print("\nJUGADOR 1, INGRESE UN NUMERO: ");
            int numero = (int) (Math.random() * 10 + 1);
            System.out.println(numero);   //CHEQUEAR NUMERO INGRESADO

            while (bandera == 2) {
                System.out.print("JUGADOR 2, INTENTE ADIVINAR EL NUMERO: ");
                int numero2 = entrada.nextInt();

                if (numero2 == numero) {
                    bandera = 1;
                } else {
                    if (numero2 > numero) {
                        intentos++;
                        System.out.println("PISTA, EL NUMERO ES MAS CHICO");
                        System.out.println("-----------------------------");
                    } else {
                        intentos++;
                        System.out.println("PISTA, EL NUMERO ES MAS GRANDE");
                        System.out.println("------------------------------");
                    }
                }

            }
            if (bandera == 1 && intentos <= cantidadIntentos) {
                System.out.println("\nGANASTE, EL NUMERO ES CORRECTO");
                jugador2++;
            } else {
                System.out.println("\nEL NUMERO ES CORRECTO, PERO SUPERASTE LA CANTIDAD DE INTENTOS");
                jugador1++;
            }
            System.out.println("\n¿DESEA VOLVER A JUGAR? SI/NO");
            Scanner ingreso = new Scanner(System.in);
            String opcion = ingreso.next();

            if (opcion.equalsIgnoreCase("SI")) {
                bandera = 1;
            } else {
                bandera = 3;

            }

        }

        System.out.println("--------------------------------------------");
        System.out.println("EL JUGADOR 1 HA GANADO " + jugador1 + " VECES");
        System.out.println("EL JUGADOR 2 HA GANADO " + jugador2 + " VECES");

    }

}
