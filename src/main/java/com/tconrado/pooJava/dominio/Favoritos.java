package com.tconrado.pooJava.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Favoritos {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private Set<Assinante>  devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Favoritos() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public Set<Assinante> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Assinante> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favoritos favoritos = (Favoritos) o;
        return Objects.equals(nome, favoritos.nome)
                && Objects.equals(descricao, favoritos.descricao)
                && Objects.equals(dataInicial, favoritos.dataInicial)
                && Objects.equals(devsInscritos, favoritos.devsInscritos)
                && Objects.equals(conteudos, favoritos.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, devsInscritos, conteudos);
    }
}
