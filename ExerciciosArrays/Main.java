package com.celso;


import java.util.Arrays;



public class Main {

    public static void Exercicio01(){
        //1 - Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        //A. Retorno o valor total da soma de todos os elementos com foreach
        //B. Retorne a média de todos os elementos
        //C. Retorne o maior valor e o menor elemento

        int maior = 0, menor = Integer.MAX_VALUE;
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        //a)
        int soma = 0;
        for(int i : array){
            soma += i;
            if (i > maior){
                maior = i;
            }
            if(i < menor) {
                menor = i;
            }
        }
        System.out.printf("A soma total dos elementos do array é: %d\n",soma);

        //b)
        int media = soma / array.length;
        System.out.printf("A média dos elementos do array é: %d\n",media);

        //c)
        System.out.printf("O maior elemento do array é: %d\n",maior);
        System.out.printf("O menor elemento do array é: %d\n\n",menor);

        //c) extra

        Arrays.sort(array);
        System.out.printf("O maior elemento do array é: %d\n",array[array.length-1]);
        System.out.printf("O menor elemento do array é: %d\n",array[0]);
    }
    public static void Exercicio02(){
        //2 - Dado o seguinte array: int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101,
        //125};
        //A. Retorne somente com números pares
        //B. Retorne somente com os números ímpares * 2.

        int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};
        int qtdPar = 0, qtdImpar = 0;
        for(int i : array2){
            if( i % 2 == 0){
                qtdPar++;
            }else{
                qtdImpar++;
            }
        }
        int[] par = new int[qtdPar];
        int[] impar = new int[qtdImpar];
        int j = 0,z = 0;
        for(int i : array2){
            if( i % 2 == 0){
                par[j] = i;
                j++;
            }else{
                impar[z] = i*2;
                z++;
            }
        }
        System.out.print("Par { ");
        for (int xPar : par){
            System.out.printf("%d,",xPar);
        }
        System.out.print("}\n");
        System.out.print("Impar { ");
        for (int xImpar : impar){
            System.out.printf("%d,",xImpar);
        }
        System.out.print("}\n");
    }
    public static void Exercicio03(){
        Aluno aluno = new Aluno();
        double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
        aluno.setNotas(notas);
        aluno.setNome("Enzo");

        if(aluno.Aprovado()){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

        System.out.printf("A média de %s foi: %.2f\n",aluno.getNome(), aluno.Media());
        System.out.printf("A maior nota de %s foi: %.2f\n",aluno.getNome(), aluno.MaiorNota());
    }

    public static void main(String[] args) {
        System.out.println("\nExercicio 01\n");
        Main.Exercicio01();
        System.out.println("\nExercicio 02\n");
        Main.Exercicio02();
        System.out.println("\nExercicio 03\n");
        Main.Exercicio03();
    }
}
