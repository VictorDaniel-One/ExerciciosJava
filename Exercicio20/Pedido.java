package Exercicio20;

public class Pedido {
    private String nomeCliente;
    private Marmita marmita;

    // Atributos STATIC para o fechamento do caixa da Camila
    public static int totalPedidosDia = 0;
    public static double valorTotalVendido = 0;

    public Pedido(String nomeCliente, Marmita marmita) {
        this.nomeCliente = nomeCliente;
        this.marmita = marmita;

        // Sempre que um pedido é criado, incrementa os totais da Camila
        totalPedidosDia++;
        valorTotalVendido += marmita.getPreco();
    }

    @Override
    public String toString() {
        return "Cliente: " + nomeCliente + " | Pedido: " + marmita;
    }
}