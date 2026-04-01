package Exercicio18;

public class Aluno {
    private String nome;
    private int idade;
    private String plano; // Mensal ou Anual

    // Atributo static para contar o total global de matrículas realizadas
    public static int contadorAlunos = 0;

    public Aluno(String nome, int idade, String plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
        contadorAlunos++; // Incrementa sempre que um novo objeto Aluno é criado
    }

    // Getters para a listagem
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getPlano() { return plano; }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " | Plano: " + plano;
    }
}