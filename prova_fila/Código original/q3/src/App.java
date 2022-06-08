import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Pessoa> queue = new PriorityQueue<>();
        Random random = new Random();
        int i = 0;
        Pessoa p1 = new Pessoa(0, "Joseilson");
        Pessoa p2 = new Pessoa(1, "Marlon");
        Pessoa p3 = new Pessoa(2, "Maria");

        System.out.println("Adicionando pessoas a fila...");
        queue.add(p2);
        queue.add(p1);
        queue.add(p2);
        queue.add(p2);
        queue.add(p3);

        System.out.println("Chamando pessoas...");

        for (int count = 0; queue.size() != 0; count+=5) {
            
            /* Se a contagem (segundos) for maior ou igual a 4, adicione uma
            pessoa com prioridade aleatória */
            if (count >= 4) {
                int num = random.nextInt(2);

                switch (num) {
                    case 0:
                        queue.add(p1);
                        count -= 4;
                    case 1:
                        queue.add(p2);
                        count -= 4;
                    case 2:
                        queue.add(p3);
                        count -= 4;
                }
            }

            System.out.println(queue.poll() + "\n");
            i++;

            if (i == 10) break;
        }
        System.out.println(queue);

    }
}
