package Exercicio9;

public class Main {
    public static void main(String[] args) {

        // Tentativa de alterar a constante
        // Se você descomentar a linha abaixo, o Java dará um ERRO de compilação!
        // Carro.ANO_PRIMEIRO_CARRO = 1900;

        /* O que acontece?
           O IntelliJ vai mostrar um erro dizendo: "Cannot assign a value to final variable".
           Isso acontece porque uma variável 'final' só pode receber um valor uma única vez.

           O que o 'final' faz?
           Ele transforma a variável em uma constante. Isso traz segurança ao código,
           garantindo que valores importantes (como o ano de invenção do carro ou
           o valor de PI) não sejam alterados por acidente durante a execução do programa.
        */

        Carro c = new Carro("Ford", "T", 1908);
        c.exibir();
        System.out.println("O primeiro carro foi em: " + Carro.ANO_PRIMEIRO_CARRO);
    }
}