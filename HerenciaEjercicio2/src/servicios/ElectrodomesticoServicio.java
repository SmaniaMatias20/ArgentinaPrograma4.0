package servicios;

import entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoServicio {

    protected Scanner entrada;

    public ElectrodomesticoServicio() {
        this.entrada = new Scanner(System.in);
    }

    public void comprobarConsumoEnergetico(char letra, Electrodomestico electrodomestico) {
        int bandera = 0;
        String cadena = "ABCDEF";
        for (int i = 0; i < cadena.length(); i++) {
            if (letra == cadena.charAt(i)) {
                electrodomestico.setConsumoEnergetico(letra);
                bandera = 1;
            }
        }

        if (bandera == 0) {
            electrodomestico.setConsumoEnergetico(cadena.charAt(5));
        }

    }

    private void comprobarColor(String color, Electrodomestico electrodomestico) {
        int bandera = 0;
        String[] colores = new String[5];
        colores[0] = "AZUL";
        colores[1] = "BLANCO";
        colores[2] = "NEGRO";
        colores[3] = "ROJO";
        colores[4] = "GRIS";

        for (int i = 0; i < colores.length; i++) {
            if (color.equalsIgnoreCase(colores[i])) {
                electrodomestico.setColor(color.toUpperCase());
                bandera = 1;
            }
        }
        if (bandera == 0) {
            electrodomestico.setColor(colores[1]);
        }
    }

    public Electrodomestico crearElectrodomestico() {
        Electrodomestico electrodomestico = new Electrodomestico();

        electrodomestico.setPrecio(1000);

        System.out.print("INGRESE EL COLOR: ");
        comprobarColor(entrada.next(), electrodomestico);
        System.out.print("INGRESE EL CONSUMO ENERGETICO: ");
        String letra = entrada.next();
        comprobarConsumoEnergetico(letra.toUpperCase().charAt(0), electrodomestico);
        System.out.print("INGRESE EL PESO: ");
        electrodomestico.setPeso(entrada.nextFloat());

        return electrodomestico;
    }

    public Integer precioFinal(Electrodomestico electrodomestico) {

        switch (String.valueOf(electrodomestico.getConsumoEnergetico())) {
            case "A":
                if (electrodomestico.getPeso() > 0 && electrodomestico.getPeso() < 20) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1100);
                }
                if (electrodomestico.getPeso() > 19 && electrodomestico.getPeso() < 50) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1500);
                }
                if (electrodomestico.getPeso() > 49 && electrodomestico.getPeso() < 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1800);
                }
                if (electrodomestico.getPeso() >= 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 2000);
                }
                break;
            case "B":
                if (electrodomestico.getPeso() > 0 && electrodomestico.getPeso() < 20) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 900);
                }
                if (electrodomestico.getPeso() > 19 && electrodomestico.getPeso() < 50) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1300);
                }
                if (electrodomestico.getPeso() > 49 && electrodomestico.getPeso() < 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1600);
                }
                if (electrodomestico.getPeso() >= 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1800);
                }
                break;
            case "C":
                if (electrodomestico.getPeso() > 0 && electrodomestico.getPeso() < 20) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 700);
                }
                if (electrodomestico.getPeso() > 19 && electrodomestico.getPeso() < 50) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1100);
                }
                if (electrodomestico.getPeso() > 49 && electrodomestico.getPeso() < 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1400);
                }
                if (electrodomestico.getPeso() >= 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1600);
                }
                break;
            case "D":
                if (electrodomestico.getPeso() > 0 && electrodomestico.getPeso() < 20) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 600);
                }
                if (electrodomestico.getPeso() > 19 && electrodomestico.getPeso() < 50) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1000);
                }
                if (electrodomestico.getPeso() > 49 && electrodomestico.getPeso() < 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1300);
                }
                if (electrodomestico.getPeso() >= 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1500);
                }
                break;
            case "E":
                if (electrodomestico.getPeso() > 0 && electrodomestico.getPeso() < 20) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 400);
                }
                if (electrodomestico.getPeso() > 19 && electrodomestico.getPeso() < 50) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 800);
                }
                if (electrodomestico.getPeso() > 49 && electrodomestico.getPeso() < 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1100);
                }
                if (electrodomestico.getPeso() >= 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1300);
                }
                break;
            case "F":
                if (electrodomestico.getPeso() > 0 && electrodomestico.getPeso() < 20) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 200);
                }
                if (electrodomestico.getPeso() > 19 && electrodomestico.getPeso() < 50) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 600);
                }
                if (electrodomestico.getPeso() > 49 && electrodomestico.getPeso() < 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 900);
                }
                if (electrodomestico.getPeso() >= 80) {
                    electrodomestico.setPrecio(electrodomestico.getPrecio() + 1100);
                }
                break;
        }
        return electrodomestico.getPrecio();
    }

    public void mostrarElectrodomestico(Electrodomestico electrodomestico) {
        System.out.println(electrodomestico.toString());
    }

}
