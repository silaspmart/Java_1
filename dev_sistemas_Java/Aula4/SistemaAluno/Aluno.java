package Aula4.SistemaAluno;

public class Aluno {
    String nome;
    int matricula;
    double notaFinal;

    void verificarAprovacao() {
        if (notaFinal >= 7.0) {
            System.out.println(nome+ " está APROVADO!");
        } else {
            System.out.println(nome+ " esta em RECUPERACAO!");
        }
    }

    void mostrarDados() {
        System.out.printf("Aluno: %s \n", nome);
        System.out.printf("Matricula: %d \n", matricula);
        System.out.printf("Nota %.2f: \n", notaFinal);
    }
}
