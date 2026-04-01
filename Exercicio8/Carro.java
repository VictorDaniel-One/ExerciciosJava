package Exercicio8;

public class Carro {
    private String modelo; // Atributo de instância (cada carro tem o seu)
    public static int totalCarros = 0; // Atributo static (geral)

    public Carro(String modelo) {
        this.modelo = modelo;
        totalCarros++;
    }

    // a) Criando o método static
    public static void imprimirTotal() {
        System.out.println("Total de carros no sistema: " + totalCarros);

        // b) Tentativa de acessar o atributo 'modelo'
        // Se você escrever a linha abaixo, o IntelliJ vai sublinhar de VERMELHO e dar erro:
        // System.out.println(modelo);
    }
}