public class Filme implements Comparable<Filme> {
    // ATRIBUTOS, PRIVADOS
    private String titulo_do_filme;
    private String genero;
    private int duracao;

    // CONSTRUTOR
    public Filme(String titulo_do_filme, String genero, int duracao) {
        this.titulo_do_filme = titulo_do_filme;
        this.genero = genero;
        this.duracao = duracao;
    }

    // GET E SET
    public String getTitulo_do_filme() {
        return titulo_do_filme;
    }

    public void setTitulo_do_filme(String titulo_do_filme) {
        this.titulo_do_filme = titulo_do_filme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // VAI COMPARAR E ORDENAR EM ORDEM ALFABETICA
    @Override
    public int compareTo(Filme outro_filme) {
        return this.titulo_do_filme.compareTo(outro_filme.titulo_do_filme);
    }

}
