package com.celso;

public class Sapo extends Animais{

    private String cor;

    public Sapo() {
        this.setType("Sapo");
    }

    public Sapo(String cor) {
        this.setType("Sapo");
        this.cor = cor;
    }

    public Sapo(String sex, boolean isVertebrado, String cor) {
        super("Sapo", sex, isVertebrado);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String Comunicar() {
        return "Coachar";
    }

    @Override
    public String Movimentar() {
        return "Pular";
    }
}
