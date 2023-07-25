package principal;

import entidades.Cadena;
import servicios.CadenaServicio;

public class Principal {

    public static void main(String[] args) {

        CadenaServicio servicio = new CadenaServicio();
        Cadena cadena = new Cadena("la academia");
        
        System.out.println("LA FRASE ES: "+cadena.getFrase());
        servicio.mostrarVocales(cadena);
        System.out.print("LA FRASE INVERTIDA: ");
        servicio.invertirFrase(cadena);
        servicio.vecesRepetido(cadena);
        servicio.compararLongitud(cadena);
        servicio.unirFrases(cadena);
        servicio.remplazar(cadena);
        servicio.contiene(cadena);

    }

}
