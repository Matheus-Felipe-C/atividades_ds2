/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author ALUNO
 */
public class Pessoa implements Comparable<Pessoa> {
    private int prioridade;
    private String nome;

    public Pessoa(int prioridade, String nome) {
        this.prioridade = prioridade;
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", prioridade=" + prioridade + "]";
    }
    
    @Override
    public int compareTo(Pessoa o) {
        if (this.getPrioridade() > o.getPrioridade()) return 1;
        if (this.getPrioridade() < o.getPrioridade()) return -1;
        else return 0;
    }

}

