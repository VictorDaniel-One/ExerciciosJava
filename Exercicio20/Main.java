package Exercicio20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Marmita> cardapio = new ArrayList<>();
        ArrayList<Pedido> pedidosDoDia = new ArrayList<>();
        int opcao = 0;

        // Cadastro inicial de marmitas disponíveis
        cardapio.add(new Marmita("Frango grelhado com arroz", 'P'));
        cardapio.add(new Marmita("Feijoada Completa", 'G'));
        cardapio.add(new Marmita("Lasanha Bolonhesa", 'M'));

        while (opcao != 4) {
            System.out.println("\n--- DELIVERY DA CAMILA ---");
            System.out.println("1) Registrar Novo Pedido");
            System.out.println("2) Listar Pedidos do Dia");
            System.out.println("3) Fechamento de Caixa");
            System.out.println("4) Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nome = sc.nextLine();

                    System.out.println("Escolha a marmita:");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println((i+1) + ". " + cardapio.get(i));
                    }
                    int escolha = sc.nextInt();

                    if (escolha > 0 && escolha <= cardapio.size()) {
                        pedidosDoDia.add(new Pedido(nome, cardapio.get(escolha-1)));
                        System.out.println("Pedido registrado!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- RELATÓRIO DE ENTREGAS ---");
                    for (Pedido p : pedidosDoDia) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("\n--- FECHAMENTO DO DIA ---");
                    System.out.println("Quantidade de marmitas: " + Pedido.totalPedidosDia);
                    System.out.printf("Valor Total Arrecadado: R$ %.2f\n", Pedido.valorTotalVendido);
                    break;

                case 4:
                    System.out.println("Sistema encerrado.");
                    break;
            }
        }
        sc.close();
    }
}