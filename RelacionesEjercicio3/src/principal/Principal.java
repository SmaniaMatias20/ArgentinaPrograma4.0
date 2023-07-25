package principal;

import entidades.Baraja;
import entidades.BarajaServicio;

public class Principal {

    public static void main(String[] args) {

        BarajaServicio servicio = new BarajaServicio();
        Baraja baraja = servicio.crearBaraja();

        
        servicio.barajar(baraja);
        
        
        servicio.darCartas(baraja, 12);
        servicio.darCartas(baraja, 4);
        
        servicio.cartasMonton();
        
        servicio.mostrarBaraja();
        servicio.cartasDisponibles();

    }

}
