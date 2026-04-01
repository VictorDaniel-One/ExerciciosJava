package Exercicio4;

public class Carro {
    // a) Atributos agora são 'private' (trancados no cofre!)
    private String marca;
    private String modelo;
    private int ano;

    // b) Criando os Getters e Setters (nossos "intermediários")

    // --- Métodos para a MARCA ---
    public String getMarca() {
        return marca; // Devolve o valor que está no cofre
    }

    public void setMarca(String marca) {
        this.marca = marca; // Guarda o novo valor no cofre
    }

    // --- Métodos para o MODELO ---
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // --- Métodos para o ANO (com a regra especial da letra 'c') ---
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        // c) Validação: O primeiro carro foi inventado em 1886. Não podemos ir além de 2026.
        if (ano < 1886 || ano > 2026) {
            System.out.println("Erro: O ano " + ano + " é inválido para um carro!");
        } else {
            this.ano = ano; // Se a regra foi respeitada, a gente guarda o valor
        }
    }

    // Nossos métodos antigos continuam aqui normalmente
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " - Ano: " + ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }
}