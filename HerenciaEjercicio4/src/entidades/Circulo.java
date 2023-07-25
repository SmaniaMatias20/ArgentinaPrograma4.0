package entidades;

import interfaces.calculosFormas;
import java.text.DecimalFormat;

public class Circulo implements calculosFormas {

    private Integer radio;
    private Integer diametro;
    DecimalFormat formato = new DecimalFormat("#.00");

    public Circulo() {
    }

    public Circulo(Integer radio, Integer diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public void calcularArea() {
        double areaCirculo = PI * (radio * radio);

        System.out.println("EL AREA DEL CIRCULO ES: " + formato.format(areaCirculo));
    }

    @Override
    public void calcularPerimetro() {
        double perimetroCirculo = PI * diametro;

        System.out.println("EL PERIMETRO DEL CIRCULO ES: " + formato.format(perimetroCirculo));
    }

}
