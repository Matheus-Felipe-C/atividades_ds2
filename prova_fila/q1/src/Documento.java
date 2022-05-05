public class Documento {
    private int folhas;
    private String nome;

    
    public Documento() {
    }

    public Documento(String nome, int folhas) {
        this.nome = nome;
        this.folhas = folhas;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getFolhas() {
        return folhas;
    }
    public void setFolhas(int folhas) {
        this.folhas = folhas;
    }

    @Override
    public String toString() {
        return "Documento [folhas=" + folhas + ", nome=" + nome + "]";
    }

}
