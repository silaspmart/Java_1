// Criar uma nova classe com o nome DivisaoComResto. Crie duas variaveis inteiras, totalDeItens e capacidadeDaCaixa. Calcule quantas caixas serão 
// preenchidas completamente e quantos itens sobrarão

public class DivisaoComResto {
    public static void main(String [] args) {
        int totalDeItens = 34;
        int capacidadeDaCaixa = 6;

        System.out.println("\nSerao preenchidas " +totalDeItens/capacidadeDaCaixa+ " caixas\nSobrarao " +totalDeItens%capacidadeDaCaixa+ " itens\n");
    }
}
