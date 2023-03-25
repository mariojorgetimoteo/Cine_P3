public class Sessao {
    //ATRIBUTOS, PROTEGIDOS.
    private Filme filme;
    private Sala sala;
    private int[][] lugar; // "1" "4" fileira/coluna; 
    private int tempo;

    //CONSTRUTOR
    public Sessao(Filme filme, Sala sala, int[][] lugar, int tempo) {
        this.filme = filme;
        this.sala = sala;
        this.tempo = tempo;

        lugar = new int[sala.getCapacidade_da_sala_coluna()][sala.getcapacidade_da_sala_linha()];
        // INICIALIZAR OS LUGARES COMO 0(LIVRE)
        for (int i = 0; i < lugar.length; i++) {
            for (int j = 0; j < lugar[i].length; j++) {
                lugar[i][j] = 0;
            }
        }
        
    }
    // ERRO AQUI 
    // 0 == livre 
    // 1 == ocupado
    public boolean ocupar_lugar(int[][] local) {
        
        if (this.lugar == local && this.lugar == 0) {
            this.lugar = 1; 
            return true;
        }
        
        return false;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int[][] getLugar() {
        return lugar;
    }

    public void setLugar(int[][] lugar) {
        this.lugar = lugar;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

}
