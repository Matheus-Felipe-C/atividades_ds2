import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Pilha pilha = new Pilha();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número, digite 0 para desempilhar");
            int num = scan.nextInt();

            pilha.addNum(num);
        }

        pilha.removeAll();
        scan.close();
    }
}
