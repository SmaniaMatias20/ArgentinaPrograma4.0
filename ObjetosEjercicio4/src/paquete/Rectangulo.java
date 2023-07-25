package paquete;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("INGRESE LA BASE DEL RECTANGULO: ");
        base = entrada.nextInt();
        System.out.print("INGRESE LA ALTURA DEL RECTANGULO: ");
        altura = entrada.nextInt();
    }

    public int calcularSuperficie() {
        int superficie;
        superficie = base * altura;

        return superficie;
    }

    public int calcularPerimetro() {
        int perimetro;
        perimetro = (base + altura) * 2;

        return perimetro;
    }

    public void dibujarRectangulo() {
        int i, j;
        for (i = 0; i < base; i++) {
            System.out.print("*");

        }
        System.out.println("");

        for (i = 0; i < altura - 2; i++) {
            System.out.print("*");
            for (j = 0; j < base - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (i = 0; i < base; i++) {
            System.out.print("*");

        }

    }
}
