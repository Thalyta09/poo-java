package com.tconrado.pooJava;

import com.tconrado.pooJava.dominio.Favoritos;
import com.tconrado.pooJava.dominio.Filmes;
import com.tconrado.pooJava.dominio.Assinante;
import com.tconrado.pooJava.dominio.Series;

public class Main {

    public static void main(String[] args){

        Filmes filmes1 = new Filmes();
        filmes1.setTitulo("Filme 1");
        filmes1.setDescricao("Descrição Filme 1");
        filmes1.setDuracao(2d);

        Filmes filmes2 = new Filmes();
        filmes2.setTitulo("Filme 2");
        filmes2.setDescricao("Descrição Filme 2");
        filmes2.setDuracao(2.2);

        Series series = new Series();
        series.setTitulo("Breaking Bad");
        series.setDescricao("Descrição Breaking Bad");
        series.setDuracao(55.3);
        series.setTemporadas(5);

        Favoritos favoritos = new Favoritos();
        favoritos.setNome("Meus Filmes e Series Favoritos");
        favoritos.setDescricao("Lista dos meus Filmes e Series Favoritos");
        favoritos.getConteudos().add(filmes1);
        favoritos.getConteudos().add(filmes2);
        favoritos.getConteudos().add(series);

        Assinante assinanteCamila = new Assinante();
        assinanteCamila.setNome("Camila");
        assinanteCamila.assistirFavoritos(favoritos);
        System.out.println("Conteúdos Favoritos de Camila:\n" + assinanteCamila.getConteudosInscritos());
        assinanteCamila.progredir();
        System.out.println("______________________________________");
        System.out.println("Conteúdos Favoritos de Camila:\n" + assinanteCamila.getConteudosInscritos());
        System.out.println("\n");
        System.out.println("Conteúdos Favoritos Concluidos de Camila:\n" + assinanteCamila.getConteudosConcluidos());
        System.out.println("Horas Acumuladas: " + assinanteCamila.calcularTotalHoras());

        System.out.println("______________________________________________________________");

        Assinante assinanteThalyta = new Assinante();
        assinanteThalyta.setNome("Thalyta");
        assinanteThalyta.assistirFavoritos(favoritos);
        System.out.println("Conteúdos Favoritos de Thalyta:\n" + assinanteThalyta.getConteudosInscritos());
        assinanteThalyta.progredir();
        assinanteThalyta.progredir();
        assinanteThalyta.progredir();
        System.out.println("______________________________________");
        System.out.println("Conteúdos Favoritos de Thalyta:\n" + assinanteThalyta.getConteudosInscritos());
        System.out.println("\n");
        System.out.println("Conteúdos Favoritos Concluidos de Thalyta:\n" + assinanteThalyta.getConteudosConcluidos());
        System.out.println("Horas Acumuladas: " + assinanteThalyta.calcularTotalHoras());

    }
}