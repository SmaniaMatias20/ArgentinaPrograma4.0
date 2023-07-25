package servicios;

import entidades.Cine;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCine {

    private Scanner entrada;
    private ServicioPersona servicioPersona;
    private ServicioPelicula servicioPelicula;
    private ArrayList<Persona> listaPersonas;

    public ServicioCine() {
        this.entrada = new Scanner(System.in);
        this.servicioPelicula = new ServicioPelicula();
        this.servicioPersona = new ServicioPersona();
        this.listaPersonas = new ArrayList();
    }

    public Cine crearCine() {
        System.out.println("------------------------------------------------------");
        System.out.println("-----------------------GRILLA-------------------------");
        System.out.println("------------------------------------------------------");
        String[][] sala = abrirSala();
        Cine cine = new Cine(sala);
        cine.setPelicula(servicioPelicula.crearPelicula());
        System.out.println("\n" + cine.getPelicula());
        cine.setPrecioEntrada(500);
        System.out.println("\nPRECIO DE LA ENTRADA: $" + cine.getPrecioEntrada());
        crearFilaPersonas(3);
        cine.setFilaPersonas(listaPersonas);
        mostrarFilaPersonas(listaPersonas);
        return cine;
    }

//    public void crearFuncion() {
//        crearCine();
//        comprarEntrada();
//    }

    public String[][] abrirSala() {
        String[][] sala = new String[8][6];
        int asiento = 9;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                asiento++;
                String cadena = Integer.toString(asiento);
                sala[i][j] = cadena + "A";
            }
        }
        return sala;
    }

    public void mostrarSala(String[][] sala) {
        System.out.println("\n----------------------------------------------------");
        System.out.println("-----------------------SALA A-----------------------");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" | " + sala[i][j] + " | ");
            }
            System.out.println(" ");

        }

    }

    public void crearFilaPersonas(int cantidad) {
        System.out.println("\n-------------------------------");
        System.out.println("REGISTRO EN LA FILA DE PERSONAS");
        System.out.println("-------------------------------");

        for (int i = 0; i < cantidad; i++) {
            Persona persona = servicioPersona.crearPersona();
            listaPersonas.add(persona);

        }
    }

    public void mostrarFilaPersonas(ArrayList<Persona> listaPersonas) {
        System.out.println("\n---------------------------");
        System.out.println("FILA DE PERSONAS EN EL CINE");
        System.out.println("---------------------------");
        for (Persona aux : listaPersonas) {
            System.out.println(aux);
        }
    }

    public void comprarEntrada() {
        System.out.println("\n-----------------");
        System.out.println("VENTA DE ENTRADAS");
        System.out.println("------------------");
        String[][] sala = abrirSala();

        for (Persona persona : listaPersonas) {
            int bandera = 0;
            while (bandera == 0) {
                if (persona.getEdad() > 17 && persona.getDinero() > 499) {
                    mostrarSala(sala);
                    System.out.println("\n" + persona.getNombre() + ", ¿QUE ASIENTO ELIGE COMPRAR?");
                    String respuesta = entrada.next();
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (sala[i][j].equalsIgnoreCase(respuesta)) {
                                sala[i][j] = " X ";
                                bandera = 1;
                            }
                        }
                    }
                    if (bandera == 0) {
                        System.out.println("\nEL ASIENTO ELEGIDO NO EXISTE O YA HA SIDO COMPRADO");
                    }

                } else {
                    if (persona.getEdad() < 18) {
                        System.out.println("\n" + persona.getNombre() + ", ES MENOR DE EDAD");
                        bandera = 1;
                    }
                    if (persona.getDinero() < 500) {
                        System.out.println("\n" + persona.getNombre() + ", NO TIENE EL DINERO SUFICIENTE PARA COMPRAR LA ENTRADA");
                        bandera = 1;
                    }
                }

            }
        }

    }
}
