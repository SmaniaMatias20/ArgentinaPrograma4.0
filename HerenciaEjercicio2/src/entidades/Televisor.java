package entidades;

public class Televisor extends Electrodomestico {

    private Integer pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer pulgadas, boolean sintonizadorTDT, Integer precio, String color, char consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "TELEVISOR: $";
    }

    
}
