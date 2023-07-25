package objetosejercicio2;

public class Principal {

    public static void main(String[] args) {
        Circunferencia objeto1 = new Circunferencia(89.13);

        objeto1.crearCircunferencia();
        System.out.println("\nEL RADIO DEL OBJETO1 ES: " + objeto1.getRadio());
        System.out.println("EL AREA DEL OBJETO1 ES: " + objeto1.calcularArea());
        System.out.println("EL PERIMETRO DEL OBJETO1 ES: " + objeto1.calcularPerimetro());
        
        Circunferencia objeto2 = new Circunferencia(89.13);

        objeto2.crearCircunferencia();
        System.out.println("\nEL RADIO DEL OBJETO2 ES: " + objeto2.getRadio());
        System.out.println("EL AREA DEL OBJETO2 ES: " + objeto2.calcularArea());
        System.out.println("EL PERIMETRO DEL OBJETO2 ES: " + objeto2.calcularPerimetro());

    }

}
