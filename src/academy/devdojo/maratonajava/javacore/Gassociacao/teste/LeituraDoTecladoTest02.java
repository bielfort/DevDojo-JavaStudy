package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("O grande software de previsão do futuro");
        System.out.println("------------------------------------------------");
        System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO:");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        }else{
            System.out.println("O número da mega da virada é: 08, 14, 20, 27, 38, 45");

        }
    }
}
