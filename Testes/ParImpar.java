/*  Verificador de Número Par ou Ímpar  */

package Testes;
import javax.swing.JOptionPane;

public class ParImpar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog
        ("VAMOS VERIFICAR SE UM NUMERO É PAR OU ÍMPAR!\nDigite o número:"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, 
            String.format("O numero %d é par!", numero));
        } else {
            JOptionPane.showMessageDialog(null, 
            String.format("O numero %d é impar!", numero));
    }
  } 
}
