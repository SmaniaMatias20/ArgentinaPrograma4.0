package paquete;

public class Principal {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();

        rectangulo1.crearRectangulo();
        System.out.println("EL PERIMETRO DEL RECTANGULO1 ES: " + rectangulo1.calcularPerimetro());
        System.out.println("LA SUPERFICIE DEL RECTANGULO1 ES: " + rectangulo1.calcularSuperficie());
        rectangulo1.dibujarRectangulo();

        Rectangulo rectangulo2 = new Rectangulo();

        System.out.println("");
        rectangulo2.crearRectangulo();
        System.out.println("EL PERIMETRO DEL RECTANGULO2 ES: " + rectangulo2.calcularPerimetro());
        System.out.println("LA SUPERFICIE DEL RECTANGULO2 ES: " + rectangulo2.calcularSuperficie());
        rectangulo2.dibujarRectangulo();

    }
}
