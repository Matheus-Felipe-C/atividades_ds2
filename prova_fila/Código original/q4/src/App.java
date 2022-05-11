import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Crianca> roda = new LinkedList<>();
        Queue<Crianca> roda2 = new LinkedList<>();
        Random random = new Random();
        int i = 0;
        Crianca c1 = new Crianca("João");
        Crianca c2 = new Crianca("Maria");
        Crianca c3 = new Crianca("Asta");
        Crianca c4 = new Crianca("Ana");

        roda.add(c1);
        roda.add(c2);
        roda.add(c3);
        roda.add(c4);

        while (roda.size() != 1) {
            i = random.nextInt(roda.size());

            System.out.println("Batata quente, quente, quente... Queimou!");

            for (int count = 0; count <=i; count++) {
                roda2.add(roda.remove());
            }
            System.out.println("Removido - " + roda.poll());

            for (int count = 0; count <=i; count++) {
                roda.add(roda2.remove());
            }
        }
        System.out.println("Vencedor - " + roda.peek());
    }
}
