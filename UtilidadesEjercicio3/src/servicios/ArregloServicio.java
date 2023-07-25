package servicios;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ArregloServicio {

    DecimalFormat df = new DecimalFormat("#0.00");

    public float[] inicializarArreglo(float[] arreglo) {

        int tamaño = arreglo.length;

        for (int i = 0; i < tamaño; i++) {
            Arrays.fill(arreglo, i, i + 1, (float) (Math.random() * 100 + 1));
        }
        return arreglo;
    }

    public void mostrarArreglo(float[] arreglo) {

        int tamaño = arreglo.length;

        for (int i = 0; i < tamaño; i++) {

            System.out.println(df.format(arreglo[i]));

        }
    }

    public void ordenarArreglo(float[] arreglo) {

        Arrays.sort(arreglo);
    }

    public float[] inicializarArreglo(float[] arreglo, float[] segundoArreglo) {

        int tamaño = arreglo.length;

        for (int i = 0; i < tamaño; i++) {
            Arrays.fill(arreglo, i, i + 1, segundoArreglo[i]);
            Arrays.fill(arreglo, 10, tamaño, 0.5f);
        }

        return arreglo;
    }

}
