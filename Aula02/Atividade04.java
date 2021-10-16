package com.celso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade04 {
    //Faça um programa que pede duas notas de um aluno.
    // Em seguida ele deve calcular a média do aluno e dar o seguinte resultado:
    //  A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    //  A mensagem "Reprovado", se a média for menor do que sete;
    //  A mensagem "Aprovado com Distinção", se a média for igual a dez.

    public void CalculaMedia(){
        ArrayList<Double> note = new ArrayList<>();

        int i = 1;

        do{
            System.out.println("Insira a "+ i+"ª nota");
            note.add(new Scanner(System.in).nextDouble());
            i++;
        }while (i < 3);

        double som = 0;
        Iterator<Double> it = note.iterator();
        while (it.hasNext()){
            som = som + it.next();
        }
        double med = som / 2;

        System.out.println("Sua média é: "+med);
        if (med >= 7 && med != 10) {
            System.out.println("Aprovado");
        } else {
            if (med < 7) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Aprovado com Distinção");
            }
        }
    }
}
