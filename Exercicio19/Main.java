package Exercicio19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Filme> acervo = new ArrayList<>();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n--- LOCADORA DO MARCOS ---");
            System.out.println("1) Cadastrar Filme");
            System.out.println("2) Listar Acervo Completo");
            System.out.println("3) Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título do Filme: ");
                    String tit = sc.nextLine();
                    System.out.print("Gênero: ");
                    String gen = sc.nextLine();
                    System.out.print("Ano de Lançamento: ");
                    int ano = sc.nextInt();

                    acervo.add(new Filme(tit, gen, ano));
                    System.out.println("Filme adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- ACERVO ATUAL ---");
                    if (acervo.isEmpty()) System.out.println("Acervo vazio.");
                    for (Filme f : acervo) {
                        System.out.println(f);
                    }
                    System.out.println("Total de filmes cadastrados: " + Filme.totalFilmesAcervo);
                    break;

                case 3:
                    System.out.println("Fechando locadora...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}