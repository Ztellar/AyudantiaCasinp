package org.example;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> baraja = new ArrayList<>();

    public Baraja() {}

    public void generarBaraja() {
        String[] figuras = {"Pica", "Diamante", "Trebol", "Corazón"};
        String[] numeros = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] valor = {"11", "2", "3", "4", "5", "6", "7", "8", "9", "10", "10", "10", "10"};
        int figura = 0, numero = 0;
        for (int i = 0; figura < figuras.length; i++) {
            if (numero >= numeros.length) {
                numero = 0;
            }
            if (i > 0 && i % 13 == 0) {
                figura++;
            }
            if (figura == 4) {
                break;
            }
            baraja.add(new Carta(figuras[figura], numeros[numero], valor[numero]));
            numero++;
        }
    }
    public void mostrarBaraja() {
        for (int i = 0; i < baraja.size(); i++) {
            System.out.println(baraja.get(i).toString());
        }
    }
}
