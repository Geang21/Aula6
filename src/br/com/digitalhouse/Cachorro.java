package br.com.digitalhouse;

public class Cachorro extends Animal {

    private String nome;



    //Pegar os construtores do pai utilizando o super
    public Cachorro(String novoNome, String novoTamanho, String novaRaca) {
        super(novoTamanho, novaRaca);
        nome = novoNome;
    }

    @Override
    public boolean ehMamifero() {
        System.out.println("printando se é Mamifero... ");
        return true;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public String getNome(){
        return nome;
    }
}
