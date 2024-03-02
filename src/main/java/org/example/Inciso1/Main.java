package org.example;

public class Main {
    public static void main(String[] args) {
        int[] origenCasillasEspeciales = {7, 11, 31, 30, 40, 43, 50, 59};
        int[] destinoCasillasEspeciales = {38, 37, 46, 2, 21, 60, 5, 42};

        Tablero tablero = new Tablero(origenCasillasEspeciales, destinoCasillasEspeciales);
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        Juego juego = new Juego(tablero, jugador1, jugador2);
        juego.jugar();
    }
}