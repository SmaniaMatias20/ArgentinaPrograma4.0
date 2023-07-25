package entidades;

import java.util.ArrayList;


public class Cine {

    private int precioEntrada;
    private final String[][] sala;
    private Pelicula pelicula;
    private ArrayList<Persona> filaPersonas;

    public Cine(String[][] sala) {
        this.sala = sala;
    }

    public Cine(int precioEntrada, String[][] sala, Pelicula pelicula, ArrayList<Persona> filaPersonas) {
        this.precioEntrada = precioEntrada;
        this.sala = sala;
        this.pelicula = pelicula;
        this.filaPersonas = filaPersonas;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Persona> getFilaPersonas() {
        return filaPersonas;
    }

    public void setFilaPersonas(ArrayList<Persona> filaPersonas) {
        this.filaPersonas = filaPersonas;
    }

    @Override
    public String toString() {
        return "Cine{" + "precioEntrada=" + precioEntrada + ", sala=" + sala + ", pelicula=" + pelicula + ", filaPersonas=" + filaPersonas + '}';
    }

   
    
   
   

   
    
    

}
