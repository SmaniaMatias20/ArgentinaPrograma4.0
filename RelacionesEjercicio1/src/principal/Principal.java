package principal;

import entidades.Perro;
import entidades.Persona;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        Persona primeraPersona = new Persona("Jose", "Gonzalez", 25, "99999999", new Perro("Musa", "Border Collie", 8));
        Persona segundaPersona = new Persona("Claudia", "Gomez", 25, "99999999", new Perro("Negra", "Callejera", 6));

        System.out.println(primeraPersona);
        System.out.println(segundaPersona);

    }

}
