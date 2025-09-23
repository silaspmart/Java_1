// Criar uma nova classe com o nome CalculadoraMedia. Criar 4 variaveis com o nome nota1, nota2, nota3, nota4 com valores iniciais qualquer 
// e exibir a media no console

public class CalculadoraMedia {
    public static void main (String[] args) {
        int nota1 = 10;
        int nota2 = 30;
        int nota3 = 50;
        int nota4 = 90;

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A media e: " +media);
    }
}
