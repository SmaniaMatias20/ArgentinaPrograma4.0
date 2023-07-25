package principal;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import servicios.LavadoraServicio;
import servicios.TelevisorServicio;

public class Principal {

    public static void main(String[] args) {
        int precioElectrodomestico = 0, precioTelevisor = 0, precioLavadora = 0;

        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();

        TelevisorServicio servicio2 = new TelevisorServicio();
        LavadoraServicio servicio = new LavadoraServicio();

        System.out.println("---PRIMER LAVADORA---");
        Lavadora lavadora = servicio.crearLavadora();

        System.out.println("\n---SEGUNDA LAVADORA---");
        Lavadora segundaLavadora = servicio.crearLavadora();

        System.out.println("\n---PRIMER TELEVISOR---");
        Televisor televisor = servicio2.crearTelevisor();

        System.out.println("\n---SEGUNDO TELEVISOR---");
        Televisor segundoTelevisor = servicio2.crearTelevisor();

        listaElectrodomesticos.add(lavadora);
        listaElectrodomesticos.add(segundaLavadora);
        listaElectrodomesticos.add(televisor);
        listaElectrodomesticos.add(segundoTelevisor);

        System.out.println("\n---LISTA DE PRECIOS---");
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            servicio.precioFinal(electrodomestico);
            System.out.println(electrodomestico.toString() + electrodomestico.getPrecio());

        }

        System.out.println("\n---LISTA DE PRECIOS GENERAL---");
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            precioElectrodomestico = precioElectrodomestico + electrodomestico.getPrecio();
            if (electrodomestico.toString().contains("LAVADORA")) {
                precioLavadora = precioLavadora + electrodomestico.getPrecio();
            }
            if (electrodomestico.toString().contains("TELEVISOR")) {
                precioTelevisor = precioTelevisor + electrodomestico.getPrecio();
            }

        }

        System.out.println("EL PRECIO DE LOS ELECTRODOMESTICOS ES: $" + precioElectrodomestico);
        System.out.println("EL PRECIO TOTAL DE LAS LAVADORAS ES: $" + precioLavadora);
        System.out.println("EL PRECIO TOTAL DE LOS TELEVISORES ES: $" + precioTelevisor);
    }

}
