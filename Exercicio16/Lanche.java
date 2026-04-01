package Exercicio16;

public class Lanche {
    private String nome;
    private double preco;

    public Lanche(String nome, double preco) {
        this.nome = nome;
        setPreco(preco); // Usa o setter para validar
    }

    public String getNome() { return nome; }

    public double getPreco() { return preco; }

    public void setPreco(double preco) {
        // Validação: preço nunca pode ser negativo
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: Preço não pode ser negativo! Definido como 0.");
            this.preco = 0;
        }
    }

    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}