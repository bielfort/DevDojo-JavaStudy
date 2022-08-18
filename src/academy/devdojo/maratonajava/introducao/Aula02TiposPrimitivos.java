package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long e boolean - Oito tipos primitivos - escritas em minusculo //
        int age = 1000000000;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000;
        double salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é "+nome);

    }
}
