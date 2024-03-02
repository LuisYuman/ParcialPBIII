package org.example;

public class Jugador {
    private int posicion;

    public Jugador() {
        this.posicion = 1;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void mover(int casillas) {
        posicion += casillas;
    }

    public void retroceder(int casillas) {
        posicion -= casillas;
    }
}
