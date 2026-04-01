package Exercicio8;

public class Main {
    public static void main(String[] args) {

        // Criando alguns carros
        new Carro("Fusca");
        new Carro("Brasília");

        // Chamando o método static diretamente pela Classe
        Carro.imprimirTotal();

        /*
           c) Por que um método static não acessa um atributo de instância?

           Explicação de aluno iniciante:
           Um método 'static' existe mesmo antes de você criar qualquer carro (objeto).
           Ele pertence à Classe (ao projeto). Como ele é "geral", ele não sabe
           qual 'modelo' imprimir, porque podem existir mil carros diferentes com
           mil modelos diferentes.

           O método static só consegue ver o que também é static (que é geral para todos).
        */
    }
}