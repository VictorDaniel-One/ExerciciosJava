package Exercicio20;

public class Marmita {
    private String descricao;
    private char tamanho; // P, M ou G
    private double preco;

    // Constantes de preço conforme o enunciado
    public static final double PRECO_P = 18.00;
    public static final double PRECO_M = 25.00;
    public static final double PRECO_G = 32.00;

    public Marmita(String descricao, char tamanho) {
        this.descricao = descricao;
        this.tamanho = Character.toUpperCase(tamanho);
        definirPreco();
    }

    private void definirPreco() {
        if (this.tamanho == 'P') this.preco = PRECO_P;
        else if (this.tamanho == 'M') this.preco = PRECO_M;
        else if (this.tamanho == 'G') this.preco = PRECO_G;
        else {
            this.preco = 0;
            System.out.println("Tamanho inválido!");
        }
    }

    public double getPreco() { return preco; }
    public String getDescricao() { return descricao; }
    public char getTamanho() { return tamanho; }

    @Override
    public String toString() {
        return descricao + " (Tamanho " + tamanho + ") - R$ " + preco;
    }
}