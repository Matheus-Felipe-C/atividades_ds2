import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listaPrincipal = Arrays.asList(1,2,3,4,6,7,8,9,10);
        List<Integer> listaPares = new ArrayList<>();
        List<Integer> listaImpares = new ArrayList<>();

        for (int i = 0; i < listaPrincipal.size(); i++) {
            if (listaPrincipal.get(i) % 2 == 0) listaPares.add(listaPrincipal.get(i));
        }

    }
}
