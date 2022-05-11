/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author ALUNO
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Queue<Pessoa> queue = new PriorityQueue<>();
        Pessoa p1 = new Pessoa(0, "Joseilson");
        Pessoa p2 = new Pessoa(1, "Marlon");
        Pessoa p3 = new Pessoa(0, "Maria");

        System.out.println("Adicionando pessoas a fila...");
        queue.add(p2);
        queue.add(p1);
        queue.add(p2);
        queue.add(p2);
        queue.add(p3);

        System.out.println("Chamando pessoas...");

        for (int count = 0; queue.size() != 0; count++) {
            /* Se mais de 3 pessoas com prioridade foram atendidas, uma pessoa
            normal (aux) será atendida */
            if (count >= 3) {
                for (Pessoa aux : queue) {
                    if (aux.getPrioridade() == 3) {
                        System.out.println(aux);
                        queue.remove(aux);
                        count = 0;
                        continue;
                    }
                }
            }
            System.out.println(queue.poll() + "\n");
            count++;
        }

    }
    
}
