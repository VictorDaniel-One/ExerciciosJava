package Exercicio6;

public class Main {
    public static void main(String[] args) {

        // c) Criando um carro de cada forma para ver a diferença

        // Forma 1: Usando o construtor COM parâmetros (passando os dados)
        Carro carroComDados = new Carro("Chevrolet", "Onix", 2023);

        // Forma 2: Usando o construtor SEM parâmetros (os parênteses ficam vazios)
        Carro carroVazio = new Carro();

        System.out.println("--- Imprimindo o Carro 1 ---");
        carroComDados.exibir(); // Vai imprimir Chevrolet Onix 2023

        System.out.println("\n--- Imprimindo o Carro 2 ---");
        carroVazio.exibir(); // Vai imprimir Desconhecido Desconhecido 0

        /*
           c) Comentário: O que muda entre os dois?
           A diferença é a flexibilidade (ter opções). O primeiro obriga a gente a
           já ter os dados completos do carro na hora de criar no sistema. O segundo
           deixa a gente criar um carro genérico "em branco" para preencher os dados
           reais só mais tarde, usando os 'setters' quando o cliente decidir a marca.
        */
    }
}