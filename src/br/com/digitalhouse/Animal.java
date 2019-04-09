package br.com.digitalhouse;

public abstract class Animal {

    //atributos
    private String tamanho;
    private String raca;

    //Construtores
    public Animal() {

    }

    public Animal(String novoTamanho, String novaRaca) {
        tamanho = novoTamanho;
        raca = novaRaca;
    }

    //gettings and settings
    public void setTamanho(String novoTamanho) {
        tamanho = novoTamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setRaca(String novaRaca) {
        raca = novaRaca;
    }

    public String getRaca() {
        return raca;
    }

    public abstract boolean ehMamifero();


}
