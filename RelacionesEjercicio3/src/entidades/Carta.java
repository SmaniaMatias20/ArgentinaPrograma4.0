package entidades;

import enumeraciones.PaloCarta;

public class Carta {
    private int numero;
    private PaloCarta palo;

    public Carta() {
    }

    public Carta(int numero, PaloCarta palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public PaloCarta getPalo() {
        return palo;
    }

    public void setPalo(PaloCarta palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
    
    
}
