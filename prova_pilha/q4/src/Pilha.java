import java.util.Stack;

public class Pilha {
    Stack<Character> pilha = new Stack<>();
    boolean err = false;

    public void addExp(String expressao) {
        char[] exp = expressao.toCharArray();
        
        for (int i = 0; i < expressao.length(); i++) {
            if (exp[i] == '(') {
                pilha.add(exp[i]);
                err = false;
            }
            else if (exp[i] == ')') {
                if (!removePare()) {
                    err = true;
                    break;
                }
        }
    }
    if (pilha.empty() && err == false) {
        System.out.println("A expressão está correta");
    } else if(!pilha.empty()) {
        System.out.println("A expressão está incorreta");
    }
}

    public boolean removePare() {
        if (!pilha.empty()) {
            pilha.pop();
            return true;
        } else {
            System.out.println("A expressão está incorreta");
            System.out.println("Há parênteses sem fechar corretamente");
            return false;
        }
    }

    public void clear() {
        pilha.clear();
    }
}