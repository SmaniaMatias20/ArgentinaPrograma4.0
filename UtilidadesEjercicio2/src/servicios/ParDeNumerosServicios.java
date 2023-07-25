package servicios;

import entidades.ParDeNumeros;


public class ParDeNumerosServicios {

    public ParDeNumeros crearObjeto() {
        ParDeNumeros objetoNumero = new ParDeNumeros();

        return objetoNumero;
    }

    public void mostrarValores(ParDeNumeros objetoNumero) {
        System.out.println("EL VALOR DEL PRIMER NUMERO ES: " + objetoNumero.getPrimerNumero());
        System.out.println("EL VALOR DEL SEGUNDO NUMERO ES: " + objetoNumero.getSegundoNumero());

    }

    public void devolverMayor(ParDeNumeros objetoNumero) {
        double numeroMayor;

        System.out.println("EL NUMERO MAYOR ES: " + Math.max(objetoNumero.getPrimerNumero(), objetoNumero.getSegundoNumero()));
    }

    public void calcularPotencia(ParDeNumeros objetoNumero) {
        double numeroMayor = Math.max(objetoNumero.getPrimerNumero(), objetoNumero.getSegundoNumero());
        double numeroMenor = Math.min(objetoNumero.getPrimerNumero(), objetoNumero.getSegundoNumero());
        double potencia = Math.pow(numeroMayor, numeroMenor);
        System.out.println("LA POTENCIA DEL NUMERO MAYOR ELEVADO AL NUMERO MENOR ES: " + potencia);
    }

    public void calcularRaiz(ParDeNumeros objetoNumero) {
        double numeroMenor = Math.min(objetoNumero.getPrimerNumero(), objetoNumero.getSegundoNumero());
        numeroMenor = Math.abs(numeroMenor);
        double raizCuadrada = Math.sqrt(numeroMenor);
        System.out.println("LA RAIZ CUADRADA DE "+numeroMenor+" ES: "+raizCuadrada);
    }

}
