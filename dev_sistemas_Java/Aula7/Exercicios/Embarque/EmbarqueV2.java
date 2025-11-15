package Aula7.Exercicios.Embarque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class EmbarqueV2 {
    public static void main(String[] args) {
        Queue <Pessoa> filaPrincipal = new ArrayDeque<>();
        Deque <Pessoa> areaDeEmbarque = new ArrayDeque<>();

        filaPrincipal.offer(new Pessoa("Ana", 22));
        filaPrincipal.offer(new Pessoa("Bruno", 31));
        filaPrincipal.offer(new Pessoa("Carla", 28));
        filaPrincipal.offer(new Pessoa("Diego", 35));
        filaPrincipal.offer(new Pessoa("Elaine", 26));
        filaPrincipal.offer(new Pessoa("Fabio", 40));
        filaPrincipal.offer(new Pessoa("Gisele", 33));
        filaPrincipal.offer(new Pessoa("Henrique", 45));
        filaPrincipal.offer(new Pessoa("Isabela", 29));
        filaPrincipal.offer(new Pessoa("João", 38));

        while(!filaPrincipal.isEmpty()) {
            System.out.println("========================================");
            System.out.println("=   Próxima viagem com 4 passageiros   =");
            System.out.println("========================================");

            for(int i=0 ; i<4 && !filaPrincipal.isEmpty(); i++) {
                System.out.println("A pessoa " +filaPrincipal.peek().getNome()+ " está embarcando!");
                Pessoa p = filaPrincipal.poll();
                areaDeEmbarque.push(p);
            }
    
            System.out.println("\nPassageiros entrando de frente pra trás:");
            while (!areaDeEmbarque.isEmpty()) {
                Pessoa p = areaDeEmbarque.pop();
                System.out.println("A pessoa " +p.getNome()+ " sentou no ônibus!");
            }
        }
        System.out.println("Embarque concluido!\n------------------------------------------");
    }
}
