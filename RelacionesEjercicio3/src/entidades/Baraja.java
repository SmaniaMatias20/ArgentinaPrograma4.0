
package entidades;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> mazo;

    public Baraja() {
        this.mazo = new ArrayList();
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }
    
    

    
    
    
    
    
    
}
