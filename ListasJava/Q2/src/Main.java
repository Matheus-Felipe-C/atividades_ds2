
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[4];
        GerenciadorDeAlunos geren = new GerenciadorDeAlunos();
        
        System.out.println("Oi! Bem vindo!");
        
        //Pegando dados do aluno
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno");
            String nome = scan.next();
            
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite as notas do aluno");
                notas[j] = scan.nextDouble();
            }
            
            //Adicionando aluno a lista
            Alunos aluno = new Alunos(nome);
            aluno.setNotas(notas);
            aluno.calcMedia();
            geren.addAluno(aluno);
        }
        
        //Motrando resultados
        System.out.println("Alunos com media maior que 7:\n"
                + geren.toString());
    }
}
