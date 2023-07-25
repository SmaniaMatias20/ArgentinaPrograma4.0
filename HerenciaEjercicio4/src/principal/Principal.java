package principal;

import entidades.Circulo;
import entidades.Rectangulo;


public class Principal {

    public static void main(String[] args) {
        
        
        
        Circulo circulo = new Circulo(15, 20);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        
        System.out.println("--------------------------------------");
        
        Rectangulo rectangulo = new Rectangulo(156, 52);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        
    }
    
}
