package principal;

import servicios.AdopcionServicio;
import servicios.PersonaServicio;

public class Principal {

    public static void main(String[] args) {

        AdopcionServicio servicio = new AdopcionServicio();

        servicio.crearListaAdopcion();
        servicio.crearListaAdoptantes();
        servicio.mostrarListaAdopcion();
        servicio.mostrarListaAdoptantes();

        servicio.adoptarPerro();

        servicio.mostrarListaAdopcion();

    }

}
