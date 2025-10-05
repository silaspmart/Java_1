/* Converter um valor em reais para dólares. */

package Testes;
import javax.swing.JOptionPane;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        double real = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais (R$):"));
        double cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação atual do dólar:"));
        double dolar = real / cotacao;

        JOptionPane.showMessageDialog(null, String.format("R$ %.2f equivalem a US$ %.2f", real, dolar));
    }
}
