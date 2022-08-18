package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seuginte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o <salário>, na data <data>.
 */


public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Gabriel";
        String endereço = "Rua do Marques, Nº 25, Apt 407, Cidade Universitária, Recife/PE";
        double salario = 4000.50;
        String dataRecebimentoSalario = "01/01/2023";
        String relatorio = "Eu "+nome+" morando no endereço " + endereço +
                        ", confirmo que recebi R$" + salario + ", na data de " + dataRecebimentoSalario+".";

        System.out.println(relatorio);

   }


}
