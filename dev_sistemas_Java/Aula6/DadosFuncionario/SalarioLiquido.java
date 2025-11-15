package Aula6.DadosFuncionario;

import javax.swing.JOptionPane;

public class SalarioLiquido {
    public static void main(String[] args) {
        String nome;
        double salario;
        String inputSalario;

        // Entrada do nome
        nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionário:");

        // Entrada do salário
        inputSalario = JOptionPane.showInputDialog(null, "Digite o salário do funcionário: R$");
        salario = Double.parseDouble(inputSalario);

        // Criar objeto
        Funcionario funcionario = new Funcionario(nome, salario);

        // Cálculo dos descontos e salário final
        double inss = funcionario.calcularInss();
        double vt = funcionario.calcularVT();
        double salarioFinal = salario - inss - vt;

        // Mensagem formatada
        String mensagem = String.format(
            "Nome: %s\nSalário Bruto: R$ %.2f\nINSS (11%%): R$ %.2f\nVT (6%%): R$ %.2f\nSalário Líquido: R$ %.2f",
            funcionario.getNome(), funcionario.getSalario(), inss, vt, salarioFinal
        );

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

