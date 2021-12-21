package com.tconrado.pooJava.dominio;

public abstract class Conteudo {

    protected static final double ACUMULADO = 0d;

    private String titulo;
    private String descricao;

    public abstract double calcularHoras();

    public Conteudo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
