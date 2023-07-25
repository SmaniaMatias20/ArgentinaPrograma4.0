package servicios;

import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPersona {

    private Scanner entrada;

    public ServicioPersona() {
        this.entrada = new Scanner(System.in);

    }

    public Persona crearPersona() {
        Persona persona = new Persona();

        System.out.print("\nINGRESE SU NOMBRE: ");
        persona.setNombre(entrada.next());
        System.out.print("INGRESE SU EDAD: ");
        persona.setEdad(entrada.nextInt());
        System.out.print("INGRESE SU DINERO DISPONIBLE: ");
        persona.setDinero(entrada.nextInt());

        return persona;
    }
}
