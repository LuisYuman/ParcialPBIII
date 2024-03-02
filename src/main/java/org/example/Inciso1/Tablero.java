package org.example;
import java.util.Random;

public class Tablero {

    private int[] origenCasillasEspeciales;
    private int[] destinoCasillasEspeciales;

    public Tablero(Tablero tablero, Jugador jugador1, Jugador jugador2) {
        this.origenCasillasEspeciales = tablero.origenCasillasEspeciales;
        this.destinoCasillasEspeciales = tablero.destinoCasillasEspeciales;
    }

    public Tablero(int[] origenCasillasEspeciales, int[] destinoCasillasEspeciales) {
        this.origenCasillasEspeciales = origenCasillasEspeciales;
        this.destinoCasillasEspeciales = destinoCasillasEspeciales;
    }

    public int mover(int posicion){
        for(int i = 0; i < origenCasillasEspeciales.length; i++){
            if(posicion == origenCasillasEspeciales[i]){
                return destinoCasillasEspeciales[i];
            }
        }
        return posicion;
    }
}
