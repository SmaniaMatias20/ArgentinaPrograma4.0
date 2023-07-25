package objetosejercicio1;

import java.util.Scanner;

public class Libro {

    public String titulo;
    public String autor;        
    public int paginas;
    public int isbn;

    public Libro() {
    }                                  

    public Libro(String titulo, String autor, int paginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;         
        this.isbn = isbn;
    }

    public void cargarLibro() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("INGRESE EL TITULO");
        titulo = entrada.nextLine();
        System.out.println("INGRESE EL AUTOR");
        autor = entrada.nextLine();
        System.out.println("INGRESE LAS PAGINAS");
        paginas = entrada.nextInt();
        System.out.println("INGRESE EL ISBN");
        isbn = entrada.nextInt();

    }

    public void informarLibro() {
        System.out.println("EL TITULO DEL LIBRO ES: " + titulo);
        System.out.println("EL TITULO DEL LIBRO ES: " + autor);
        System.out.println("EL TITULO DEL LIBRO ES: " + paginas);
        System.out.println("EL TITULO DEL LIBRO ES: " + isbn);

    }
}
