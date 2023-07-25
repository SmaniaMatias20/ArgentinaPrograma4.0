package entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;
    protected Scanner entrada;

    public Electrodomestico() {

    }

    public Electrodomestico(Integer precio, String color, char consumoEnergetico, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "ELECTRODOMESTICO: $";
    }

}
