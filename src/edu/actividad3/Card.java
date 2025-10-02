package edu.actividad3;

public class Card {
    private String palo; // treboles, diamantes, corazones, picas
    private String color; // rojo o negro
    private String valor; // 2-10 J Q K A

    public String getPalo() { return palo; }
    public String getColor() { return color; }
    public String getValor() { return valor; }

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return palo + " " + color + " " + valor;
    }
}
