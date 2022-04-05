/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeira;

/**
 *
 * @author ALUNO
 */
public class Cadeira {

    private String modelo;
    private Double pesoMaximo;

    public Cadeira(String modelo, Double pesoMaximo) {
        this.modelo = modelo;
        this.pesoMaximo = pesoMaximo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(Double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    @Override
    public String toString() {
        return "Cadeira{" + "modelo=" + modelo + ", pesoMaximo=" + pesoMaximo + '}';
    }
    
}
