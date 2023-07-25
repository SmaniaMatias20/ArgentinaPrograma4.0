package principal;

import entidades.Alumno;
import servicios.AlumnoServicio;

public class Principal {

    public static void main(String[] args) {
        AlumnoServicio servicio = new AlumnoServicio();
        Alumno alumno = servicio.crearAlumno();
        servicio.agregarAlumnos(alumno);
        servicio.notaFinal(alumno);
    }

}
