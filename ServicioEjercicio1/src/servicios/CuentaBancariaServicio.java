package servicios;

import entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner entrada = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.print("INGRESE EL NUMERO DE CUENTA: ");
        cuenta.setNumeroCuenta(entrada.nextInt());
        System.out.print("INGRESE EL NUMERO DE DNI: ");
        cuenta.setDniCliente(entrada.nextLong());
        System.out.print("INGRESE EL SALDO DE LA CUENTA: ");
        cuenta.setSaldoActual(entrada.nextInt());

        return cuenta;
    }

    public void ingresar(CuentaBancaria cuenta1) {
        System.out.println("¿CUANTO DINERO DESEA INGRESAR?");
        int ingreso = entrada.nextInt();
        cuenta1.setSaldoActual(cuenta1.getSaldoActual() + ingreso);

    }

    public void retirar(CuentaBancaria cuenta1) {
        System.out.println("¿CUANTO DINERO DESEA RETIRAR?");
        int retiro = entrada.nextInt();
        if (retiro > cuenta1.getSaldoActual()) {
            cuenta1.setSaldoActual(0);
        } else {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retiro);
        }

    }

    public void extraccionRapida(CuentaBancaria cuenta1) {
        System.out.println("¿CUANTO DINERO DESEA RETIRAR?");
        int retiro = entrada.nextInt();
        if (retiro <= (cuenta1.getSaldoActual() * 20) / 100) {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retiro);
        }

    }

    public void consultarSaldo(CuentaBancaria cuenta1) {
        System.out.println("EL SALDO DISPONIBLE ES DE: " + cuenta1.getSaldoActual());

    }

    public void consultarDatos(CuentaBancaria cuenta1) {
        System.out.println("-----------------------------------------");
        System.out.println("NUMERO CUENTA: " + cuenta1.getNumeroCuenta());
        System.out.println("DNI DEL CLIENTE: " + cuenta1.getDniCliente());
        System.out.println("SALDO ACTUAL: " + cuenta1.getSaldoActual());
        System.out.println("-----------------------------------------");

    }

}
