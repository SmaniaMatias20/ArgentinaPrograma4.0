package servicios;

import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicio {

    private ArrayList<Persona> listaPersonas;
    private Scanner entrada;

    public PersonaServicio() {
        this.listaPersonas = new ArrayList();
        this.entrada = new Scanner(System.in);
    }

    public PersonaServicio(ArrayList<Persona> listaPersonas, Scanner entrada) {
        this.listaPersonas = listaPersonas;
        this.entrada = entrada;

    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public Persona crearPersona() {
        Persona persona = new Persona();

        System.out.print("\nINGRESE EL NOMBRE: ");
        persona.setNombre(entrada.next());
        System.out.print("INGRESE EL APELLIDO: ");
        persona.setApellido(entrada.next());
        System.out.print("INGRESE LA EDAD: ");
        persona.setEdad(entrada.nextInt());
        System.out.print("INGRESE EL DNI: ");
        persona.setDni(entrada.next());

        listaPersonas.add(persona);

        return persona;
    }

    public void fabricaPersonas(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            crearPersona();
        }
    }

    public void mostrarPersonas() {
        System.out.println("\n-----------------");
        System.out.println("LISTA DE PERSONAS");
        System.out.println("-----------------");
        for (Persona aux : listaPersonas) {
            System.out.println(aux);
        }
    }

}
