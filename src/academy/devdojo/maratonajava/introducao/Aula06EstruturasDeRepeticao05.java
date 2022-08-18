package academy.devdojo.maratonajava.introducao;

import java.text.DecimalFormat;

public class Aula06EstruturasDeRepeticao05 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição é que valorParcela >= 1000

    public static void main(String[] args) {
        double valorTotal = 34579;

        for (int parcela = (int)valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Você pode parcelar o carro em " + parcela + " parcelas de R$ " + new DecimalFormat(
                    "#,##0.00").format(valorParcela));
        }
    }
}