import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Gerenciador geren = new Gerenciador();
    Scanner scan = new Scanner(System.in);

    boolean continuar = true;
    while (continuar) {
      System.out.println("Menu:");
      System.out.println("1 - Adicionar aluno\n"
                        + "2 - Ver quais alunos possuem média maior que 7\n"
                        + "Digite 0 para fechar a aplicação");
      int input = scan.nextInt();

      switch (input) {
        case 1:
          List<Double> notas = new ArrayList<>();
          System.out.println("Digite o nome do aluno");
          String nome = scan.next();

          double nota = 0;
          while (nota >= 0) {
            System.out.println("Digite a nota do aluno ou"
                              + " digite um número negativo para sair");
            nota = scan.nextDouble();

            if (nota < 0) {
              Aluno aluno = new Aluno(nome, notas);
              geren.addAluno(aluno);
              break;
            }
            notas.add(nota);
          }
          break;
        case 2:
          geren.mediaSete();
          break;
        case 0:
          System.out.println("Fechando...");
          continuar = false;
          break;
        default:
          System.out.println("Caractere inválido, por favor digite um caracter válido");
          }
      }
    }  
  }
