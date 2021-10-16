package com.celso;

import java.util.Scanner;

public class Main {

    public void Execicio01(){
        //Escreva um programa que leia o valor de 3 ângulos de um triângulo
        // e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
        //− Triângulo Retângulo: possui um ângulo reto. (igual a 90o)
        //− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90o)
        //− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90o)
        int i = 1;
        int[] num = new int[3];
        do{
            System.out.println("Insira o "+ i+"º ângulo");
            num[i -1] = new Scanner(System.in).nextInt();
            i++;
        }while (i < 4);

        VerificaRetangulo(num);

        VerificaObtusangulo(num);

        VerificaAcutangulo(num);

    }

    private void VerificaAcutangulo(int[] num) {
        if (num[0] < 90 && num[1] < 90 && num[2] < 90){
            System.out.println("é um triangulo Acutangulo");
        }
    }

    private void VerificaObtusangulo(int[] num) {
        if (num[0] > 90 ){
            if (num[1]!=90 && num[2]!=90){
                System.out.println("é um triangulo obtusangulo");
            }
        }
        if (num[1] > 90 ){
            if (num[0]!=90 && num[2]!=90){
                System.out.println("é um triangulo obtusangulo");
            }
        }
        if (num[2] > 90 ){
            if (num[0]!=90 && num[1]!=90){
                System.out.println("é um triangulo obtusangulo");
            }
        }
    }

    private void VerificaRetangulo(int[] num) {
        if (num[0] == 90 ){
            if (num[1]<90 && num[2]<90){
                System.out.println("é um triangulo retângulo");
            }
        }
        if (num[1] == 90 ){
            if (num[0]<90 && num[2]<90){
                System.out.println("é um triangulo retângulo");
            }
        }
        if (num[2] == 90 ){
            if (num[0]<90 && num[1]<90){
                System.out.println("é um triangulo retângulo");
            }
        }
    }

    public void Exercicio02(){
        //Faça um  algoritmo que escreva as seguintes mensagens :
        //− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
        //− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int i = 1;

        do{
            System.out.println("Digite o valor do: "+i+"ª lado:");
            sc.nextInt();

            System.out.println("Pretende continuar a adicionar lados? (1 -> sim 2 -> não)");
            int resp = sc.nextInt();
            if(resp == 1){
                flag = true;
                i++;
            }else {
                flag = false;
            }
        }while(flag);
        if(i < 3){
            System.out.println("Não é um polígono");
        }
        if(i > 5){
            System.out.println("Polígono não identificado");
        }
        if(i == 3 || i == 4 || i == 5){
            System.out.println("É um polígono");
        }
    }

    public void Exercicio03(){
        //As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
        // e R$ 0,25 se forem compradas pelo menos doze.
        //Escreva um programa que leia o número de maçãs compradas,
        // calcule e escreva o valor total da compra

        final double VAL1 = 0.30;
        final double VAL2 = 0.25;
        double valorTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de maçãs que você deseja comprar:");
        int total = sc.nextInt();
        if(total < 12){
            valorTotal = total * VAL1;
        }else {
            valorTotal = total * VAL2;
        }
        System.out.printf("O valor total foi: R$ %.2f", valorTotal);

    }

    public static void main(String[] args) {
        Main exec = new Main();

        exec.Execicio01();

        exec.Exercicio02();

        exec.Exercicio03();
    }

}
