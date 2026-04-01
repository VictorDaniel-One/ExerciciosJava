package Exercicio15;

import java.util.ArrayList;
import java.util.Scanner;

class Carro {
    private String modelo;
    private int ano;

    // Constante final para validação (Ex: carros não podem ser mais velhos que 1886)
    private static final int ANO_MINIMO = 1886;

    // Atributo static para contagem total
    private static int totalCarros = 0;

    // Construtor
    public Carro(String modelo, int ano) {
        this.setModelo(modelo);
        this.setAno(ano);
        totalCarros++;
    }

    // Getters e Setters com validação
    public String getModelo() { return modelo; }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            this.modelo = "Modelo Indefinido";
        }
    }

    public int getAno() { return ano; }

    public void setAno(int ano) {
        if (ano >= ANO_MINIMO) {
            this.ano = ano;
        } else {
            this.ano = ANO_MINIMO; // Validação usando a constante final
        }
    }

    public static int getTotalCarros() {
        return totalCarros;
    }

    @Override
    public String toString() {
        return "Carro [Modelo: " + modelo + ", Ano: " + ano + "]";
    }
}

public class SistemaCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ArrayList para armazenar os carros
        ArrayList<Carro> listaCarros = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Cadastrar Carro");
            System.out.println("2) Listar todos");
            System.out.println("3) Total cadastrado");
            System.out.println("4) Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite o modelo: ");
                    String mod = scanner.nextLine();
                    System.out.print("Digite o ano: ");
                    int ano = scanner.nextInt();

                    listaCarros.add(new Carro(mod, ano));
                    System.out.println("Carro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Carros ---");
                    for (Carro c : listaCarros) {
                        System.out.println(c);
                    }
                    break;

                case 3:
                    // Acesso via atributo static da classe
                    System.out.println("Total de carros no sistema: " + Carro.getTotalCarros());
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}