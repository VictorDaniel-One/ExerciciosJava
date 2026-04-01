package Exercicio16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lanche> cardapio = new ArrayList<>();
        int opcao = 0;

        // Pré-cadastrando alguns lanches no cardápio
        cardapio.add(new Lanche("X-Salada", 15.00));
        cardapio.add(new Lanche("Cachorro Quente", 10.50));
        cardapio.add(new Lanche("Refrigerante", 5.00));

        while (opcao != 4) {
            System.out.println("\n--- LANCHONETE DO SEU JORGE ---");
            System.out.println("1) Novo Pedido");
            System.out.println("2) Cadastrar Lanche no Cardápio");
            System.out.println("3) Total de Pedidos do Dia");
            System.out.println("4) Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Pedido p = new Pedido();
                    int escolhaLanche = -1;
                    while (escolhaLanche != 0) {
                        System.out.println("\n--- CARDÁPIO ---");
                        for (int i = 0; i < cardapio.size(); i++) {
                            System.out.println((i + 1) + ". " + cardapio.get(i));
                        }
                        System.out.print("Escolha o lanche (ou 0 para finalizar): ");
                        escolhaLanche = sc.nextInt();
                        if (escolhaLanche > 0 && escolhaLanche <= cardapio.size()) {
                            p.adicionarLanche(cardapio.get(escolhaLanche - 1));
                            System.out.println("Adicionado!");
                        }
                    }
                    p.mostrarPedido();
                    break;

                case 2:
                    System.out.print("Nome do lanche: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    cardapio.add(new Lanche(nome, preco));
                    System.out.println("Lanche cadastrado!");
                    break;

                case 3:
                    System.out.println("Total de pedidos feitos hoje: " + Pedido.totalPedidosRealizados);
                    break;

                case 4:
                    System.out.println("Encerrando sistema...");
                    break;
            }
        }
        sc.close();
    }
}