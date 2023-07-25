package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {

    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    private Scanner entrada;

    public AlumnoServicio() {
        this.entrada = new Scanner(System.in);
    }

    public Alumno crearAlumno() {

        Alumno alumno = new Alumno(); //INSTANCIAMOS EL ALUMNO Y LLENAMOS SUS DATOS
        System.out.print("INGRESE EL NOMBRE DEL ALUMNO: ");
        alumno.setNombre(entrada.next());
        System.out.print("INGRESE LA PRIMER NOTA DEL ALUMNO: ");
        alumno.getListaNotas().add(entrada.nextInt());
        System.out.print("INGRESE LA SEGUNDA NOTA DEL ALUMNO: ");
        alumno.getListaNotas().add(entrada.nextInt());
        System.out.print("INGRESE LA TERCER NOTA DEL ALUMNO: ");
        alumno.getListaNotas().add(entrada.nextInt());

        return alumno;
    }

    public void agregarAlumnos(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    public void notaFinal(Alumno alumno) {
        int promedio, acumulador = 0;

        System.out.println("INGRESE EL NOMBRE DEL ALUMNO");
        String nombre = entrada.next();

        for (Alumno aux : listaAlumnos) {
            if (nombre.equalsIgnoreCase(aux.getNombre())) {
                for (Integer var : alumno.getListaNotas()) {
                    acumulador = acumulador + var;
                }
                promedio = (acumulador / alumno.getListaNotas().size());
                System.out.println("EL PROMEDIO DEL ALUMNO ES " + promedio);

            } else {
                System.out.println("EL NOMBRE INGRESADO NO SE ENCUENTRA EN LA LISTA DE ALUMNOS");

            }
        }

    }

}
