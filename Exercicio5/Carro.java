package Exercicio5;

public class Carro {
    // Nossos atributos continuam trancados no cofre (private)
    private String marca;
    private String modelo;
    private int ano;

    // a) Criando o nosso Construtor!
    // Ele tem sempre o MESMO NOME da classe e não tem a palavra "void".
    // É aqui que a gente avisa a fábrica: "Para criar um carro, você PRECISA me dar essas 3 informações logo de cara".
    public Carro(String marca, String modelo, int ano) {
        // Usamos os setters aqui dentro para aproveitar aquela regra de validação do ano que fizemos no ex. 4!
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    // --- Os Getters e Setters continuam aqui embaixo ---
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("Erro: O ano " + ano + " é inválido para um carro!");
        } else {
            this.ano = ano;
        }
    }

    // --- Nossos métodos de ação ---
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " - Ano: " + ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }
}