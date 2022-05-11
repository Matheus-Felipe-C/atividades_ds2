import java.util.List;
import java.util.ArrayList;

public class Gerenciador {
  private List<Temperatura> temperatura = new ArrayList<>();

  public void addTemp(Temperatura temp) {
    temperatura.add(temp);
  }

  public void calcMedia() {
    double media = 0;
    for (int i = 0; i < temperatura.size(); i++) {
      media += temperatura.get(i).getTemp();
    }
    media /= temperatura.size();

    for (int i = 0; i < temperatura.size(); i++) {
      if (temperatura.get(i).getTemp() > media) {
        System.out.println(temperatura.get(i).getNome() + " , " + temperatura.get(i).getTemp());
      }
    }
  }
}