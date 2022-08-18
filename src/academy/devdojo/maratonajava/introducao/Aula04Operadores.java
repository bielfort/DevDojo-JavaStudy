package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %

        int resto = 21 % 2;
        System.out.println(resto);

        // Operador lógico sempre retorna valor booleano < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10==10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isIgualVinte "+isIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // && (AND) || (OR) !

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 4799;
        double valorTotalDisponivel = valorTotalContaPoupanca + valorTotalContaCorrente;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel =  valorTotalDisponivel >= valorPlaystation;

        String isCompravelText = "Parabéns, você tem dinheiro o suficiente para comprar seu playstation";
        String isntCompravelText = "Se ferrou, junte mais dinheiro!";


        if (isPlaystationCincoCompravel) {
            System.out.println(isCompravelText);
        } else {
            System.out.println(isntCompravelText);
        }

        // = += -= *= /= %= //

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador ++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2);
      }
}
