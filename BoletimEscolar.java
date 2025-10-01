/* Crie a classe BoletimEscolar, um sistema para gerenciar as notas da turma. Utilizando JOptionPane para uma interface mais
interativa, o programa deve solicitar as 4 notas bimestrais para 3 alunos diferentes, armazenando tudo em uma matriz 3x4. Os
prompts de entrada devem ser claros (ex: "Digite a 2a nota do Aluno 1"). Ao final do preenchimento, o sistema deve calcular a
média final de cada aluno (a média de cada linha da matriz) e exibir um relatório único com o resultado de todos. */

import java.util.Scanner;

public class BoletimEscolar {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int L = 3, C = 4;
        int [][] matriz = new int [L] [C];

        for (int i=0; i<L; i++) {
            for (int j=0; j<C; j++) {
                System.out.print("Digite o " +(j+1)+ " numero da " + (i+1)+ " linha: ");
                matriz [i] [j]= ler.nextInt();
            } 
        }
    }
    
}
