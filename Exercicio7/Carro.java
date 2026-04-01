package Exercicio7;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // a) Atributo static: ele é compartilhado por TODOS os carros criados.
    // Começa em zero e fica guardado na "Classe", não dentro de cada objeto.
    public static int totalCarros = 0;

    // b) Incrementando nos construtores
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        // Toda vez que alguém usar esse construtor, somamos 1 no contador geral
        totalCarros++;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        // Mesmo criando um carro "vazio", ele ainda é um carro, então somamos 1
        totalCarros++;
    }

    // Métodos exibir e getters/setters (pode manter os mesmos dos exercícios anteriores)
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo);
    }
}