package Exercicio7;

public class Main {
    public static void main(String[] args) {

        // c) Criando 5 carros (não importa o modelo, o contador vai subir)
        new Carro("Fiat", "Uno", 2010);
        new Carro("VW", "Gol", 2015);
        new Carro("Chevrolet", "Onix", 2020);
        new Carro(); // Usando o construtor vazio
        new Carro("Ford", "Ka", 2019);

        // Imprimindo o total usando o nome da CLASSE (Carro)
        System.out.println("Total de carros criados: " + Carro.totalCarros);

        /*
           d) Por que usamos Carro.totalCarros (nome da classe)?
           Porque o atributo static pertence à "fábrica" (classe) e não a um
           carro específico.

           Qual a diferença?
           - Atributo de Instância (sem static): Cada objeto tem o seu próprio valor.
             Se você tem 10 carros, tem 10 marcas diferentes gravadas na memória.
           - Atributo Static: Existe apenas UMA cópia na memória para todo mundo.
             Se um objeto mudar o valor, muda para todos os outros, porque o
             espaço na memória é o mesmo.
        */
    }
}