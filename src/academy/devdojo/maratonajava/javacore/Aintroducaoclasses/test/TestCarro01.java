package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class TestCarro01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Celta";
        carro1.fabricante = "Chevrolet";
        carro1.cor = "Preto";
        carro1.ano = 2010;

        carro2.modelo = "Fuscão";
        carro2.fabricante = "Volkswagen";
        carro2.cor = "Azul";
        carro2.ano = 1973;

        System.out.println("\nCarro 1\n");
        System.out.println(carro1.modelo);
        System.out.println(carro1.fabricante);
        System.out.println(carro1.ano);
        System.out.println(carro1.cor);

        System.out.println("\nCarro 2\n");
        System.out.println(carro2.modelo);
        System.out.println(carro2.fabricante);
        System.out.println(carro2.ano);
        System.out.println(carro2.cor);
    }
}
