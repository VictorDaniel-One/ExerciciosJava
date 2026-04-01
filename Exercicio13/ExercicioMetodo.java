package Exercicio13;

class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return modelo; }
}

public class ExercicioMetodo {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("VW", "Gol", 2015);

        // Passamos a referência do objeto para o método
        trocarModelo(meuCarro);

        // O que é impresso?
        System.out.println(meuCarro.getModelo()); // Saída: Fusca
    }

    public static void trocarModelo(Carro c) {
        /*
         * EXPLICAÇÃO:
         * O parâmetro 'c' recebe o endereço de memória de 'meuCarro'.
         * Ambos apontam para o mesmo objeto na HEAP.
         * Por isso, c.setModelo altera o objeto real que está no main.
         */
        c.setModelo("Fusca");
    }
}