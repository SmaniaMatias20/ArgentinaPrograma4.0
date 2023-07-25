package paquete;

import java.util.Scanner;

public class Cuenta {

    private String titular;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void retirarDinero() {
        Scanner entrada = new Scanner(System.in);
        String op;
        System.out.println("------------------------------");
        System.out.println("NOMBRE DE LA CUENTA: " + titular);
        System.out.println("SALDO: $" + saldo);
        System.out.println("------------------------------");

        System.out.println("\n¿DESEA RETIRAR DINERO? SI/NO");
        op = entrada.next();
        while (op.equalsIgnoreCase("SI") && saldo > 0) {
            System.out.println("¿CUANTO DINERO DESEA RETIRAR?");
            int retiro = entrada.nextInt();

            if (retiro <= saldo) {
                saldo = saldo - retiro;
                System.out.println("\nSU SALDO ACTUAL ES DE: $" + saldo);

            } else {
                System.out.println("EL  NUMERO INGRESADO SUPERA EL SALDO DE SU CUENTA");
            }

            if (saldo > 0) {
                System.out.println("\n¿DESEA RETIRAR DINERO? SI/NO");
                op = entrada.next();
            }
        }
        System.out.println("------------------------------");
        System.out.println("NOMBRE DE LA CUENTA: " + titular);
        System.out.println("SALDO: $" + saldo);
        System.out.println("------------------------------");
    }
}
