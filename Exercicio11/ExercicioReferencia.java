package Exercicio11;

public class ExercicioReferencia {
    public static void main(String[] args) {
        // Declaração de tipos primitivos (armazenados por valor)
        int a = 10;
        int b = a; // b recebe uma cópia do valor de a

        b = 99; // Alteramos b, mas a permanece intacto

        // Resultado da execução
        System.out.println("a = " + a); // Saída: 10
        System.out.println("b = " + b); // Saída: 99

        /*
         * EXPLICAÇÃO:
         * Alterar 'b' NÃO mudou 'a' porque 'int' é um tipo PRIMITIVO.
         * Em tipos primitivos, o Java trabalha com CÓPIAS de valores.
         * Quando fizemos 'b = a', criamos um novo espaço na memória para 'b'
         * e apenas copiamos o número 10 para lá. Eles não possuem vínculo.
         */
    }
}
