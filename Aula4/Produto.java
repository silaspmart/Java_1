/* -> Crie uma nova classe cahamada produto
 * -> Adicion a ela os seguintes atributos: String nome, int código, double preço
 * -> No método maiin, crie uma instancia (objeto) da classe produto
 * -> Peça para o usuario digitar os produtos via Scanner
 *   Ao final exiba os dados do produto que você cadastrou  */

package Aula4;

import java.util.Scanner;

public class Produto {
    String nome;
    int codigo;
    double preco;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto prod1 = new Produto();

        System.out.print("Cadastre o nome do produto: ");
        prod1.nome = sc.nextLine();
        System.out.print("Cadastre o codigo do produto: ");
        prod1.codigo = sc.nextInt();
        System.out.print("Cadastre o preco do produto: ");
        prod1.preco = sc.nextDouble();

        System.out.printf("\nProduto: %s \n", prod1.nome);
        System.out.printf("Codigo: %d \n", prod1.codigo);
        System.out.printf("Preco: R$ %.2f \n", prod1.preco);
        System.out.println();
        sc.close();
    }
}
