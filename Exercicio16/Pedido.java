package Exercicio16;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Lanche> itens = new ArrayList<>();
    // Atributo static para contar quantos pedidos foram feitos no dia
    public static int totalPedidosRealizados = 0;

    public Pedido() {
        totalPedidosRealizados++;
    }

    public void adicionarLanche(Lanche l) {
        itens.add(l);
    }

    public void mostrarPedido() {
        System.out.println("--- Itens do Pedido ---");
        double total = 0;
        for (Lanche l : itens) {
            System.out.println(l);
            total += l.getPreco();
        }
        System.out.println("Total do Pedido: R$ " + String.format("%.2f", total));
    }
}