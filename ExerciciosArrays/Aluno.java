package com.celso;

import java.util.Arrays;

public class Aluno {

    private String nome;
    private double[] notas;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean Aprovado(){
        double soma = 0;
        for (double n : this.notas){
             soma += n;
        }
        double media = soma / notas.length;
        if(media >= 7){
            return true;
        }else{
            return false;
        }
    }

    public double MaiorNota(){
        Arrays.sort(notas);
        return notas[notas.length-1];
    }

    public double Media(){
        double soma = 0;
        for (double n : this.notas){
            soma += n;
        }
        double media = soma / notas.length;
        return media;
    }


}
