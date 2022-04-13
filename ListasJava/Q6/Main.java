import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) throws Exception {
        List<String> perguntas = Arrays.asList("Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou para a vítima?");
        List<Character> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean continua = true;
        int count = 0;

        while (continua) {
            respostas.clear();
            System.out.println("Responda as perguntas apenas com a verdade");

            for (int i = 0; i < perguntas.size(); i++) {
                System.out.println(perguntas.get(i));
                System.out.println("1 - Sim\n" + "0 - Não");
                char input = scan.nextLine().charAt(0);

                if (Character.compare(input, '1') != 0 && Character.compare(input, '0') != 0) {
                    System.out.println("Resposta incorreta, por favor digite uma resposta válida");
                    i--;
                } else
                    respostas.add(input);
            }

            for(Character i: respostas){
                if (i == '1') count++;
            }

            if (count == 5) System.out.println("Assassino");
            if (count >= 3 && count <=4) System.out.println("Cúmplice");
            if (count == 2) System.out.println("Suspeita");
            if (count < 2) System.out.println("Inocente");
            continua = false;
        }
    }
}