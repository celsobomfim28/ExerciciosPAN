package com.celso;

public class Animais {

    private String type;
    private String sex;
    private boolean isVertebrado;

    public Animais() {
    }

    public Animais(String type, String sex, boolean isVertebrado) {
        this.type = type;
        this.sex = sex;
        this.isVertebrado = isVertebrado;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isVertebrado() {
        return isVertebrado;
    }

    public void setVertebrado(boolean vertebrado) {
        isVertebrado = vertebrado;
    }

    public String Comunicar(){
        return "Generic";
    }
    public String Movimentar(){
        return "Generic";
    }
}
