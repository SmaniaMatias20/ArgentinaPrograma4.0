package entidades;

import enumeraciones.PaloCarta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class BarajaServicio {

    ArrayList<Carta> listaCartas = new ArrayList();
    ArrayList<Carta> cartasRepartidas = new ArrayList();
    Scanner entrada = new Scanner(System.in);

    public Baraja crearBaraja() {
        Baraja baraja = new Baraja();

        for (int j = 0; j < 4; j++) {

            for (int i = 1; i < 13; i++) {
                if (i != 8 && i != 9) {
                    Carta carta = new Carta();
                    carta.setNumero(i);
                    if (j == 0) {
                        carta.setPalo(PaloCarta.BASTO);
                    }
                    if (j == 1) {
                        carta.setPalo(PaloCarta.COPA);
                    }
                    if (j == 2) {
                        carta.setPalo(PaloCarta.ESPADA);
                    }
                    if (j == 3) {
                        carta.setPalo(PaloCarta.ORO);
                    }

                    listaCartas.add(carta);
                }
            }

        }
        baraja.setMazo(listaCartas);
        return baraja;
    }

    /*
    * METODO PARA MEZCLAR EL MAZO DE CARTAS
     */
    public void barajar(Baraja baraja) {
        Random random = new Random();
        Collections.shuffle(listaCartas, random);
    }

    /*
    * METODO PARA REPARTIR LA SIGUIENTE CARTA
     */
    public void siguienteCarta(Baraja baraja) {
        Iterator iterator = listaCartas.iterator();

        if (iterator.hasNext()) {
            Carta cartaRepartida = (Carta) iterator.next();
            System.out.println(cartaRepartida); //MOSTRAMOS LA SIGUIENTE CARTA
            iterator.remove(); //ELIMINAMOS LA CARTA REPARTIDA DEL MAZO ORIGINAL
            cartasRepartidas.add(cartaRepartida);//AGREGAMOS LA CARTA ELIMINADA A UNA NUEVA LISTA

        } else {
            System.out.println("NO HAY MAS CARTAS");
        }

    }

    /*
    * METODO PARA SABER LA CANTIDAD DE CARTAS A REPARTIR
     */
    public void cartasDisponibles() {
        System.out.println("QUEDAN POR REPARTIR: " + listaCartas.size() + " CARTAS");
    }

    /*
    * CANTIDAD ES IGUAL A LA CANTIDAD DE CARTAS A REPARTIR
     */
    public void darCartas(Baraja baraja, int cantidad) {
        if (baraja.getMazo().size() >= cantidad) {
            System.out.println("\n------------------------------");
            System.out.println("REPARTIR CARTAS DE LA BARAJA");
            System.out.println("------------------------------");
            for (int i = 0; i < cantidad; i++) {
                siguienteCarta(baraja);
            }
        } else {
            System.out.println("EL NUMERO DE CARTAS QUE PIDE ES MAYOR A LA CANTIDAD DEL MAZO");
        }
    }

    /*
    * METODO PARA MOSTRAR LA LISTA DE CARTAS YA REPARTIDAS
     */
    public void cartasMonton() {
        System.out.println("\n------------------------------------------");
        System.out.println("LISTA DE CARTAS QUE YA HAN SIDO REPARTIDAS");
        System.out.println("------------------------------------------");
        for (Carta cartaRepartida : cartasRepartidas) {
            System.out.println(cartaRepartida);
        }
    }

    /*
    * METODO PARA MOSTRAR LA LISTA DE CARTAS POR REPARTIR
     */
    public void mostrarBaraja() {
        System.out.println("\n------------------------------------------");
        System.out.println("LISTA DE CARTAS QUE QUEDAN EN LA BARAJA");
        System.out.println("------------------------------------------");
        for (Carta aux : listaCartas) {
            System.out.println(aux);
        }
    }

}
