package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo:");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Digeite M ou F para seu sexo:");
        char sexo = entrada.next().charAt(0);
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Sexo: "+ sexo);

    }
}
