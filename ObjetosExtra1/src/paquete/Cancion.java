package paquete;

import java.util.Scanner;

public class Cancion {

    private String titulo;
    private String autor;

    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void rellenarDatos() {
        Scanner entrada = new Scanner(System.in);
            System.out.print("INGRESE EL TITULO DE LA CANCION: ");
            titulo = entrada.nextLine();
            System.out.print("INGRESE EL AUTOR DE LA CANCION: ");
            autor = entrada.nextLine();
            System.out.println("------------------------------");
    }
    
    public void mostrarDatos(){
        System.out.println("\nEL TITULO DE LA CANCION ES: "+titulo);
        System.out.println("EL AUTOR DE LA CANCION ES: "+autor);
    
    }

}
