package com.celso;

import java.util.Scanner;

public class Main {

    public static void ExercicioWhile(){
        //Calcular média de X alunos.
        //Notas válidas: entre 0 e 10
        //Contar quantas notas válidas foram digitadas
        //Usuário deve digitar -1 para sair do programa
        //e ser informado da sua média e quantidade de notas

        double nota = 0.0, soma = 0.0;
        int i = 0;
        int qtd = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Digite a "+(i+1)+"ª nota! (digite -1 pra sair)");
            nota = sc.nextDouble();

            if(nota >= 0 && nota <= 10){
                qtd++;
                soma = soma + nota;
            }else if(nota != -1){
                System.out.println("Nota Inválida!");
            }
            i++;
        }while(nota != -1);

        double media = (soma / qtd);
        System.out.printf("A média do aluno foi: %.2f \n",media );
        System.out.println("A quantidade de notas do aluno foi: "+qtd );
        sc.close();
    }
    public static void ExercicioFor(){
        //Criar um programa que receba um número e diga se ele é um número primo.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = sc.nextInt();

        if(VerificaPrimo(num)){
            System.out.printf("O número %d é um número primo:", num);
        }else{
            System.out.printf("O número %d não é um número primo:", num);
        }

    }

    private static boolean VerificaPrimo(int num) {
        for(int i = 2; i < num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
       Main.ExercicioWhile();
       Main.ExercicioFor();
    }
}
