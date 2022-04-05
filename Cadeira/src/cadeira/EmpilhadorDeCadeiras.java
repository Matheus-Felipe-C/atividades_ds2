/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeira;

import java.util.Stack;

/**
 *
 * @author ALUNO
 */
public class EmpilhadorDeCadeiras {
    private Stack <Cadeira> pilha = new Stack <Cadeira>();
    
    public String empilhar(Cadeira c){
        pilha.add(c);
        return "Cadeira adicionada a pilha";
    }
    
    public String desempilhar(){
        pilha.pop();
        return "Cadeira removida da pilha";
    }
    
    public void imprimir(){
        for(Cadeira c: pilha){
            System.out.println(c);
        }
    }
}
