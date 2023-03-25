// A INTERFACE Comparable<> COMPARA DOIS OBJETOS, OU SEJA, COMPARA NESSE CASO DUAS SALAS.
public class Sala implements Comparable<Sala> {

    // ATRIBUTO, PRIVADO
    private int numero_da_sala;
    private int capacidade_da_sala_linha = 10;
    private int capacidade_da_sala_coluna = 10;

    // CONSTRUTOR
    public Sala(int numero_da_sala, int capacidade_da_sala_linha, int capacidade_da_sala_coluna) {
        this.numero_da_sala = numero_da_sala;
        this.capacidade_da_sala_linha = capacidade_da_sala_linha;
        this.capacidade_da_sala_coluna = capacidade_da_sala_coluna;
    }

    // GET E SET
    public int getNumero_da_sala() {
        return numero_da_sala;
    }

    public void setNumero_da_sala(int numero_da_sala) {
        this.numero_da_sala = numero_da_sala;
    }

    public int getcapacidade_da_sala_linha() {
        return capacidade_da_sala_linha;
    }

    public void setcapacidade_da_sala_linha(int capacidade_da_sala_linha) {
        this.capacidade_da_sala_linha = capacidade_da_sala_linha;
    }

    public int getCapacidade_da_sala_coluna() {
        return capacidade_da_sala_coluna;
    }

    public void setCapacidade_da_sala_coluna(int capacidade_da_sala_coluna) {
        this.capacidade_da_sala_coluna = capacidade_da_sala_coluna;
    }

    // VAI COMPARAR AS SALAS
    @Override
    public int compareTo(Sala outra_sala) {
        if (this.numero_da_sala != outra_sala.numero_da_sala) {
            return 1; // OK
        }
        throw new UnsupportedOperationException("SALA JÁ EM USO");
    }

}
