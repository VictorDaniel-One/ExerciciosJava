package Exercicio10;

public class Main {
    public static void main(String[] args) {

        // Corrigindo o código: declaramos a variável FORA do bloco 'if'
        int x = 0;

        if (true) {
            x = 10; // Aqui apenas damos o valor a ela
        }

        // Agora o Java consegue "enxergar" o x aqui fora tranquilamente
        System.out.println("O valor de x é: " + x);

        /*
           O que acontece? Compila ou dá erro?
           Dá ERRO de compilação. O Java diz que "não consegue encontrar o símbolo x"
           na linha do System.out.println.

           O que é escopo?
           Escopo é o "tempo de vida" e a "área de visibilidade" de uma variável.
           Em Java, uma variável só existe dentro das chaves { } onde ela foi criada.

           Por que a variável x não existia fora do if?
           Porque ela foi declarada (criada) dentro das chaves do 'if'. Assim que o
           programa chega na chave de fechamento }, o Java "limpa" essa variável da
           memória. Por isso, quem está do lado de fora não sabe quem ela é.
        */
    }
}