package Exercicio9;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // Criando a constante: static (da classe) e final (não muda nunca)
    // Por padrão, nomes de constantes em Java são escritos em MAIÚSCULAS
    public static final int ANO_PRIMEIRO_CARRO = 1886;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.setAno(ano); // Usamos o setter para validar
    }

    public void setAno(int ano) {
        // Substituindo o número "mágico" pela nossa constante
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
            System.out.println("Erro: O ano " + ano + " é inválido!");
        } else {
            this.ano = ano;
        }
    }

    public void exibir() {
        System.out.println("Carro: " + marca + " - Ano: " + ano);
    }
}