package com.celso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static Scanner op = new Scanner(System.in);
    public static ArrayList<Animais> animais = new ArrayList<>();
    static Iterator<Animais> it;

    public static void main(String[] args) throws InterruptedException, IOException {

        int opcao;

        do{
            System.out.printf("**************************************************************\n");
            System.out.printf("*                          MENU                              *\n");
            System.out.printf("**************************************************************\n");
            System.out.printf("* 1 *                Adicionar Animal                        *\n");
            System.out.printf("* 2 *                Listar Animal                           *\n");
            System.out.printf("* 0 *                Sair                                    *\n");
            System.out.printf("**************************************************************\n");
            opcao = op.nextInt();

            switch(opcao){

                case 0:
                    System.out.println("Ok, ate mais ...");
                    break;

                case 1:
                    LimparTela();
                    AdicionarAnimal();
                    break;

                case 2:
                    LimparTela();
                    ListarAnimal();
                    break;

                default:
                    System.out.println("Opcao invalida !!!");

            }
        }while(opcao != 0);

    }
    public static void LimparTela() throws IOException, InterruptedException {
        for (int i = 0; i < 1000; ++i)
            System.out.println();

    }
    private static void AdicionarAnimal() throws InterruptedException, IOException {
        int opcao;

        do{
            System.out.printf("**************************************************************\n");
            System.out.printf("*                    ADICIONAR ANIMAL                        *\n");
            System.out.printf("**************************************************************\n");
            System.out.printf("* 1 *                Adicionar Cachorro                      *\n");
            System.out.printf("* 2 *                Adicionar Sapo                          *\n");
            System.out.printf("* 0 *                Sair                                    *\n");
            System.out.printf("**************************************************************\n");
            opcao = op.nextInt();

            switch(opcao){

                case 0:
                    LimparTela();
                    break;

                case 1:
                    LimparTela();
                    Cachorro cachorro = new Cachorro();

                    System.out.println("Digite o nome do animal:");
                    cachorro.setNome(op.next());
                    System.out.println("Digite o sexo do animal:");
                    cachorro.setSex(op.next());
                    System.out.println("Digite a raça do animal:");
                    cachorro.setRaca(op.next());
                    cachorro.setVertebrado(true);
                    animais.add(cachorro);
                    System.out.println("Animal Adicionado");
                    Thread.sleep(3000);
                    LimparTela();
                    break;

                case 2:
                    LimparTela();
                    Sapo sapo = new Sapo();

                    System.out.println("Digite a cor do animal:");
                    sapo.setCor(op.next());
                    System.out.println("Digite o sexo do animal:");
                    sapo.setSex(op.next());
                    sapo.setVertebrado(true);
                    animais.add(sapo);
                    System.out.println("Animal Adicionado");
                    Thread.sleep(3000);
                    LimparTela();
                    break;

                default:
                    System.out.println("Opcao invalida !!!");
            }

        }while (opcao != 0);
    }
    private static void ListarAnimal() throws IOException, InterruptedException {
        int opcao;

        do{
            System.out.printf("**************************************************************\n");
            System.out.printf("*                    LISTAR ANIMAL                           *\n");
            System.out.printf("**************************************************************\n");
            System.out.printf("* 1 *                Listar Cachorro                         *\n");
            System.out.printf("* 2 *                Listar Sapo                             *\n");
            System.out.printf("* 3 *                Listar Todos                            *\n");
            System.out.printf("* 0 *                Sair                                    *\n");
            System.out.printf("**************************************************************\n");
            opcao = op.nextInt();

            switch(opcao){

                case 0:
                    LimparTela();
                    break;

                case 1:
                    LimparTela();
                    it = animais.iterator();
                    System.out.printf("**************************************************************\n");
                    System.out.printf("* Nome                       Raça                       Sexo *\n");
                    System.out.printf("**************************************************************\n");
                    while (it.hasNext()){
                        Animais a = it.next();
                        if(a.getType().equalsIgnoreCase("cachorro")){
                            Cachorro c = (Cachorro) a;
                            System.out.printf("  %-25s %-21s %s  \n",c.getNome(),c.getRaca(),c.getSex());
                        }
                    }
                    System.out.printf("**************************************************************\n");
                    String sair;
                    do{
                        System.out.println("Deseja voltar ao menu?(s/n)");
                        sair = op.next();
                    }while(!sair.equalsIgnoreCase("s"));
                    LimparTela();
                    break;

                case 2:
                    LimparTela();
                    it = animais.iterator();
                    System.out.printf("**********************************\n");
                    System.out.printf("* Cor                       Sexo *\n");
                    System.out.printf("**********************************\n");
                    while (it.hasNext()){
                        Animais a = it.next();
                        if(a.getType().equalsIgnoreCase("sapo")){
                            Sapo s = (Sapo) a;
                            System.out.printf("  %-17s %-14s \n",s.getCor(),s.getSex());
                        }
                    }
                    System.out.printf("**********************************\n");

                    do{
                        System.out.println("Deseja voltar ao menu?(s/n)");
                        sair = op.next();
                    }while(!sair.equalsIgnoreCase("s"));
                    LimparTela();;
                    break;
                case 3:
                    LimparTela();
                    it = animais.iterator();
                    System.out.printf("*****************************************************************************************************\n");
                    System.out.printf("* Nome                       Raça                       Sexo                 Cor               Tipo *\n");
                    System.out.printf("*****************************************************************************************************\n");
                    while (it.hasNext()){
                        Animais a = it.next();
                        if(a.getType().equalsIgnoreCase("cachorro")){
                            Cachorro c = (Cachorro) a;
                            System.out.printf("  %-25s %-21s %-21s %-16s %s\n",c.getNome(),c.getRaca(),c.getSex(),"------------",c.getType());
                        }else {
                            Sapo s = (Sapo) a;
                            System.out.printf("  %-25s %-21s %-21s %-16s %s\n","--------","--------------",s.getSex(),s.getCor(),s.getType());
                        }
                    }
                    System.out.printf("*****************************************************************************************************\n");

                    do{
                        System.out.println("Deseja voltar ao menu?(s/n)");
                        sair = op.next();
                    }while(!sair.equalsIgnoreCase("s"));
                    LimparTela();
                    break;

                default:
                    System.out.println("Opcao invalida !!!");
            }

        }while (opcao != 0);
    }

}
