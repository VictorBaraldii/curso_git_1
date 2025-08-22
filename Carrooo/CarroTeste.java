package Carrooo;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro("Civic", 2014);
        Carro c2 = new Carro("Gol", 2008);

        c1.Apresentar();

        c2.Apresentar();

        c1.ligar();
        c1.Apresentar();

        c2.acelerar();

        c2.ligar();
        c2.acelerar();

        c1.desligar();
    }
}
