import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Carro> lista = new ArrayList<>();
        Carro carro1 = new Carro("Carro 1", "Fusca", 7);
        Carro carro2 = new Carro("Carro 2", "Gol", 10);
        Carro carro3 = new Carro("Carro 3", "Uno", 12.5);
        Carro carro4 = new Carro("Carro 4", "Vectra", 9);
        Carro carro5 = new Carro("Carro 5", "Peugout", 14.5);

        lista.add(carro1);
        lista.add(carro2);
        lista.add(carro3);
        lista.add(carro4);
        lista.add(carro5);

        for (Carro carro : lista) {
            System.out.println(carro.getNome());
            System.out.println(carro.getMarca());
            System.out.println(carro.getConsumo());
        }

        System.out.println("\nRelatório final:");

        for (Carro carro : lista) {
            int km = 1000;
            double preco = 2.25;
            double gasto = round((km/carro.getConsumo()) * preco);

            System.out.println(carro.getNome() + " - " + carro.getMarca() + " - " + carro.getConsumo() + " - " + ));
        }
    }
}
