package org.example;
import java.util.Random;

public class Juego {

    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private Random random;

    public Juego(Tablero tablero, Jugador jugador1, Jugador jugador2) {
        this.tablero = tablero;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.random = new Random();
    }

    public void mostrarEstado() {
        System.out.println("Jugador 1: " + jugador1.getPosicion());
        System.out.println("Jugador 2: " + jugador2.getPosicion());
        System.out.println();
    }

    public void jugar() {
        while (true) {
            int tirada1 = lanzarDado();
            int tirada2 = lanzarDado();

            jugador1.mover(tirada1 + tirada2);
            jugador1.setPosicion(tablero.mover(jugador1.getPosicion()));

            mostrarEstado();

            if (jugador1.getPosicion() >= 64) {
                System.out.println("¡Jugador 1 ha ganado!");
                break;
            }

            tirada1 = lanzarDado();
            tirada2 = lanzarDado();

            jugador2.mover(tirada1 + tirada2);
            jugador2.setPosicion(tablero.mover(jugador2.getPosicion()));

            if (jugador2.getPosicion() >= 64) {
                System.out.println("¡Jugador 2 ha ganado!");
                break;
            }
        }
    }

    private int lanzarDado() {
        return random.nextInt(6) + 1;
    }
}
