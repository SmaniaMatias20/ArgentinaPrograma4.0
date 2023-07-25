package servicios;

import entidades.Estudiante;
import enumeraciones.CursoEstudiante;
import interfaces.AccionPersona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioEstudiante implements AccionPersona {

    private ArrayList<Estudiante> listaEstudiantes;
    private Scanner entrada;

    public ServicioEstudiante() {
        this.listaEstudiantes = new ArrayList();
        this.entrada = new Scanner(System.in);
    }

    private void menuCursos() {

        System.out.println("\n---CURSOS---");
        System.out.println("-MATEMATICA");
        System.out.println("-INGLES");
        System.out.println("-INFORMATICA");
        System.out.println("-PSICOLOGIA");

    }

    private void elegirCursos(Estudiante estudiante) {
        boolean bandera = false;

        while (bandera == false) {
            System.out.println("\n¿EN CUAL CURSO DESEA INSCRIBIRSE?");
            menuCursos();
            String opcion = entrada.next();

            switch (opcion.toUpperCase()) {
                case "MATEMATICA":
                    estudiante.setCurso(CursoEstudiante.MATEMATICA);
                    bandera = true;
                    break;
                case "INGLES":
                    estudiante.setCurso(CursoEstudiante.INGLES);
                    bandera = true;
                    break;
                case "INFORMATICA":
                    estudiante.setCurso(CursoEstudiante.INFORMATICA);
                    bandera = true;
                    break;
                case "PSICOLOGIA":
                    estudiante.setCurso(CursoEstudiante.PSICOLOGIA);
                    bandera = true;
                    break;
                default:
                    System.out.println("ERROR, EL CURSO INGRESADO NO EXISTE...");

            }

        }
    }

    public Estudiante crearEstudiante() {
        Estudiante estudiante = new Estudiante();
        System.out.print("INGRESE SU NOMBRE: ");
        estudiante.setNombre(entrada.nextLine());
        System.out.print("INGRESE SU APELLIDO: ");
        estudiante.setApellido(entrada.nextLine());
        System.out.print("INGRESE SU DNI: ");
        estudiante.setDocumento(entrada.nextInt());
        System.out.print("INGRESE SU ESTADO CIVIL: ");
        estudiante.setEstadoCivil(entrada.next());
        System.out.println("INGRESE SU CURSO: ");
        elegirCursos(estudiante);

        listaEstudiantes.add(estudiante);

        return estudiante;
    }

    public void crearGrupoEstudiantes() {
        Estudiante estudiante1 = new Estudiante(CursoEstudiante.INFORMATICA,
                "MATIAS", "SMANIA", 40910931, "SOLTERO");

        Estudiante estudiante2 = new Estudiante(CursoEstudiante.MATEMATICA,
                "CANDELA", "SMANIA", 44444444, "SOLTERA");

        Estudiante estudiante3 = new Estudiante(CursoEstudiante.INGLES,
                "MARTINA", "SMANIA", 55555555, "SOLTERA");

        Estudiante estudiante4 = new Estudiante(CursoEstudiante.PSICOLOGIA,
                "LUJAN", "PALOPOLO", 66666666, "SOLTERA");

        Estudiante estudiante5 = new Estudiante(CursoEstudiante.INGLES,
                "MANUEL", "SACO", 77777777, "SOLTERO");

        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);
        listaEstudiantes.add(estudiante5);
    }

    public void fabricaEstudiantes(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            crearEstudiante();
        }

    }

    public void mostrarListaEstudiantes() {
        System.out.println("\n-----LISTA DE ESTUDIANTES-----");

        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("\n" + estudiante);
            System.out.println("");

        }
    }

    public void matriculacionCurso() {
        String respuesta = "NO";
        boolean bandera;

        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante.getApellido() + " " + estudiante.getNombre() + ", ¿DESEA CAMBIAR DE CURSO?");
            respuesta = entrada.next();
            bandera = false;

            if (respuesta.equalsIgnoreCase("SI")) {
                elegirCursos(estudiante);
            }
        }

    }

    @Override
    public void cambioEstadoCivil() {
        String respuesta = "NO";
        boolean bandera;
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante.getApellido() + " " + estudiante.getNombre() + ", ¿NECESITA CAMBIAR SU ESTADO CIVIL?");
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
                            estudiante.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        case "CASADO":
                            estudiante.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        case "DIVORCIADO":
                            estudiante.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        case "VIUDO":
                            estudiante.setEstadoCivil(opcion);
                            bandera = true;
                            break;
                        default:
                            System.out.println("ERROR, EL ESTADO CIVIL INGRESADO NO EXISTE...");

                    }

                }

            }

        }

    }

}
