package Aula3;
/* Crie a classe BoletimEscolar, um sistema para gerenciar as notas da turma. Utilizando JOptionPane para uma interface mais
interativa, o programa deve solicitar as 4 notas bimestrais para 3 alunos diferentes, armazenando tudo em uma matriz 3x4. Os
prompts de entrada devem ser claros (ex: "Digite a 2a nota do Aluno 1"). Ao final do preenchimento, o sistema deve calcular a
média final de cada aluno (a média de cada linha da matriz) e exibir um relatório único com o resultado de todos. */

import javax.swing.JOptionPane;

public class BoletimEscolar {
    public static void main (String[] args) {
        int L = 3, C = 4;
        double [][] turma = new double [L] [C];
        double [] medias = new double[L];
        double soma = 0;

        JOptionPane.showMessageDialog(null,"BOLETIM ESCOLAR!\n Digite a seguir as 4 notas bimestrais dos alunos. "); 

        for (int i=0; i<turma.length; i++) {
            for (int j=0; j<turma[i].length; j++) {
                String message = String.format("Digite a %d nota do aluno %d: ", j+1, i+1);
                turma [i] [j]= Double.parseDouble(JOptionPane.showInputDialog(null, message));
                soma += turma [i][j];
            } 
            medias[i] = soma/turma[i].length;
            soma = 0;
        }
        String mensagemFinal = "Resultado final da turma \n\n";
        for (int i = 0; i < medias.length; i++) {
            mensagemFinal += i+1 + "º Aluno - media: " + String.format("%.2f", medias [i]) + "\n";
        }
        JOptionPane.showMessageDialog(null, mensagemFinal);
    }
}
