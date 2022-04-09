import java.util.List;
import java.util.ArrayList;

public class Aluno {
  private String nome;
  private List<Double> notas = new ArrayList<>();
  private double media;

  public Aluno(String nome, List<Double> notas) {
    this.nome = nome;
    this.notas = notas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Double> getNotas() {
    return notas;
  }
  
  public void setNotas(List<Double> notas) {
    this.notas = notas;

  }

  public double getMedia() {
    double sum = 0;
    for (Double nota : notas) sum += nota;
    media = sum/notas.size();
    return media;
  }
}