package servicios;

import entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {

    public Raices crearRaiz() {
        Scanner entrada = new Scanner(System.in);
        Raices raiz = new Raices();

        System.out.print("INGRESE EL VALOR DE A: ");
        raiz.setA(entrada.nextInt());
        System.out.print("INGRESE EL VALOR DE B: ");
        raiz.setB(entrada.nextInt());
        System.out.print("INGRESE EL VALOR DE C: ");
        raiz.setC(entrada.nextInt());

        return raiz;
    }

    public double getDiscriminante(Raices raiz) {

        double discriminante = (Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC();

        return discriminante;
    }

    public boolean tieneRaices(Raices raiz) {
        double discriminante = getDiscriminante(raiz); //TRUE SI TIENE DOS SOLUCIONES
        boolean dosSoluciones = discriminante > 0;

        return dosSoluciones;
    }

    public boolean tieneRaiz(Raices raiz) {
        double discriminante = getDiscriminante(raiz); //TRUE SI TIENE UNA SOLUCION
        boolean unaSolucion = discriminante == 0;

        return unaSolucion;
    }

    public void obtenerRaices(Raices raiz) {

        if (tieneRaices(raiz)) {
            System.out.println("SOLUCION 1: " + (-raiz.getB() + Math.sqrt(getDiscriminante(raiz))) / (2 * raiz.getA()));
            System.out.println("SOLUCION 2: " + (-raiz.getB() - Math.sqrt(getDiscriminante(raiz))) / (2 * raiz.getA()));
        }

    }

    public void obtenerRaiz(Raices raiz) {

        if (tieneRaiz(raiz)) {
            System.out.println("SOLUCION: " + (-raiz.getB() + Math.sqrt(getDiscriminante(raiz))) / (2 * raiz.getA()));
            
        }

    }

    public void calcular(Raices raiz) {

        if (!tieneRaices(raiz) && !tieneRaiz(raiz)) {
            System.out.println("ERROR, NO TIENE SOLUCION");
        } else {
            if (tieneRaices(raiz)) {
                obtenerRaices(raiz);
            }

            if (tieneRaiz(raiz)) {
                obtenerRaiz(raiz);
            }
        }
    }

}
