package com.celso;

public class Cachorro extends Animais{

    private String nome;
    private String raca;

    public Cachorro() {
        this.setType("Cachorro");
    }

    public Cachorro(String raca) {
        this.setType("Cachorro");
        this.raca = raca;
    }

    public Cachorro(String sex, boolean isVertebrado, String raca) {
        super("Cachorro", sex, isVertebrado);
        this.raca = raca;
    }

    public Cachorro( String sex, boolean isVertebrado, String nome, String raca) {
        super("Cachorro", sex, isVertebrado);
        this.nome = nome;
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String Comunicar() {
        return "Latir";
    }

    @Override
    public String Movimentar() {
        return "Andar e Correr";
    }
}
