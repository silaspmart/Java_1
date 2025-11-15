package Aula4.Escola;

public class Escola {
    String nomeDoCurso;
    Aluno [] alunosMatriculados;
    int vagasOcupadas = 0;

    public Escola(String nome, int totalVagas) {
        this.nomeDoCurso = nome;
        this.alunosMatriculados = new Aluno [totalVagas];
    }
    
    public void matricular(Aluno novoAluno) {
        if (vagasOcupadas < alunosMatriculados.length) {
            alunosMatriculados[vagasOcupadas] = novoAluno;
            vagasOcupadas++;
            System.out.println("Matricula de " +novoAluno.nome+ " realizada!");
        } else {
            System.out.println("Não há vagas disponiveis");
        }
    } 
}
