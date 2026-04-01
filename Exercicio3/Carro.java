package Exercicio3;

public class Carro {
    // Atributos (as características do nosso carro)
    String marca;
    String modelo;
    int ano;

    // Método que mostra os dados do carro na tela
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " - Ano: " + ano);
    }

    // Método que calcula a idade do carro
    public int idadeDoCarro() {
        return 2026 - ano;
    }
}