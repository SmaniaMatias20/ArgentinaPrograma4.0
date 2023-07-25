package servicios;

import entidades.Profesor;
import enumeraciones.DepartamentoProfesor;
import interfaces.AccionEmpleado;
import interfaces.AccionPersona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioProfesor implements AccionPersona, AccionEmpleado {

    private ArrayList<Profesor> listaProfesores;
    private Scanner entrada;

    public ServicioProfesor() {
        this.listaProfesores = new ArrayList();
        this.entrada = new Scanner(System.in);
    }

    public Profesor crearProfesor() {
        Profesor profesor = new Profesor();

        System.out.print("INGRESE SU NOMBRE: ");
        profesor.setNombre(entrada.next());
        System.out.print("INGRESE SU APELLIDO: ");
        profesor.setApellido(entrada.next());
        System.out.print("INGRESE SU DNI: ");
        profesor.setDocumento(entrada.nextInt());
        System.out.print("INGRESE SU ESTADO CIVIL: ");
        profesor.setEstadoCivil(entrada.next());
        System.out.print("INGRESE SU AÑO DE INCORPORACION: ");
        profesor.setAñoIncorporacion(entrada.nextInt());
        System.out.print("INGRESE SU NUMERO DE DESPACHO: ");
        profesor.setNumeroDespacho(entrada.nextInt());
        System.out.println("INGRESE SU DEPARTAMENTO");
        elegirDepartamento(profesor);

        listaProfesores.add(profesor);

        return profesor;
    }

    public void crearGrupoProfesores() {
        Profesor profesor1 = new Profesor(DepartamentoProfesor.LENGUAJES, 2021,
                2000, "ROBERTO", "BUSTAMANTE", 11111111, "CASADO");

        Profesor profesor2 = new Profesor(DepartamentoProfesor.INGENIERIA, 2015,
                2001, "ALEJANDRO", "GOMEZ", 22222222, "CASADO");

        Profesor profesor3 = new Profesor(DepartamentoProfesor.MATEMATICAS, 2018,
                2002, "JULIAN", "GONZALEZ", 33333333, "SOLTERO");

        Profesor profesor4 = new Profesor(DepartamentoProfesor.MEDICINA, 2017,
                2003, "JORGE", "ALVAREZ", 44444444, "CASADO");

        Profesor profesor5 = new Profesor(DepartamentoProfesor.LENGUAJES, 2022,
                2004, "RODRIGO", "PEREZ", 55555555, "SOLTERO");

        listaProfesores.add(profesor1);
        listaProfesores.add(profesor2);
        listaProfesores.add(profesor3);
        listaProfesores.add(profesor4);
        listaProfesores.add(profesor5);

    }

    public void mostrarListaProfesores() {
        System.out.println("\n-----LISTA DE PROFESORES-----");

        for (Profesor profesor : listaProfesores) {
            System.out.println("\n" + profesor);
            System.out.println("");
        }

    }

    private void menuDepartamentos() {
        System.out.println("\n---DEPARTAMENTOS---");
        System.out.println("-LENGUAJES");
        System.out.println("-MATEMATICAS");
        System.out.println("-INGENIERIA");
        System.out.println("-MEDICINA");
    }

    private void elegirDepartamento(Profesor profesor) {
        boolean bandera = false;

        while (bandera == false) {
            menuDepartamentos();
            String opcion = entrada.next();

            switch (opcion.toUpperCase()) {
                case "LENGUAJES":
                    profesor.setDepartamento(DepartamentoProfesor.LENGUAJES);
                    bandera = true;
                    break;
                case "MATEMATICAS":
                    profesor.setDepartamento(DepartamentoProfesor.MATEMATICAS);
                    bandera = true;
                    break;
                case "INGENIERIA":
                    profesor.setDepartamento(DepartamentoProfesor.INGENIERIA);
                    bandera = true;
                    break;
                case "MEDICINA":
                    profesor.setDepartamento(DepartamentoProfesor.MEDICINA);
                    bandera = true;
                    break;
                default:
                    System.out.println("ERROR, EL DEPARTAMENTO INGRESADO NO EXISTE...");

            }

        }
    }

    public void cambioDepartamento() {
        String respuesta = "NO";
        boolean bandera;
        for (Profesor profesor : listaProfesores) {
            System.out.println(profesor.getApellido() + " " + profesor.getNombre() + ", ¿DESEA CAMBIAR DE DEPARTAMENTO?");
            respuesta = entrada.next();
            bandera = false;

            if (respuesta.equalsIgnoreCase("SI")) {
                elegirDepartamento(profesor);
            }

        }

    }

    @Override
    public void cambioEstadoCivil() {
        String respuesta = "NO";
        boolean bandera;
        for (Profesor profesor : listaProfesores) {
            System.out.println(profesor.getApellido() + " " + profesor.getNombre() + ", ¿NECESITA CAMBIAR SU ESTADO CIVIL?");
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
                            profesor.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        case "CASADO":
                            profesor.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        case "DIVORCIADO":
                            profesor.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        case "VIUDO":
                            profesor.setEstadoCivil(opcion);
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
        for (Profesor profesor : listaProfesores) {
            System.out.println(profesor.getApellido() + " " + profesor.getNombre() + ", ¿QUIERE CABIAR SU NUMERO DE DESPACHO?");
            respuesta = entrada.next();

            if (respuesta.equalsIgnoreCase("SI")) {
                profesor.setNumeroDespacho((int) (Math.random() * 10000));

            }

        }
    }

}
