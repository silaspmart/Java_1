// Criar uma classe com o nome SituacaoAluno. Faça um programa com duas variaveis nota1 e nota2 com valor inicial definido.
// Calcule a maedia e caso o valor maior ou igual a 7 devera ser exibido a mensage, "Aprovado". Caso a média for menor que 7, escreva
// reprovado, e se a média for igual a 10, "aprovado, parabéns!"

public class SituacaoAluno {
    public static void main(String [] args) {
        double nota1 = 5.8, nota2 = 8.6, media =(nota1+nota2)/2;

        if (media == 10) {
            System.out.println("\nSua media foi de " +media+ ". Aprovado, parabens!\n"); 
        } else if (media >=7) {
            System.out.println("\nSua media foi de " +media+ ".Aprovado\n");
        } else {
            System.out.println("Sua media foi de " +media+ ".\nReprovado\n");
        }
    }
}
