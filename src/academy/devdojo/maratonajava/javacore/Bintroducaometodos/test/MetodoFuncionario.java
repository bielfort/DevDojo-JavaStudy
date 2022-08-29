package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class MetodoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gabriel");
        funcionario.setIdade(27);
        funcionario.setSalario(new double[]{1900, 1500, 1800});
        funcionario.imprime();

        System.out.println(funcionario.getMedia());
    }
}
