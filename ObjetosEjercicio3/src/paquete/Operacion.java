package paquete;

import java.util.Scanner;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("INGRESE UN NUMERO: ");
        numero1 = entrada.nextInt();
        System.out.print("INGRESE OTRO NUMERO: ");
        numero2 = entrada.nextInt();
    }

    public int sumar() {
        int suma;

        suma = numero1 + numero2;

        return suma;
    }

    public int restar() {
        int resta;

        resta = numero1 - numero2;

        return resta;
    }

    public int multiplicar() {
        int mult;

        if (numero2 == 0 || numero1 == 0) {
            mult = 0;

            System.out.println("\nERROR, NO SE PUEDE MULTIPLICAR POR 0");

        } else {
            mult = numero1 * numero2;
        }

        return mult;
    }

    public int dividir() {
        int div;

        if (numero2 == 0 || numero1 == 0) {
            div = 0;
            System.out.println("\nERROR, NO SE PUEDE DIVIDIR POR 0");
        } else {
            div = numero1 / numero2;
        }

        return div;
    }
}
