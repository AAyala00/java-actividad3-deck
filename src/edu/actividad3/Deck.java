package edu.actividad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards; // Coleccion principal
    private Random random = new Random();

    public Deck() {
        cards = new ArrayList<>();
        inicializarDeck();
    }

    private void inicializarDeck() {
        String[] palos = {"Treboles", "Diamantes", "Corazones", "Picas"};
        String[] colores = {"Rojo", "Negro", "Rojo", "Negro"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < palos.length; i++) {
            for (String valor : valores) {
                cards.add(new Card(palos[i], colores[i], valor));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el deck.");
    }

    public void head() {
        if (cards.isEmpty()) {
            System.out.println("El deck está vacío.");
            return;
        }
        Card c = cards.remove(0);
        System.out.println(c.toString());
        System.out.println("Quedan " + cards.size() + " cartas en el deck.");
    }

    public void pick() {
        if (cards.isEmpty()) {
            System.out.println("El deck está vacío.");
            return;
        }
        int index = random.nextInt(cards.size());
        Card c = cards.remove(index);
        System.out.println(c.toString());
        System.out.println("Quedan " + cards.size() + " cartas en el deck.");
    }

    public void hand() {
        if (cards.size() < 5) {
            System.out.println("No hay suficientes cartas para repartir una mano de 5.");
            return;
        }
        for (int i = 0; i < 5; i++) {
            Card c = cards.remove(0);
            System.out.println(c.toString());
        }
        System.out.println("Quedan " + cards.size() + " cartas en el deck.");
    }
}
