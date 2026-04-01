package Exercicio17;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // A constante final: o número máximo de vagas
    private static final int TOTAL_VAGAS = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> vagasOcupadas = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- ESTACIONAMENTO DO CARLÃO ---");
            System.out.println("Vagas Livres: " + (TOTAL_VAGAS - vagasOcupadas.size()));
            System.out.println("1) Entrada de Carro");
            System.out.println("2) Saída de Carro (por placa)");
            System.out.println("3) Listar Carros no Pátio");
            System.out.println("4) Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (vagasOcupadas.size() < TOTAL_VAGAS) {
                        System.out.print("Placa: ");
                        String placa = sc.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();
                        vagasOcupadas.add(new Carro(placa, modelo));
                        System.out.println("Carro registrado!");
                    } else {
                        System.out.println("Lamento, Carlão! O pátio está LOTADO.");
                    }
                    break;

                case 2:
                    System.out.print("Digite a placa para remover: ");
                    String placaBusca = sc.nextLine();
                    // Lógica para remover por placa
                    boolean removido = vagasOcupadas.removeIf(c -> c.getPlaca().equalsIgnoreCase(placaBusca));

                    if (removido) {
                        System.out.println("Carro saiu. Vaga liberada!");
                    } else {
                        System.out.println("Placa não encontrada!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Carros Estacionados ---");
                    if (vagasOcupadas.isEmpty()) System.out.println("Pátio vazio.");
                    for (Carro c : vagasOcupadas) {
                        System.out.println(c);
                    }
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;
            }
        }
        sc.close();
    }
}