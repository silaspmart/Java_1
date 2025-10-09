package Testes.SistemaBancario;

public class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo = 0;

    public ContaBancaria (String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

        public void depositar(double valor) {
            saldo = saldo + valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso! Novo saldo: R$ %.2f%n", valor, saldo);
        }

        public void sacar(double valor) {
            if (saldo > valor) {
                System.out.println("❌ Saldo insuficiente!");
            } else {
            saldo = saldo - valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso! Novo saldo: R$ %.2f%n", valor, saldo);
            }
        }

        public void exibirInformacoes() {
            System.out.printf("NOME: %s \nCONTA: %s\nSALDO ATUAL: R$ %.2f\n\n",titular, numeroConta, saldo);
        }
    }

