package com.celso;

import java.util.Scanner;

public class Atividade03 {
    //Escreva um programa que verifique a validade de uma senha fornecida pelo usuário.
    // A senha válida é o número 1234.	Devem ser	impressas as seguintes	mensagens:
    // ACESSO	PERMITIDO	caso	a	senha	seja	válida.
    // ACESSO	NEGADO	caso	a	senha	seja	inválida.

    public void VerificaAcesso(){
        System.out.println("Insira a senha");
        int password = new Scanner(System.in).nextInt();

        switch (password){
            case 1234 :
                System.out.println("ACESSO PERMITIDO");
                break;
            default:
                System.out.println("ACESSO NEGADO");
        }
    }
}
