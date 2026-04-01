package Exercicio18;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Uso do final para limite de vagas (não muda)
    private static final int LIMITE_VAGAS = 50;
    private static final int IDADE_MINIMA = 14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> academia = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- ACADEMIA DA FERNANDA ---");
            System.out.println("Vagas ocupadas: " + academia.size() + "/" + LIMITE_VAGAS);
            System.out.println("1) Matricular Aluno");
            System.out.println("2) Listar Alunos");
            System.out.println("3) Ver Total de Matrículas (Static)");
            System.out.println("4) Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Validação de Capacidade
                    if (academia.size() >= LIMITE_VAGAS) {
                        System.out.println("ERRO: Academia lotada! Não aceitamos mais matrículas.");
                        break;
                    }

                    System.out.print("Nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    // Validação de Idade
                    if (idade < IDADE_MINIMA) {
                        System.out.println("ERRO: Idade mínima permitida é " + IDADE_MINIMA + " anos.");
                        break;
                    }

                    System.out.print("Plano (Mensal/Anual): ");
                    String plano = sc.nextLine();

                    academia.add(new Aluno(nome, idade, plano));
                    System.out.println("Aluno matriculado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Alunos ---");
                    if (academia.isEmpty()) System.out.println("Nenhum aluno matriculado.");
                    for (Aluno a : academia) {
                        System.out.println(a);
                    }
                    break;

                case 3:
                    // Acessando o contador static diretamente pela Classe
                    System.out.println("Total histórico de matrículas: " + Aluno.contadorAlunos);
                    break;

                case 4:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}