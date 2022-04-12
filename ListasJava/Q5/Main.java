import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean continuar = true;
    Gerenciador geren = new Gerenciador();
    Scanner scan = new Scanner(System.in);

    while (continuar == true) {
      System.out.println("Menu\n"
                        + "1 - Adicionar uma temperatura\n"
                        + "2 - Calcular média\n"
                        + "0 - Fechar");
      char input = scan.next().charAt(0);

      switch(input) {
        case '1':
          System.out.println("Digite o mês referente a essa temperatura");
          String mes = scan.next();

          System.out.println("Digite a temperatura do mês");
          double temp = scan.nextDouble();

          Temperatura temperatura = new Temperatura(temp, mes);
          geren.addTemp(temperatura);
          break;
        case '2':
          geren.calcMedia();
          break;
        case '0':
          System.out.println("Finalizando...");
          continuar = false;
          break;
        default:
          System.out.println("Caracter incorreeto, por favor insira um caracter válido");
      }
    }
  }
}