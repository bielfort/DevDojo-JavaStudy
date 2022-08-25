package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class MetodoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Gabriel";
        funcionario.idade = 27;
        funcionario.salario = new double[]{1900, 1500, 1800};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();

    }
}
