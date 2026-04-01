package Exercicio2;

public class Carro {
    // Atributos (herdado da lógica do Exercicio 1)
    String marca;
    String modelo;
    int ano;

    // a) Método void exibir() que imprime os dados formatados
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " - Ano: " + ano);
    }

    // b) Método int idadeDoCarro() que retorna a idade baseada em 2026
    public int idadeDoCarro() {
        return 2026 - ano;
    }
}