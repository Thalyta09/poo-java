package com.tconrado.pooJava.dominio;

public class Filmes extends Conteudo {

    private double duracao;

    @Override
    public double calcularHoras() {
        return ACUMULADO + duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public Filmes() {
    }

    @Override
    public String toString() {
        return "\nFilme - " +
                "\nTítulo: " + getTitulo() + "," +
                "\nDescrição: " + getDescricao() + "," +
                "\nDuração: " + duracao + "\n";
    }
}
