package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salário;

       public void imprime(){
        super.imprime();
        System.out.println(salário);
    }

    public void relatorioPagamento(){
        System.out.println("Eu" + this.nome + " recebi o salario de" + this.salário);
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }
}
