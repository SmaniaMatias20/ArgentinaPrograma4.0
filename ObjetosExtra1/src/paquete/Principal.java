
package paquete;

public class Principal {

    public static void main(String[] args) {
       Cancion tema1 = new Cancion();
       
       tema1.rellenarDatos();
       tema1.mostrarDatos();
       
       Cancion tema2 = new Cancion("VIEJO KARMA","LAS PASTILLAS DEL ABUELO");
       
       tema2.mostrarDatos();
    }
    
}
