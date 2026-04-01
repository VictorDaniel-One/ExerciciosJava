package Exercicio19;

public class Filme {
    private String titulo;
    private String genero;
    private int ano;

    // Constantes final
    private static final int ANO_MINIMO = 1895;
    private static final int ANO_MAXIMO = 2026;

    // Atributo static para contar o acervo
    public static int totalFilmesAcervo = 0;

    public Filme(String titulo, String genero, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        setAno(ano); // Valida o ano antes de salvar
        totalFilmesAcervo++;
    }

    public void setAno(int ano) {
        if (ano >= ANO_MINIMO && ano <= ANO_MAXIMO) {
            this.ano = ano;
        } else {
            System.out.println("Erro: Ano inválido (" + ano + "). Definido como " + ANO_MAXIMO);
            this.ano = ANO_MAXIMO;
        }
    }

    // Método com retorno (String) para classificar o filme
    public String classificar() {
        if (this.ano < 2000) {
            return "CLÁSSICO";
        } else {
            return "RECENTE";
        }
    }

    public String getTitulo() { return titulo; }

    @Override
    public String toString() {
        return "Filme: " + titulo + " | Gênero: " + genero + " | Ano: " + ano + " [" + classificar() + "]";
    }
}