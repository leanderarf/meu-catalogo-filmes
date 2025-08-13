package br.com.meucatalogo.model;

public class Filme {
    int id;
    String titulo;
    int anoLancamento;
    double avaliacao;
    int duracao;
    Genero genero;
    String sinopse;
    Classificacao classificacao;

    public Filme(int id, String titulo, int anoLancamento, double avaliacao, int duracao, Genero genero, String sinopse, Classificacao classificacao) {
        this.id = id;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.duracao = duracao;
        this.genero = genero;
        this.sinopse = sinopse;
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "\nTítulo: " + titulo +
                "\nAno de Lançamento: " + anoLancamento +
                "\nAvaliação: " + avaliacao +
                "\nDuração: " + duracao +
                "\nGênero: " + genero +
                "\nSinopse='" + sinopse +
                "\nClassificação: " + classificacao;
    }
}
