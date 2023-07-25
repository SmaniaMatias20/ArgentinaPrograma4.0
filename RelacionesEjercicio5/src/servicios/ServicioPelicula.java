package servicios;

import entidades.Pelicula;

public class ServicioPelicula {

    public Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula("HOMBRES DE NEGRO", 3, 18, "WILL SMITH");

        return pelicula;
    }
}
