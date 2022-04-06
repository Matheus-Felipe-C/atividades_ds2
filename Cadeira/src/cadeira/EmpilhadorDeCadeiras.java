/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeira;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author ALUNO
 */
public class EmpilhadorDeCadeiras {
    private List<Stack> listaPilha = new ArrayList<>();
    private Stack <Cadeira> pilha = new Stack <Cadeira>();
    
    public String empilhar(Cadeira c){
        
        //Verifica se listaPilha está vazia

        if (listaPilha.isEmpty()) {
            pilha.add(c);
            listaPilha.add(pilha);
            return "Cadeira empilhada";
        }
        
        //Verifica se os modelos da pilha são iguais

        if (pilha.get(pilha.size()-1).getModelo() == c.getModelo()) {
            return "Só se pode adicionar cadeiras de modelos iguais";
        }

        //Verifica se a pilha possui 10 ou mais elementos

        if (pilha.size() >= 10) {
            
        }
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
