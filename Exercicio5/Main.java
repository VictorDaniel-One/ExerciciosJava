package Exercicio5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* c) Qual a vantagem de usar construtor em vez de chamar setters um por um?
           Vantagem: O código fica muito menor, mais limpo e direto. Em vez de gastar
           várias linhas chamando 'set' para cada detalhe, a gente cria e já configura o
           carro inteiro em uma única linha. Além disso, garante que nenhum carro será
           criado "em branco" por esquecimento, pois o construtor obriga a passar os dados.
        */

        // b) Olha como ficou muito mais fácil criar os objetos agora!
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2022);
        Carro carro3 = new Carro("Ford", "Mustang", 2018);

        // A parte da garagem (lista) continua igual
        ArrayList<Carro> garagem = new ArrayList<>();
        garagem.add(carro1);
        garagem.add(carro2);
        garagem.add(carro3);

        System.out.println("--- Lista de Carros na Garagem ---");
        for (Carro c : garagem) {
            c.exibir();
        }
    }
}