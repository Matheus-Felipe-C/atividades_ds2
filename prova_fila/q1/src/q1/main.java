/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ALUNO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Documento> queue = new LinkedList<>();
        Documento doc1 = new Documento("Doc1", 10);
        Documento doc2 = new Documento("Doc2", 15);
        Documento doc3 = new Documento("Doc3", 5);
        
        System.out.println("Adicionando documentos...");
        queue.add(doc1);
        queue.add(doc2);
        queue.add(doc3);

        System.out.println("Tamanho da fila: " + queue.size());

        System.out.println("Imprimindo documentos...");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("Tamanho da fila: " + queue.size());    }
    
}
