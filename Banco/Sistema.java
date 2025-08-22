package Banco;

public class Sistema {

    public static void main(String[] args) {

        ContaBancaria contaVictor = new ContaBancaria("Victor",0);

        contaVictor.depositar(500);

        contaVictor.sacar(200);

        contaVictor.exibirSaldo();

    }
}
