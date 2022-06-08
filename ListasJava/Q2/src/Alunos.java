/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Alunos {
    private String nome;
    private double[] notas = new double[4];
    private double media;

    public Alunos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcMedia() {
        return media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
    }
        
    
}