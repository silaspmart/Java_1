package Avaliacao1;

public class Produto {
    private long codigo;
    private String nome;
    private String categoria;
    private double preco;
    private int qtdEstoque;

    public Produto(long codigo, String nome, String categoria, double preco, int qtdEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public long getCodigo() { return codigo; }
    public void setCodigo(long codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getQtdEstoque() { return qtdEstoque; }
    public void setQtdEstoque(int qtdEstoque) { this.qtdEstoque = qtdEstoque; }

    public double calcularValorTotal() {
        return preco * qtdEstoque;
    }

    // Exibe informações do produto em tabela
    public void exibirTabela() {
        System.out.printf("%-8d | %-20s | %-15s | R$ %8.2f | %5d | R$ %10.2f%n",
                codigo, nome, categoria, preco, qtdEstoque, calcularValorTotal());
    }
}
