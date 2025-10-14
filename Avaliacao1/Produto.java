package Avaliacao1;

public class Produto {
    public long codigo;
    public String nome;
    public String categoria;
    public double preco;
    public int qtdEstoque;

    public Produto(long codigo, String nome, String categoria, double preco, int qtdEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public double calcularValorTotal() {
        return preco * qtdEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("******************************");
        System.out.printf("Código: %s\n", codigo);
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Categoria: %s\n", categoria);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.printf("Quantidade em Estoque: %d\n", qtdEstoque);
        System.out.printf("Valor Total: R$ %.2f\n", calcularValorTotal());
        System.out.println("******************************");
    }
}
