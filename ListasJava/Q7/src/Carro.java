public class Carro {
    private String nome;
    private String marca;
    private double consumo;
    
    public Carro(String nome, String marca, double consumo) {
        this.nome = nome;
        this.marca = marca;
        this.consumo = consumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}
