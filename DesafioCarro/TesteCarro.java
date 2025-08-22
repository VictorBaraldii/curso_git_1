package DesafioCarro;

public class TesteCarro {

    public static void main(String[] args) {
         Civic c1 = new Civic();

        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1);

        c1.freiar();
        System.out.println(c1);

        Ferrari c2 =  new Ferrari();

        System.out.println(c2);

        c2.acelerar();
        c2.acelerar();
        System.out.println(c2);

        c2.ligarTurbo();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

        c2.ligarAr();
        c2.acelerar();
        System.out.println(c2);

        c2.freiar();
        c2.freiar();
        c2.desligarAr();
        System.out.println(c2);

        c2.desligarTurbo();
        c2.acelerar();

        System.out.println(c2);
    }
}
