package principal;

import servicios.ArregloServicio;

public class Principal {

    public static void main(String[] args) {

        float[] arregloA = new float[50];
        float[] arregloB = new float[20];

        ArregloServicio servicio = new ArregloServicio();
        servicio.inicializarArreglo(arregloB);
        servicio.mostrarArreglo(arregloB);
        servicio.ordenarArreglo(arregloB);
        System.out.println("------------------");
        System.out.println("ARREGLO B ORDENADO");
        servicio.mostrarArreglo(arregloB);
        System.out.println("------------------");
        System.out.println("ARREGLO A INICIALIZADO");
        servicio.inicializarArreglo(arregloA);
        servicio.mostrarArreglo(arregloA);
        servicio.ordenarArreglo(arregloA);
        System.out.println("------------------");
        System.out.println("ARREGLO A ORDENADO");
        
        servicio.mostrarArreglo(arregloA);

    }

}
