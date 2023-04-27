package org.example;

public class Carta {
    private String pinta;
    private String numero;
    private String valor;

    public Carta(String pinta, String numero, String valor) {
        this.pinta = pinta;
        this.numero = numero;
        this.valor = valor;
    }

    public String getPinta() {
        return pinta;
    }
    public String getNumero() {
        return numero;
    }
    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "pinta='" + pinta + '\'' +
                ", numero='" + numero + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
