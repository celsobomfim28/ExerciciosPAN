package com.celso;

import java.util.Calendar;
import java.util.Scanner;

public class Atividade02 {
    //Escreva um programa para ler o ano de nascimento de uma pessoa e
    // escrever uma mensagem que diga se ela poderá ou não votar este ano
    // (não	é	necessário	considerar	o	mês	em	que	ela nasceu).

    public void CalculaIdade(){
         int year, now = 2021;

        System.out.println("Insira o ano de nascimento");
         year = new Scanner(System.in).nextInt();
         int idade = now - year;

         if(idade < 16){
             System.out.println("Não pode votar esse ano");
         } else{
             System.out.println("Pode votar esse ano");
         }
    }
}
