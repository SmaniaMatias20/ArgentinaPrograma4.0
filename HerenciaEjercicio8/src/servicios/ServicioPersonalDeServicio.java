package servicios;

import entidades.PersonalDeServicio;
import enumeraciones.SeccionPersonal;
import interfaces.AccionEmpleado;
import interfaces.AccionPersona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPersonalDeServicio implements AccionPersona, AccionEmpleado {

    private ArrayList<PersonalDeServicio> listaPersonalDeServicio;
    private Scanner entrada;

    public ServicioPersonalDeServicio() {
        this.listaPersonalDeServicio = new ArrayList();
        this.entrada = new Scanner(System.in);

    }

    public PersonalDeServicio crearPersonalDeServicio() {
        PersonalDeServicio personal = new PersonalDeServicio();

        System.out.print("INGRESE SU NOMBRE: ");
        personal.setNombre(entrada.next());
        System.out.print("INGRESE SU APELLIDO: ");
        personal.setApellido(entrada.next());
        System.out.print("INGRESE SU DNI: ");
        personal.setDocumento(entrada.nextInt());
        System.out.print("INGRESE SU ESTADO CIVIL: ");
        personal.setEstadoCivil(entrada.next());
        System.out.print("INGRESE SU AÑO DE INCORPORACION: ");
        personal.setAñoIncorporacion(entrada.nextInt());
        System.out.print("INGRESE SU NUMERO DE DESPACHO: ");
        personal.setNumeroDespacho(entrada.nextInt());
        System.out.print("INGRESE SU SECCION: ");
        elegirSecciones(personal);

        listaPersonalDeServicio.add(personal);

        return personal;
    }

    public void crearGrupoPersonalDeServicio() {
        PersonalDeServicio personal = new PersonalDeServicio(SeccionPersonal.RECTORIA, 2020, 1000, "PABLO", "ROJO", 42520635, "CASADO");
        PersonalDeServicio personal2 = new PersonalDeServicio(SeccionPersonal.BIBLIOTECA, 2018, 1001, "ESTEBAN", "RODRIGUEZ", 20349856, "SOLTERO");
        PersonalDeServicio personal3 = new PersonalDeServicio(SeccionPersonal.COMEDOR, 2013, 1002, "JULIETA", "CHAVEZ", 23639874, "VIUDA");
        PersonalDeServicio personal4 = new PersonalDeServicio(SeccionPersonal.SECRETARIA, 2017, 1003, "PAULA", "ROJAS", 25632419, "DIVORCIADA");
        PersonalDeServicio personal5 = new PersonalDeServicio(SeccionPersonal.BIBLIOTECA, 2015, 1004, "ROMINA", "GIMENEZ", 35621489, "SOLTERA");

        listaPersonalDeServicio.add(personal);
        listaPersonalDeServicio.add(personal2);
        listaPersonalDeServicio.add(personal3);
        listaPersonalDeServicio.add(personal4);
        listaPersonalDeServicio.add(personal5);

    }

    public void mostrarListaDePersonalDeServicio() {
        System.out.println("-----LISTA DEL PERSONAL DE SERVICIO-----");

        for (PersonalDeServicio personalDeServicio : listaPersonalDeServicio) {
            System.out.println("\n" + personalDeServicio);
            System.out.println("");
        }

    }

    private void menuSecciones() {
        System.out.println("\n---MENU SECCIONES");
        System.out.println("-RECTORIA");
        System.out.println("-COMEDOR");
        System.out.println("-SECRETARIA");
        System.out.println("-BIBLIOTECA");

    }

    private void elegirSecciones(PersonalDeServicio personal) {
        boolean bandera = false;
        while (bandera == false) {
            menuSecciones();
            String opcion = entrada.next();

            switch (opcion.toUpperCase()) {
                case "RECTORIA":
                    personal.setSeccion(SeccionPersonal.RECTORIA);
                    bandera = true;
                    break;
                case "BIBLIOTECA":
                    personal.setSeccion(SeccionPersonal.BIBLIOTECA);
                    bandera = true;
                    break;
                case "COMEDOR":
                    personal.setSeccion(SeccionPersonal.COMEDOR);
                    bandera = true;
                    break;
                case "SECRETARIA":
                    personal.setSeccion(SeccionPersonal.SECRETARIA);
                    bandera = true;
                    break;
                default:
                    System.out.println("ERROR, LA SECCION INGRESADA NO EXISTE...");

            }

        }
    }

    public void trasladoSeccion() {
        String respuesta = "NO";
        boolean bandera;
        for (PersonalDeServicio personal : listaPersonalDeServicio) {
            System.out.println(personal.getApellido() + " " + personal.getNombre() + ", ¿DESEA CAMBIAR DE SECCION?");
            respuesta = entrada.next();
            bandera = false;

            if (respuesta.equalsIgnoreCase("SI")) {
                elegirSecciones(personal);
            }

        }
    }

    @Override
    public void cambioEstadoCivil() {
        String respuesta = "NO";
        boolean bandera;
        for (PersonalDeServicio personal : listaPersonalDeServicio) {
            System.out.println(personal.getApellido() + " " + personal.getNombre() + ", ¿NECESITA CAMBIAR SU ESTADO CIVIL?");
            respuesta = entrada.next();
            bandera = false;

            if (respuesta.equalsIgnoreCase("SI")) {
                while (bandera == false) {
                    System.out.println("\n¿CUAL ES SU ESTADO CIVIL?");
                    System.out.println("-SOLTERO");
                    System.out.println("-CASADO");
                    System.out.println("-DIVORCIADO");
                    System.out.println("-VIUDO");
                    String opcion = entrada.next();

                    switch (opcion.toUpperCase()) {
                        case "SOLTERO":
                            personal.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        case "CASADO":
                            personal.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        case "DIVORCIADO":
                            personal.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        case "VIUDO":
                            personal.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        default:
                            System.out.println("ERROR, EL ESTADO CIVIL INGRESADO NO EXISTE...");

                    }

                }

            }

        }
    }

    @Override
    public void reasignacionDespacho() {
        String respuesta = "NO";
        boolean bandera;
        for (PersonalDeServicio personal : listaPersonalDeServicio) {
            System.out.println(personal.getApellido() + " " + personal.getNombre() + ", ¿QUIERE CABIAR SU NUMERO DE DESPACHO?");
            respuesta = entrada.next();

            if (respuesta.equalsIgnoreCase("SI")) {
                personal.setNumeroDespacho((int) (Math.random() * 10000));

            }

        }
    }
}
