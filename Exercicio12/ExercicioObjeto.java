package Exercicio12; // Adicionado conforme sua estrutura de pastas

// Classe de apoio
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

// Classe Principal
public class ExercicioObjeto {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fiat", "Uno", 2020);
        Carro c2 = c1;

        c2.setModelo("Palio");

        System.out.println("Modelo c1: " + c1.getModelo());
        System.out.println("Modelo c2: " + c2.getModelo());

        /*
         * EXPLICAÇÃO STACK/HEAP:
         * 1. 'c1' e 'c2' vivem na STACK e guardam o endereço de memória.
         * 2. O objeto Carro vive na HEAP.
         * 3. Como c1 e c2 apontam para o mesmo endereço na HEAP,
         * a alteração é visível para ambos.
         */
    }
}