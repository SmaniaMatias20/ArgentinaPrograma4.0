package principal;

import servicios.ProductoServicio;

public class Principal {

    public static void main(String[] args) {
     
        ProductoServicio servicio = new ProductoServicio();
        
        servicio.fabricaProductos();
        servicio.mostrarProductos();
        servicio.modificarPrecio();
        servicio.mostrarProductos();
        
    }
    
}
