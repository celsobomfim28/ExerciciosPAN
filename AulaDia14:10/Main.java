package com.celso;

import java.util.Random;

public class Main {

    //1 - A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
    // coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
    //a) média do salário da população;
    //b) média do número de filhos;
    //c) maior salário;
    //d) percentual de pessoas com salário até R$100,00.
    
    //2 - Faça um programa que mostre uma contagem na tela de 233 a 456,
    // só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
    
    public static void main(String[] args) {
        //1

        Random rd = new Random();
        Pessoa[] p = new Pessoa[20];

        for(int i = 0; i < 20; i++){
            p[i] = new Pessoa();
            p[i].setSalario(rd.nextDouble() * (10000 - 1) + 1);
            p[i].setFilho(rd.nextInt(20));
        }

        double totalSalario = 0;
        int totalFilho = 0;
        double maior = 0.0;
        int qtd = 0;

        for(Pessoa pessoa : p){
            totalSalario = totalSalario + pessoa.getSalario();
            totalFilho = totalFilho + pessoa.getFilho();

            if(maior < pessoa.getSalario()){
                maior = pessoa.getSalario();
            }

            if(pessoa.getSalario() <= 100){
                qtd++;
            }
        }

        double mediaSalario = totalSalario / 20;
        int mediaFilho = totalFilho / 20;
        double qtdPercem = (qtd*100)/20;

        int perc = (int) qtdPercem;

        System.out.printf("\nA media de salários é: %.2f\n",mediaSalario);
        System.out.printf("A media de Filhos é: %d\n",mediaFilho);
        System.out.printf("O maior salário é: %.2f\n",maior);
        System.out.println("A média de pessoas que recebem até R$100 é: "+perc+"%");

        //2
        for(int i = 233; i <= 456; ){
            if(i > 300 && i < 400){
                i += 3;
                System.out.println(i);
            }else{
                i += 5;
                System.out.println(i);
            }
        }
    }
}
