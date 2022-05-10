public class Crianca {
    private String nome;

    public Crianca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Crianca [nome=" + nome + "]";
    }

    
}
