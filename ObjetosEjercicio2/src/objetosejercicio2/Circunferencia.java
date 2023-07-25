package objetosejercicio2;

import java.util.Scanner;

public class Circunferencia {

    private double radio;    

    public Circunferencia(double radio) { 
        this.radio = radio;

    }

    public double getRadio() {  
        return radio;
    }

    public void setRadio(double radio) {   
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nINGRESE EL RADIO: ");
        radio = entrada.nextDouble();

    }

    public double calcularArea() {
        double area;
        area = 3.14 * radio * radio;

        return area;
    }

    public double calcularPerimetro() {
        double perimetro;
        perimetro = 2 * 3.14 * radio;

        return perimetro;
    }

}
