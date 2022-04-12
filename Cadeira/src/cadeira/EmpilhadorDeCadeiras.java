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
    private List<Stack> lista = new ArrayList<>();
    
    
    public String empilhar(Cadeira c){
        
        //Verifica se listaPilha está vazia

        if (lista.isEmpty()) {
            Stack <Cadeira> aux = new Stack<>();
            aux.add(c);
            lista.add(aux);
        }
        else {
            boolean adicionado = false;
            for (Stack <Cadeira> s: lista) {
                if (s.get(0).getModelo().equals(c.getModelo()) && s.size() < 10) {
                    s.add(c);
                    adicionado = true;
                    break;
                }
            }
            if (!adicionado) {
                Stack<Cadeira> aux2 = new Stack<>();
                aux2.add(c);
            }
        }

        return "Cadeira adicionada";
    }
    
    public String desempilhar(String modelo){
        for (Stack<Cadeira> s: lista) {
            if (s.get(0).getModelo().equals(s)) {
                s.pop();
                return "Cadeira removida da pilha";
            }
        }
        return "Não existe nenhuma cadeira com esse modelo nas pilhas";
    }
    
    public void imprimir(){
        for(Stack<Cadeira> s: lista){
            System.out.println(s);
        }
    }
}
