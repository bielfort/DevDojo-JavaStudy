package academy.devdojo.maratonajava.introducao;

// I want to know how much i have to pay in Netherlands 2020 based on my annual salary
// $ 0 $34,712 9.78%
// $34,713 $68,587 37.35%
// $68,588 49,5%

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 50000;
        double aliquota1 = salarioAnual <= 34713 ? 9.7 : 0;
        double aliquota2 = salarioAnual > 34713 && salarioAnual <= 68587 ? 37.50 : 0;
        double aliquota3 = salarioAnual >= 68588 ? 49.50 : 0;
        double aliquota;
        if (salarioAnual <= 34713){
            salarioAnual *= 0.0970;
            aliquota = aliquota1;
        }else if(salarioAnual > 34713 && salarioAnual <68587) {
            salarioAnual *= 0.3735;
            aliquota = aliquota2;
        } else {
            salarioAnual *= 0.495;
            aliquota = aliquota3;
        }
        System.out.println("O imposto sobre seu salário anual é de: " + salarioAnual + " e a aliquota utilizada foi: " + aliquota + "%.");
    }

 }
