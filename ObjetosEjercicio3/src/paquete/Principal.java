package paquete;

public class Principal {

    public static void main(String[] args) {

        Operacion operacion1 = new Operacion();

        operacion1.crearOperacion();
        System.out.println("\nLA SUMA ES: " + operacion1.sumar());
        System.out.println("\nLA RESTA ES: " + operacion1.restar());
        System.out.println("\nLA DIVISION ES: " + operacion1.dividir());
        System.out.println("\nLA MULTIPLICACION ES: " + operacion1.multiplicar());
    }
}
