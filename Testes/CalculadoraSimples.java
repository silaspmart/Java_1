/* Objetivo: Ler dois números e uma operação (+, -, *, /) e exibir o resultado. */

package Testes;

import javax.swing.JOptionPane;

public class CalculadoraSimples {
    public static void main(String[] args) {
        try {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            String[] opcoes = {"+", "-", "*", "/"};
            String op = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha uma operação:",
                    "Calculadora Simples",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    "+"
            );

            double resultado = switch (op) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> (num2 != 0) ? num1 / num2 : Double.NaN;
                default -> Double.NaN;
            };

            if (Double.isNaN(resultado)) {
                JOptionPane.showMessageDialog(null, "Operação inválida ou divisão por zero!");
            } else {
                JOptionPane.showMessageDialog(null,
                        String.format("%.2f %s %.2f = %.2f", num1, op, num2, resultado),
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
