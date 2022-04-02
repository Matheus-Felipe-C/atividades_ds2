import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();
        String desc = "", marca = "", nDesc = "", nMarca = "";
        Double preco = 0.0, nPreco = 0.0;

        System.out.println("Olá! Bem vindo!");
        
        while (true) {
            System.out.println("Menu");
            System.out.println("1 - Adicionar um produto\n2 - Consultar um produto\n3 - Atualizar um produto");
            System.out.println("4 - Remover um produto");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Digite a descrição do produto");
                    desc = sc.next();
                    System.out.println("Digite a marca do produto");
                    marca = sc.next();
                    System.out.println("Digite o preço do produto");
                    preco = sc.nextDouble();

                    Produto produto = new Produto(desc, marca, preco);

                    gerenciador.addProduto(produto);

                    break;
                
                case 2:
                    System.out.println("Digite a descrição do produto");
                    desc = sc.next();
                    System.out.println("Digite a marca do produto");
                    marca = sc.next();

                    if (gerenciador.consultaProduto(desc, marca) == null) System.out.println("Produto não encontrado");
                    else System.out.println(gerenciador.consultaProduto(desc, marca));

                    break;

                case 3:
                    System.out.println("Digite a descrição do produto a ser removida");
                    desc = sc.next();
                    System.out.println("Digite a marca do produto a ser removida");
                    marca = sc.next();
                    System.out.println("Digite a nova descrição a ser adicionada");
                    nDesc = sc.next();
                    System.out.println("Digite a nova marca a ser adicionada");
                    nMarca = sc.next();

                    System.out.println(gerenciador.atualizaProduto(desc, marca, nDesc, nMarca, nPreco));

                    break;

                case 4:
                    System.out.println("Digite a descrição do produto a ser removida");
                    desc = sc.next();
                    System.out.println("Digite a marca do produto a ser removida");
                    marca = sc.next();

                    System.out.println(gerenciador.removeProduto(desc, marca));

                    break;
            
                default:
                    System.out.println("Opção inválida, por favor selecione uma opção válida");
                    break;
            }
        }
        
    }
}
