package Exercicio14; // Ajustado conforme seu padrão de pastas

class Cliente {
    private String nome;
    private String email;
    private String telefone;

    // Atributo static: compartilhado por todas as instâncias
    public static int totalClientes = 0;

    // Construtor 1: Completo
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        totalClientes++; // Incrementa o contador global
    }

    // Construtor 2: Só nome e email
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = "Não informado";
        totalClientes++;
    }

    // Construtor 3: Só nome
    public Cliente(String nome) {
        this.nome = nome;
        this.email = "Não informado";
        this.telefone = "Não informado";
        totalClientes++;
    }

    // Método para imprimir os dados (para facilitar o item e)
    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Email: " + email + " | Tel: " + telefone);
    }
}

public class MainCliente {
    public static void main(String[] args) {
        // Criando objetos com cada construtor
        Cliente c1 = new Cliente("Ana", "ana@email.com", "9999-9999");
        Cliente c2 = new Cliente("Beto", "beto@email.com");
        Cliente c3 = new Cliente("Caio");

        // Imprimindo os dados
        c1.exibirDados();
        c2.exibirDados();
        c3.exibirDados();

        // Mostrando o total acumulado no static
        System.out.println("Total de clientes cadastrados: " + Cliente.totalClientes);
    }
}