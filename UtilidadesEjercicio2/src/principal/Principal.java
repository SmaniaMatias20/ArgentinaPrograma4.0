package principal;

import entidades.ParDeNumeros;
import servicios.ParDeNumerosServicios;

public class Principal {
    
    public static void main(String[] args) {
        
        ParDeNumerosServicios servicio = new ParDeNumerosServicios();
        ParDeNumeros primerObjeto = servicio.crearObjeto();
        servicio.mostrarValores(primerObjeto);
        servicio.devolverMayor(primerObjeto);
        servicio.calcularPotencia(primerObjeto);
        servicio.calcularRaiz(primerObjeto);
        
    }
    
}
