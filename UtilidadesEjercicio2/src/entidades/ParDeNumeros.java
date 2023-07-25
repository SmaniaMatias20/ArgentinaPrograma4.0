
package entidades;

public class ParDeNumeros {
    
    private double primerNumero;
    private double segundoNumero;

    public ParDeNumeros() {
        this.primerNumero=(int)(Math.random()*10);
        this.segundoNumero=(int)(Math.random()*10);
    }

    public double getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
    
    
    
    
    
    
}
