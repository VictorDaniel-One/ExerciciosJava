package Exercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // d) Agora não usamos mais o "=", usamos o "set" para colocar os dados
        Carro carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2020);

        Carro carro2 = new Carro();
        carro2.setMarca("Honda");
        carro2.setModelo("Civic");
        carro2.setAno(2022);

        Carro carro3 = new Carro();
        carro3.setMarca("Ford");
        carro3.setModelo("Mustang");
        carro3.setAno(2018);

        // --- Testando a nossa validação só para ver funcionando ---
        System.out.println("--- Teste de Erro ---");
        Carro carroDeTeste = new Carro();
        carroDeTeste.setAno(1500); // Isso vai disparar o erro no console!
        System.out.println("---------------------\n");

        // A parte da lista (ArrayList) continua igualzinha ao Exercício 3
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