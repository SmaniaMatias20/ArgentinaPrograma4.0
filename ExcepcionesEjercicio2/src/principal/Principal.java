package principal;

public class Principal {

    public static void main(String[] args) {

        String[] vector = new String[5];

        try {
            System.out.println(vector[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e);
            System.out.println(e.fillInStackTrace());
            System.out.println("\nINDICE DE ARREGLO FUERA DE RANGO");
        }

        System.out.println("PROGRAMA TERMINADO");

    }

}
