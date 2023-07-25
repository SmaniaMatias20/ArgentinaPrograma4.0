package entidades;

import enumeraciones.SeccionPersonal;

public final class PersonalDeServicio extends Empleado {

    private SeccionPersonal seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(SeccionPersonal seccion, Integer añoIncorporacion, Integer numeroDespacho, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(añoIncorporacion, numeroDespacho, nombre, apellido, documento, estadoCivil);
        this.seccion = seccion;
    }

    public SeccionPersonal getSeccion() {
        return seccion;
    }

    public void setSeccion(SeccionPersonal seccion) {
        this.seccion = seccion;
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
                + estadoCivil + "\nAÑO DE INCORPORACION: " + añoIncorporacion + "\nDNI: " + documento + "\nNUMERO DE DESPACHO: " + numeroDespacho + "\nSECCION: " + seccion;
    }



    
    

    
    
    
    
}
