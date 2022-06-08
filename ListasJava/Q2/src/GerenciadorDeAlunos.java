
import java.util.ArrayList;
import java.util.List;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class GerenciadorDeAlunos {
    private List<Alunos> alunos = new ArrayList<>();
    
    public String addAluno(Alunos aluno) {
        if (aluno.calcMedia() >= 7.0) {
            alunos.add(aluno);
            return "Aluno adicionado com sucesso";
        }
        return null;
    }

    @Override
    public String toString() {
        return "GerenciadorDeAlunos{" + "alunos=" + alunos + '}';
    }
    
    
}

