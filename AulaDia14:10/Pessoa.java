package com.celso;

public class Pessoa {

    private Double salario;
    private int filho;

    public Pessoa(double salario, int filho) {
        this.salario = salario;
        this.filho = filho;
    }

    public Pessoa() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getFilho() {
        return filho;
    }

    public void setFilho(int filho) {
        this.filho = filho;
    }
}
