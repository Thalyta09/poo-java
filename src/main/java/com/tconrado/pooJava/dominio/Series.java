package com.tconrado.pooJava.dominio;

public class Series extends Conteudo {

    private double duracao;
    private int temporadas;

    @Override
    public double calcularHoras() {
        return ACUMULADO + duracao;
    }

    public Series() {
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "\nSérie - " +
                "\nTitulo: " + getTitulo() + "," +
                "\nDescrição: " + getDescricao() + "," +
                "\nDuração: " + duracao + "," +
                "\nQtd. Temporadas: " + temporadas;
    }
}
