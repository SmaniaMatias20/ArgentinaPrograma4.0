package entidades;

import interfaces.calculosFormas;
import java.text.DecimalFormat;

public class Rectangulo implements calculosFormas {

    private Integer base;
    private Integer altura;
    DecimalFormat formato = new DecimalFormat("#");

    public Rectangulo() {
    }

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double areaRectangulo = base * altura;

        System.out.println("EL AREA DEL RECTANGULO ES: " + (int)areaRectangulo);
    }

    @Override
    public void calcularPerimetro() {
        double perimetroRectangulo = (base + altura) * 2;

        System.out.println("EL PERIMETRO DE UN RECTANGULO ES: " + (int)perimetroRectangulo);
    }

}
