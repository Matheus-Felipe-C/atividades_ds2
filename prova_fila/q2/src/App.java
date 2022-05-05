import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Pessoa> queue = new PriorityQueue<>();
        Pessoa p1 = new Pessoa(3, "Joseilson");
        Pessoa p2 = new Pessoa(2, "Marlon");

        System.out.println("Adicionando pessoas a fila...");
        queue.add(p2);
        queue.add(p1);
        queue.add(p2);
        queue.add(p2);

        System.out.println("\nLista de pessoas: \n");
        System.out.println(queue.toString());

    }
}
