package servicios;

import entidades.Cafetera;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        CafeteraServicio servicio = new CafeteraServicio();
        Cafetera cafetera1 = servicio.crearCafetera();

        servicio.llenarCafetera(cafetera1);
        //System.out.println(cafetera1.toString());
        System.out.print("INGRESE EL TAMAÑO DE LA TAZA: ");
        int taza = entrada.nextInt();
        servicio.servirTaza(cafetera1, taza);
        servicio.vaciarCafetera(cafetera1);
        System.out.print("INGRESE LA CANTIDAD DE CAFE: ");
        int cafe = entrada.nextInt();
        servicio.agregarCafe(cafetera1, cafe);

    }

}
