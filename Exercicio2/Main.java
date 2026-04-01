package Exercicio2;

public class Main {
    public static void main(String[] args) {

        // Recriando os objetos com base no Exercício 1
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;

        // c) Chamando os métodos e explicando a diferença:

        System.out.println("--- Dados do Carro 1 ---");
        /* O método exibir() apenas executa uma ação (imprimir no console).
           Ele é 'void', ou seja, não devolve nenhum valor para quem o chamou. */
        carro1.exibir();

        /* O método idadeDoCarro() devolve (retorna) um valor do tipo int.
           Por isso, podemos pegar esse valor e imprimir ou guardar numa variável. */
        System.out.println("Idade do carro: " + carro1.idadeDoCarro() + " anos.");

        System.out.println("\n--- Dados do Carro 2 ---");
        carro2.exibir();
        System.out.println("Idade do carro: " + carro2.idadeDoCarro() + " anos.");
    }
}