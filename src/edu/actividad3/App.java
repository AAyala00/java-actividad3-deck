package edu.actividad3;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("=== Baraja inicial creada (52 cartas) ===");
        deck.shuffle();

        System.out.println("\n=== HEAD ===");
        deck.head();

        System.out.println("\n=== PICK ===");
        deck.pick();

        System.out.println("\n=== HAND (5 cartas) ===");
        deck.hand();
    }
}
