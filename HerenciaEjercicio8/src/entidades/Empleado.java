package entidades;

public class Empleado extends Persona {

    protected Integer añoIncorporacion;
    protected Integer numeroDespacho;

    public Empleado() {
    }

    public Empleado(Integer añoIncorporacion, Integer numeroDespacho, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    

}
