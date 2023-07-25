package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {

            System.out.print("INGRESE UN NUMERO: ");
            int primerNumero = entrada.nextInt();
            System.out.print("INGRESE OTRO NUMERO: ");
            int segundoNumero = entrada.nextInt();

//            int a = Integer.parseInt(primerNumero);
//            int b = Integer.parseInt(segundoNumero);
            int resultado = primerNumero / segundoNumero;
            System.out.println("EL RESULTADO ES: " + resultado);

        } catch (InputMismatchException a) {
            System.out.println("ERROR: AL INGRESAR POR TECLADO");
        } catch (ArithmeticException b) {
            System.out.println("ERROR: NO SE PUEDE DIVIDIR POR CERO");
        } catch (NumberFormatException c) {
            System.out.println("ERROR: LA CADENA NO PUEDE CONVERTIRSE A ENTERO");
        }

    }

}
