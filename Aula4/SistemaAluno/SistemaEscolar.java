/*  Usando a classe aluno que definimos, crie um programam principal. 
    Declare um vetor de Aluno com capacidade para 3 alunos.
    Use um laço for para percorrer o vetor. A cada iteração:
        a) Crie um novo objeto Aluno (new Aluno ()) e o coloque na posição atual do vetor
        b) Peça ao usuario para digitar o nome, matricula e nota daquele aluno
    Ao final do cadastro, use outro laço for para exibir os dados de todos os alunos da turma*/

package Aula4.SistemaAluno;
import java.util.Scanner;
public class SistemaEscolar {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Aluno [] turma = new Aluno[3];
        System.out.println("\n******* CADASTRO DE ALUNOS *******");

        for (int i=0; i<turma.length; i++) {
            turma[i] = new Aluno();

            System.out.printf("Informe o nome do aluno %d: ",i+1);
            turma[i].nome = sc.next();
            System.out.printf("Informe a matricula do aluno %d: ",i+1);
            turma[i].matricula = sc.nextInt();
            System.out.printf("Informe a nota do aluno %d: ",i+1);
            turma[i].notaFinal = sc.nextDouble();
            System.out.println();
        }
        System.out.println("\n****** PAINEL DA SITUAÇÃO DOS ALUNOS *****\n");;

        for (int i=0; i<turma.length; i++) {
            turma[i].mostrarDados();
            turma[i].verificarAprovacao();
            System.out.println("--------------------------");
        }
        sc.close();
    }  
}