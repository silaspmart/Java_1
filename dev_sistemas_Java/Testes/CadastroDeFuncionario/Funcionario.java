package Testes.CadastroDeFuncionario;

public class Funcionario {
    String nome, cargo;
    double salario;

    public Funcionario (String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario () {
        double percentual;

        if (salario < 2500) {
            percentual = 10;
        } else if (salario < 5000) {
            percentual = 8.5;
        } else {
            percentual = 6;
        }
        salario += salario * (percentual/100);
    }

    public void exibirDados () {
        System.out.printf("NOME: %s \nCARGO: %s\nSALARIO ATUAL: R$ %.2f\n\n",nome, cargo, salario);
    }
}