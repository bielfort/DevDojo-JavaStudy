package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;


public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gabriel";
        estudante01.idade = 27;
        estudante01.sexo = 'H';

        estudante02.nome = "Sakura";
        estudante02.idade = 29;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();


    }
}
