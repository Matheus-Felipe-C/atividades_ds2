import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Pilha pilha = new Pilha();
        char continuar = '1';

        while (continuar != '0') {

            
            System.out.println("Digite uma expressão com parênteses");
            String expressao = scan.next();
            
            pilha.addExp(expressao);
            

            System.out.println("Gostaria de continuar? Digite 0 para sair e qualquer coisa para continuar");
            continuar = scan.next().charAt(0);
            pilha.clear();
        }
        scan.close();
    }
}
