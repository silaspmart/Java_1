// Criar uma nova classe cm o nome ClassificadorDeIdade. Crie uma variavel idade com um valor inicial e use uma estrutura if-else para classificar e exibir
// no console se a pessoa é 'criança', 'adolescente', 'adulto' ou 'idoso'

public class ClassificadorDeIdade {
    public static void main(String [] args) {
        int idade = 60;

        if (idade < 12) {
            System.out.println("\nSua idade e " +idade+ ", portanto voce e crianca!\n");
        } else if (idade < 18) {
            System.out.println("\nSua idade e " +idade+ ", portanto voce e adolescente!\n");
        } else if (idade < 60) {
            System.out.println("\nSua idade e " +idade+ ", portanto voce e adulto!\n");
        } else {
            System.out.println("\nSua idade e " +idade+ ", portanto voce e idoso!\n");
        }
    }
}
