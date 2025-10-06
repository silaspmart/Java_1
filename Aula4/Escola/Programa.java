package Aula4.Escola;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Escola senai = new Escola("Curso TI", 10);
        String nome;
        int mat;

        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.print("Digite a matricula do aluno: ");
        mat = sc.nextInt();

        Aluno novoAluno = new Aluno(nome, mat);
        senai.matricular(novoAluno);
        sc.close();
    }
}
