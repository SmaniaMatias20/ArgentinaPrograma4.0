package servicios;

import entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    public Persona crearPersona() {
        Scanner entrada = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.print("INGRESE EL NOMBRE: ");
        String nombre = entrada.nextLine();
        persona.setNombre(nombre);
        System.out.print("INGRESE LA EDAD: ");
        int edad = entrada.nextInt();
        persona.setEdad(edad);
        System.out.print("INGRESE EL SEXO M/F/O: ");
        String sexo = entrada.next();
        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("O")) {
            persona.setSexo(sexo);
        } else {
            System.out.println("EL SEXO INGRESADO NO ES CORRECTO");
            persona.setSexo("O");
        }
        System.out.print("INGRESE EL PESO: ");
        double peso = entrada.nextDouble();
        persona.setPeso(peso);
        System.out.print("INGRESE LA ALTURA: ");
        double altura = entrada.nextDouble();
        persona.setAltura(altura);

        return persona;
    }

    public boolean esMayorDeEdad(Persona persona) {
        boolean OP;

        OP = persona.getEdad() > 17;

        return OP;
    }

    public int calcularIMC(Persona persona) {
        int i = 0;
        double IMC;

        IMC = persona.getPeso() / ((persona.getAltura() / 100) * (persona.getAltura() / 100));

        if (IMC < 20) {
            i = -1;
        } else {
            if (IMC > 19 && IMC < 26) {
                i = 0;
            } else {
                if (IMC > 25) {
                    i = 1;
                }
            }
        }

        return i;
    }

}
