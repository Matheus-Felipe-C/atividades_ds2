public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("Leite em pó", "Ninho", 15.0);
        Produto produto2 = new Produto("Leite em pó", "Itambé", 15.0);
        Produto produto3 = new Produto("Leite em pó", "Glória", 1.76);

        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();

        System.out.println("Adicionando produtos");
        System.out.println(gerenciador.addProduto(produto1));
        System.out.println(gerenciador.addProduto(produto2));
        System.out.println(gerenciador.addProduto(produto3));

        System.out.println("\n");

        System.out.println("Consultando produtos");
        System.out.println(gerenciador.consultaProduto("Leite em pó", "Ninho"));
        System.out.println(gerenciador.consultaProduto("Leite em pó", "Itambé"));
        System.out.println(gerenciador.consultaProduto("Leite de pombo", "PomboINC"));

        System.out.println("\n");

        System.out.println("Removendo produtos");
        System.out.println(gerenciador.removeProduto("Leite em pó", "Glória"));
        System.out.println(gerenciador.removeProduto("Leite de pombo", "PomboINC"));
    
        System.out.println("\n");

        System.out.println("Atualizando produtos");
        System.out.println(gerenciador.addProduto(produto3));
        System.out.println(gerenciador.atualizaProduto("Leite em pó", "Glória", "Leite de pombo", "PomboINC", 0.99));
        System.out.println(gerenciador.consultaProduto("Leite de pombo", "PomboINC"));
        System.out.println(gerenciador.atualizaProduto("Leite em pó", "Glória", "Leite em pó", "Piracanjuba", 9.99));
    }
}
