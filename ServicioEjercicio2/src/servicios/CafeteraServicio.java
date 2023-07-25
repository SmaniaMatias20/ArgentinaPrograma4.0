package servicios;

import entidades.Cafetera;

public class CafeteraServicio {

    public Cafetera crearCafetera() {
        Cafetera cafetera = new Cafetera();

        cafetera.setCapacidadMaxima(2000);
        cafetera.setCantidadActual(0);

        return cafetera;
    }

    public void llenarCafetera(Cafetera cafetera) {

        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());

    }

    public void servirTaza(Cafetera cafetera, int tamaño) {

        if (tamaño > cafetera.getCantidadActual()) {
            tamaño = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("NO SE LLENO LA TAZA, QUEDÓ EN: " + tamaño + "CC");
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamaño);
            System.out.println("SE LLENO LA TAZA");

        }

    }

    public void vaciarCafetera(Cafetera cafetera) {

        cafetera.setCantidadActual(0);

    }

    public void agregarCafe(Cafetera cafetera, int cafe) {
        if ((cafetera.getCantidadActual()+cafe) > cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual()+cafe);
        }
    }
}
