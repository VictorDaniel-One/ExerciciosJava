package Exercicio3;

// Importante: precisamos avisar o Java que vamos usar a ferramenta ArrayList
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Criando os nossos 3 carros (como se estivéssemos fabricando eles)
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;

        Carro carro3 = new Carro();
        carro3.marca = "Ford";
        carro3.modelo = "Mustang";
        carro3.ano = 2018;

        // 2. Criando a nossa lista (ArrayList) que vai guardar objetos do tipo "Carro"
        // Dica: Pense no ArrayList como uma "garagem" que pode aumentar de tamanho!
        ArrayList<Carro> garagem = new ArrayList<>();

        // 3. Colocando os carros dentro da nossa lista (estacionando na garagem)
        garagem.add(carro1);
        garagem.add(carro2);
        garagem.add(carro3);

        System.out.println("--- Lista de Carros na Garagem ---");

        // 4. Usando o 'for-each' para percorrer a lista inteira de forma automática
        // Lemos essa linha assim: "Para cada 'Carro' (que vou apelidar de 'c') dentro da minha 'garagem', faça o seguinte:"
        for (Carro c : garagem) {

            // Aqui chamamos o método exibir() para o carro atual do loop
            c.exibir();

        }
    }
}