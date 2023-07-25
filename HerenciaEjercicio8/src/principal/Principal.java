package principal;

import servicios.ServicioEstudiante;
import servicios.ServicioPersonalDeServicio;
import servicios.ServicioProfesor;

public class Principal {

    public static void main(String[] args) {

       ServicioEstudiante servicio = new ServicioEstudiante();
     servicio.crearGrupoEstudiantes();
       servicio.mostrarListaEstudiantes();
       servicio.matriculacionCurso();


//    ServicioProfesor servicio = new ServicioProfesor();
//    servicio.crearGrupoProfesores();
//    servicio.mostrarListaProfesores();
//    servicio.crearProfesor();
//    servicio.mostrarListaProfesores();

//    ServicioPersonalDeServicio servicio = new ServicioPersonalDeServicio();
//    servicio.crearGrupoPersonalDeServicio();
//    servicio.mostrarListaDePersonalDeServicio();
//    servicio.reasignacionDespacho();
//    servicio.mostrarListaDePersonalDeServicio();
//    servicio.trasladoSeccion();
//    servicio.mostrarListaDePersonalDeServicio();
    
    
    
    
    }

}
