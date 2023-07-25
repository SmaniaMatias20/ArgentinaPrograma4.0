package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AdopcionServicio {

    private ArrayList<Perro> listaAdopcion;
    private ArrayList<Persona> listaAdoptantes;
    private Scanner entrada;
    private PersonaServicio personaServicio;
    private PerroServicio perroServicio;

    public AdopcionServicio() {
        this.listaAdopcion = new ArrayList();
        this.listaAdoptantes = new ArrayList();
        this.entrada = new Scanner(System.in);
        this.perroServicio = new PerroServicio();
        this.personaServicio = new PersonaServicio();

    }

    public AdopcionServicio(ArrayList<Perro> listaAdopcion, ArrayList<Persona> listaAdoptantes) {
        this.listaAdopcion = listaAdopcion;
        this.listaAdoptantes = listaAdoptantes;
    }

    public void crearListaAdopcion() {

        System.out.println("\n------------------------------------");
        System.out.println("LLENANDO LISTA DE PERROS EN ADOPCION");
        System.out.println("------------------------------------");
        perroServicio.fabricaPerros(3);

        listaAdopcion.addAll(perroServicio.getListaPerros());
    }

    public void mostrarListaAdopcion() {
        System.out.println("\n---------------------------");
        System.out.println("LISTA DE PERROS EN ADOPCION");
        System.out.println("---------------------------");
        for (Perro perro : listaAdopcion) {
            System.out.println(perro);
        }
    }

    public void crearListaAdoptantes() {

        System.out.println("\n-------------------------------------");
        System.out.println("LLENANDO LISTA DE PERSONAS ADOPTANTES");
        System.out.println("-------------------------------------");
        personaServicio.fabricaPersonas(3);

        listaAdoptantes.addAll(personaServicio.getListaPersonas());
    }

    public void mostrarListaAdoptantes() {
        System.out.println("\n----------------------------");
        System.out.println("LISTA DE PERSONAS ADOPTANTES");
        System.out.println("----------------------------");
        for (Persona persona : listaAdoptantes) {
            System.out.println(persona);
        }
    }

    public void adoptarPerro() {

        for (Persona persona : listaAdoptantes) {
            int bandera = 0;
            System.out.println("\n" + persona.getNombre() + ", ¿CUAL ES EL NOMBRE DEL PERRO QUE QUIERE ADOPTAR?");
            String nombre = entrada.next();

            Iterator<Perro> iterator = listaAdopcion.iterator();
            while (iterator.hasNext()) {
                Perro perro = iterator.next();
                if (nombre.equals(perro.getNombre())) {
                    bandera = 1;
                    persona.setPerro(perro);
                    iterator.remove();
                }
            }
            if(bandera!=1){
                System.out.println("EL NOMBRE DEL PERRO INGRESADO NO SE ENCUENTRA EN LA LISTA O YA HA SIDO ADOPTADO");
            }

        }

        personaServicio.mostrarPersonas();
        perroServicio.mostrarPerros();

    }

}
