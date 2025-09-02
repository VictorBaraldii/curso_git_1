package Banco;

public class Sistema {

    public static void main(String[] args) {

        Banco.ContaBancaria contaVictor = new Banco.ContaBancaria("Victor fsjfdbjbudf dfubwsujd",0);

        contaVictor.depositar(500);

        contaVictor.sacar(200);

        contaVictor.exibirSaldo();



    }
}
