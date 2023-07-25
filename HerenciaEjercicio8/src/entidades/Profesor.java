package entidades;

import enumeraciones.DepartamentoProfesor;

public final class Profesor extends Empleado {

    private DepartamentoProfesor departamento;

    public Profesor() {
    }

    public Profesor(DepartamentoProfesor departamento, Integer añoIncorporacion, Integer numeroDespacho, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(añoIncorporacion, numeroDespacho, nombre, apellido, documento, estadoCivil);
        this.departamento = departamento;
    }

    public DepartamentoProfesor getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepartamentoProfesor departamento) {
        this.departamento = departamento;
    }

    public Integer getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public void setAñoIncorporacion(Integer añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }

    public Integer getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(Integer numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
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
        return "NOMBRE: " + nombre + "\nAPELLIDO: " + apellido + "\nESTADO CIVIL: "
                + estadoCivil + "\nAÑO DE INCORPORACION: " + añoIncorporacion + "\nDNI: " + documento + "\nDEPARTAMENTO: " + departamento + "\nNUMERO DE DESPACHO: " + numeroDespacho;
    }



}
