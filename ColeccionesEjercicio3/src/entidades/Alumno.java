package entidades;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    ArrayList<Integer> listaNotas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", listaNotas=" + listaNotas + '}';
    }

}
