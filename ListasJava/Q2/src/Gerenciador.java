import java.util.List;
import java.util.ArrayList;

public class Gerenciador {
  List<Aluno> alunos = new ArrayList<>();

  public void addAluno(Aluno aluno) {
    alunos.add(aluno);
  }

  public void mediaSete() {
    for (Aluno aluno : alunos) {
      if (aluno.getMedia() >= 7) {
        System.out.println(aluno.getNome() + "," + aluno.getMedia());
      }
    }
  }
}