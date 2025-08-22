public class Teste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Victor", 19);
        Pessoa p2 = new Pessoa("Clara", 17);

        p1.Apresentar();

        p2.Apresentar();

        if (p1.maiorDeIdade()) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }

        if (p2.maiorDeIdade()) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
    }
}
