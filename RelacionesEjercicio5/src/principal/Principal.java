package principal;

import servicios.ServicioCine;

public class Principal {

    public static void main(String[] args) {

        ServicioCine servicio = new ServicioCine();

          servicio.crearCine();
          servicio.comprarEntrada();
        

    }

}
