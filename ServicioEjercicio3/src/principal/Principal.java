package principal;

import entidades.Persona;
import servicios.PersonaServicio;

public class Principal {

    public static int calcularPorcentaje(int A, int B) {
        int porcentaje;

        porcentaje = (A * 100) / B;

        return porcentaje;
    }

    public static void main(String[] args) {
        int x, mayor = 0, menor = 0, flaco = 0, gordo = 0, salud = 0;
        PersonaServicio servicio = new PersonaServicio();
        boolean[] edades = new boolean[4];
        int[] IMC = new int[4];

        Persona persona1 = servicio.crearPersona();
        edades[0] = servicio.esMayorDeEdad(persona1);
        IMC[0] = servicio.calcularIMC(persona1);
        System.out.println("");

        Persona persona2 = servicio.crearPersona();
        edades[1] = servicio.esMayorDeEdad(persona2);
        IMC[1] = servicio.calcularIMC(persona2);
        System.out.println("");

        Persona persona3 = servicio.crearPersona();
        edades[2] = servicio.esMayorDeEdad(persona3);
        IMC[2] = servicio.calcularIMC(persona3);
        System.out.println("");

        Persona persona4 = servicio.crearPersona();
        edades[3] = servicio.esMayorDeEdad(persona4);
        IMC[3] = servicio.calcularIMC(persona4);
        System.out.println("");

        for (x = 0; x < 4; x++) {

            if (IMC[x] == -1) {
                flaco++;
            } else {
                if (IMC[x] == 0) {
                    salud++;
                } else {
                    if (IMC[x] == 1) {
                        gordo++;
                    }
                }
            }

            if (edades[x] == true) {
                mayor++;
            } else {
                menor++;
            }

        }

        System.out.println("EL PORCENTAJE DE MAYORES DE EDAD ES: " + calcularPorcentaje(mayor, 4) + "%");
        System.out.println("EL PORCENTAJE DE MENORES DE EDAD ES: " + calcularPorcentaje(menor, 4) + "%");
        System.out.println("EL PORCENTAJE DE PERSONAS CON SOBREPESO ES: " + calcularPorcentaje(gordo, 4) + "%");
        System.out.println("EL PORCENTAJE DE PERSONAS SALUDABLES ES: " + calcularPorcentaje(salud, 4) + "%");
        System.out.println("EL PORCENTAJE DE PERSONAS POR DEBAJO DE SU PESO ES: " + calcularPorcentaje(flaco, 4) + "%");
    }

}
