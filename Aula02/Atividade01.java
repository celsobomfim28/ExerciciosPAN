package com.celso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade01 {

    //Faça um programa que receba três inteiros e
    // diga qual deles é o maior e qual o menor.
    // Conseguem criar mais de uma solução?


    public void CalculaValor(){
        int i = 1;
        int respMax, respMin;
        int[] num = new int[3];

        do{
            System.out.println("Insira o "+ i+"º número");
            num[i -1] = new Scanner(System.in).nextInt();
            i++;
        }while (i < 4);
        respMax = num[0] > num[1] && num[0] > num[2] ? num[0] :
                num[1] > num[0] && num[1] > num[2] ? num[1] : num[2];
        respMin = num[0] < num[1] && num[0] < num[2] ? num[0] :
                num[1] < num[0] && num[1] < num[2] ? num[1] : num[2];

        System.out.println("O maior número é: "+respMax+" e o menor número é: "+ respMin);
    }

    public void CalculaValorList(){
        ArrayList<Integer> num = new ArrayList<Integer>();
        int i = 1;

        do{
            System.out.println("Insira o "+ i+"º número");
            num.add(new Scanner(System.in).nextInt());
            i++;
        }while (i < 4);
        Collections.sort(num);

        System.out.println("O maior número é: "+num.get(num.size()-1)+" " +
                "e o menor número é: "+ num.get(0));

    }
}
