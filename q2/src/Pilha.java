import java.util.Stack;

public class Pilha {
    private Stack<Integer> par = new Stack<>();
    private Stack<Integer> impar = new Stack<>();
    
    public Stack<Integer> getPar() {
        return par;
    }

    public Stack<Integer> getImpar() {
        return impar;
    }

    public void addNum(int num) {
        //Verifica se o número é par, ímpar ou 0
        if (num == 0) removeNum();

        else if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
            par.add(num);
        }
        else {
            System.out.println("O número " + num + " é impar");
            impar.add(num);
        }
    }

    public String removeNum() {

        //Se uma pilha estiver vazia, mostra uma mensagem
        if (par.size() == 0 || impar.size() == 0) {
            return "Uma das pilhas está vazia";
        }

        par.pop();
        impar.pop();
        return "Números foram removidos";
    }

    public void removeAll() {

        //Remove todos os items das pilhas par e impar e os mostra na tela
        System.out.println("Apagando items da lista par");
        
        while (!par.isEmpty()) {
            System.out.println(par.pop());
        }

        System.out.println("Apagando items da lista impar");

        while (!impar.isEmpty()) {
            System.out.println(impar.pop());
        }    
    }
}
