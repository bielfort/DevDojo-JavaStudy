package academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio;

public class Aluno {
    private String nome;
    private String idade;
    private Seminario seminario;

    public Aluno(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
