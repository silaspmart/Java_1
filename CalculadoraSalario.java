// Crie uma classe com o nome CalculadoraSalario e defina uma variavel com o nome 'salario', inicialize a variavel com algum valor e
// exiba no console o valor com desconto do INSS

public class CalculadoraSalario {
    public static void main(String [] args) {
        double salario = 2568.37;

        if (salario <= 1751.81) {
            salario = salario*0.92;
        } else if (salario <= 2919.72) {
            salario = salario*0.91;
        } else if (salario <= 5839.45) {
            salario = salario*0.9;
        } else {
            salario = salario*0.89;
        }
        System.out.println("\nO salario e de: " +salario);
    }
}
