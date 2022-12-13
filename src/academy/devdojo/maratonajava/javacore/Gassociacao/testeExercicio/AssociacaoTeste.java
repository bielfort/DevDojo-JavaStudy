package academy.devdojo.maratonajava.javacore.Gassociacao.testeExercicio;

import academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Gabriel", "27");
        Professor professor = new Professor("Will", "Java");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Como programar", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
