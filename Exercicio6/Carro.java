package Exercicio6;

public class Carro {
    // Nossos atributos no cofre
    private String marca;
    private String modelo;
    private int ano;

    // a) Construtor 1 (Igual ao do Exercício 5)
    // Esse aqui obriga a passar os três dados na hora de criar.
    public Carro(String marca, String modelo, int ano) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    // b) Construtor 2 (O novo, sem parâmetros)
    // Esse não pede nada nos parênteses (). Ele mesmo preenche com dados padrão!
    public Carro() {
        // Como a gente tem aquela regra de validação do ano no setAno (que não aceita ano 0),
        // aqui vamos colocar o valor direto no atributo para o nosso carro "Desconhecido" dar certo.
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }

    // --- Getters e Setters (Continuam iguais aos do Ex 4 e 5) ---
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