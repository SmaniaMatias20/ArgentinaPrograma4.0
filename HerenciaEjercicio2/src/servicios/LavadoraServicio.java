package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;

public class LavadoraServicio extends ElectrodomesticoServicio {

    public LavadoraServicio() {

    }

    public Lavadora crearLavadora() {
        Electrodomestico electrodomestico = crearElectrodomestico();
        System.out.print("INGRESE LA CARGA: ");
        Lavadora lavadora = new Lavadora(entrada.nextInt(), electrodomestico.getPrecio(), electrodomestico.getColor(), electrodomestico.getConsumoEnergetico(), electrodomestico.getPeso());

        return lavadora;
    }

    public void precioFinal(Lavadora lavadora) {
        ElectrodomesticoServicio servicio = new ElectrodomesticoServicio();

        lavadora.setPrecio(servicio.precioFinal(lavadora));

        if (lavadora.getCarga() > 30) {
            lavadora.setPrecio(lavadora.getPrecio() + 500);
        }

    }

    public void mostrarLavadora(Lavadora lavadora) {
        System.out.println(lavadora);
    }
}
