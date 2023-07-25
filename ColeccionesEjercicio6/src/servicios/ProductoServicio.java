package servicios;

import entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    HashMap<String, Integer> listaProductos = new HashMap();
    Scanner entrada = new Scanner(System.in);

    public Producto crearProducto() {
        Producto producto = new Producto();

        System.out.print("\nINGRESE EL NOMBRE DEL PRODUCTO: ");
        producto.setNombre(entrada.nextLine());
        System.out.print("INGRESE EL PRECIO DEL PRODUCTO: ");
        producto.setPrecio(entrada.nextInt());

        listaProductos.put(producto.getNombre(), producto.getPrecio());

        return producto;
    }

    public void fabricaProductos() {
        String respuesta;

        do {
            crearProducto();
            System.out.print("\n¿DESEA INGRESAR UN NUEVO PRODUCTO?: ");
            respuesta = entrada.next();
            entrada.nextLine();

        } while (respuesta.equalsIgnoreCase("SI"));

    }

    public void mostrarProductos() {
        System.out.println("\n-----LISTA DE PRODUCTOS-----");
        for (Map.Entry<String, Integer> entry : listaProductos.entrySet()) {
            System.out.println("PRODUCTO: " + entry.getKey() + "\n" + "PRECIO: $"
                    + entry.getValue());
            System.out.println("");
        }

    }

    public void modificarPrecio() {
        int bandera = 0;
        System.out.println("¿QUE PRODUCTO QUERES MODIFICAR?");
        String respuesta = entrada.nextLine();
        for (Map.Entry<String, Integer> entry : listaProductos.entrySet()) {
            if (entry.getKey().equals(respuesta)) {
                bandera = 1;
                System.out.println("¿CUAL ES EL NUEVO PRECIO?");
                entry.setValue(entrada.nextInt());

            } else {

            }
        }

        if (bandera == 0) {
            System.out.println("EL NOMBRE DEL PRODUCTO INGRESADO NO SE ENCUENTRA EN LA LISTA");

        } else {

        }

    }

}
