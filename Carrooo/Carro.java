package Carrooo;

public class Carro {

    public String nome;
    public int ano;
    boolean ligado = false;

    public Carro(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;

    }

    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }
    public void Apresentar() {
        System.out.println("Modelo: " + nome + " Ano: " + ano + " | Está ligado? " + ligado);
    }


    public void acelerar() {
        if(ligado) {
            System.out.println("Acelerando o carro!");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado!");
        }
    }

}
