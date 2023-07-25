package entidades;

import enumeraciones.CursoEstudiante;

public final class Estudiante extends Persona {

    private CursoEstudiante curso;

    public Estudiante() {
    }

    public Estudiante(CursoEstudiante curso, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
        this.curso = curso;
    }

    public CursoEstudiante getCurso() {
        return curso;
    }

    public void setCurso(CursoEstudiante curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + nombre + "\nAPELLIDO: " + apellido + "\nESTADO CIVIL: " + estadoCivil + "\nDNI: " + documento + "\nCURSO: " + curso;
    }

 
}
