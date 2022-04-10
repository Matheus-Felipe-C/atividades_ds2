public class Temperatura {
  private double temp;
  private String mes;

  public Temperatura(double temp, String mes) {
    this.temp = temp;
    this.mes = mes;
  }

  public void setTemp(double temp) {
    this.temp = temp;
  }

  public double getTemp() {
    return this.temp;
  }

  public void setMes(String mes) {
    this.mes = mes;
  }

  public String getNome() {
    return this.mes;
  }
}