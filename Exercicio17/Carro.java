package Exercicio17;

public class Carro {
    private String placa;
    private String modelo;

    public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() { return placa; }

    @Override
    public String toString() {
        return "Modelo: " + modelo + " [Placa: " + placa + "]";
    }
}