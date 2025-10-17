package Aula6.Clinica;

import java.util.Scanner;

public class TestaMedico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consulta = 0;

        System.out.println("===== LISTAGEM DE MEDICOS =====\n");
        Medico medico1 = new Medico(12345, "Ana Maria", 0 , 250);
        Medico medico2 = new Medico(67890, "Jose Antonio", 0 , 300);
        Medico medico3 = new Medico(13579, "Silvia", 0 , 280);
        Medico medico4 = new Medico(24680, "Ranolpho", 0 , 320);
        Medico medico5 = new Medico(12568, "Celeste", 0 , 260);
        System.out.printf("Adicione o novo valor da consulta do médico %s: R$ ", medico2.getNome());

        while (true) {
            if (sc.hasNextDouble()) {
                consulta = sc.nextDouble();
                medico2.setVlrConsulta(consulta);
                break;
            } else {
                System.out.println("Entrada inválida!");
            }
        } 

        medico1.pagamentoDinheiro(medico1.getVlrConsulta());
        medico2.pagamentoCartao(medico2.getVlrConsulta());
        medico3.pagamentoCartao(medico3.getVlrConsulta());
        medico4.pagamentoDinheiro(medico4.getVlrConsulta());
        medico5.pagamentoCartao(medico5.getVlrConsulta());

        System.out.println();
        System.out.printf("Nome: %s\nSalario: R$ %.2f\n", medico1.getNome(), medico1.getSalario());
        System.out.println();
        System.out.printf("Nome: %s\nSalario: R$ %.2f\n", medico2.getNome(), medico2.getSalario());
        System.out.println();
        System.out.printf("Nome: %s\nSalario: R$ %.2f\n", medico3.getNome(), medico3.getSalario());
        System.out.println();
        System.out.printf("Nome: %s\nSalario: R$ %.2f\n", medico4.getNome(), medico4.getSalario());
        System.out.println();
        System.out.printf("Nome: %s\nSalario: R$ %.2f\n", medico5.getNome(), medico5.getSalario());
        System.out.println();
        System.out.printf("Total de médicos cadastrados: %d", Medico.getTotalMedicos());
        System.out.println("\n********************************************\n ");
    }
}
