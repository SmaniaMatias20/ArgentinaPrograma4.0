package principal;

import entidades.Raices;
import servicios.RaicesServicio;

public class Principal {

    public static void main(String[] args) {

        RaicesServicio servicio = new RaicesServicio();
        Raices primerRaiz = servicio.crearRaiz();

        System.out.println("DISCRIMINANTE: " + servicio.getDiscriminante(primerRaiz));
        System.out.println("¿TIENE DOS SOLUCIONES?: " + servicio.tieneRaices(primerRaiz));
        System.out.println("¿TIENE SOLO UNA SOLUCION?: " + servicio.tieneRaiz(primerRaiz));
        
      
        servicio.calcular(primerRaiz);
    }

}
