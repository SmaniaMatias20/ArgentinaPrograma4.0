package Principal;

import entidades.CuentaBancaria;
import servicios.CuentaBancariaServicio;

public class Principal {

    public static void main(String[] args) {
        CuentaBancariaServicio cuentaServicio = new CuentaBancariaServicio();

        CuentaBancaria cuenta1 = cuentaServicio.crearCuenta();
        //System.out.println(cuenta1.toString()); PARA CHEQUEAR QUE FUNCIONEN LOS METODOS
        cuentaServicio.ingresar(cuenta1);
        cuentaServicio.retirar(cuenta1);
        cuentaServicio.extraccionRapida(cuenta1);
        cuentaServicio.consultarSaldo(cuenta1);
        cuentaServicio.consultarDatos(cuenta1);

    }

}
