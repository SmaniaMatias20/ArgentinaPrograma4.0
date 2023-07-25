package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicio {

    private ArrayList<Perro> listaPerros;
    private Scanner entrada;

    public PerroServicio() {
        this.listaPerros = new ArrayList();
        this.entrada = new Scanner(System.in);
    }

    public PerroServicio(ArrayList<Perro> listaPerros, Scanner entrada) {
        this.listaPerros = listaPerros;
        this.entrada = entrada;
    }

    public ArrayList<Perro> getListaPerros() {
        return listaPerros;
    }

    public void setListaPerros(ArrayList<Perro> listaPerros) {
        this.listaPerros = listaPerros;
    }

    public Perro crearPerro() {
        Perro perro = new Perro();

        System.out.print("\nINGRESE EL NOMBRE: ");
        perro.setNombre(entrada.next());
        System.out.print("INGRESE LA RAZA: ");
        perro.setRaza(entrada.next());
        System.out.print("INGRESE LA EDAD: ");
        perro.setEdad(entrada.nextInt());

        listaPerros.add(perro);

        return perro;
    }

    public void fabricaPerros(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            crearPerro();
        }
    }

    public void mostrarPerros() {
        System.out.println("\n---------------");
        System.out.println("LISTA DE PERROS");
        System.out.println("---------------");
        for (Perro aux : listaPerros) {
            System.out.println(aux);
        }

    }

}
