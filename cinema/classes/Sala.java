package classes;

public class Sala {
    
}
/*
 A classe de sala irá compor uma lista de sessões, a lista têm um tamanho fixo com
uma grade de horário, caso não exista uma sessão em algum horário, aquela sessão
será registrada como nula e não irá aparecer para o usuário;
 */

 /*
  private final int numSessoes = 6; // número de sessões na grade horária fixa
    private Sessao[] sessoes;

    public Sala() {
        sessoes = new Sessao[numSessoes];
        for (int i = 0; i < numSessoes; i++) {
            sessoes[i] = null;
        }
    }

    public void adicionarSessao(Sessao sessao, int horario) {
        if (horario >= 0 && horario < numSessoes) {
            sessoes[horario] = sessao;
        }
    }

    public void removerSessao(int horario) {
        if (horario >= 0 && horario < numSessoes) {
            sessoes[horario] = null;
        }
    }

    public Sessao getSessao(int horario) {
        if (horario >= 0 && horario < numSessoes) {
            return sessoes[horario];
        } else {
            return null;
        }
    }

    public void mostrarGradeHoraria() {
        System.out.println("Grade Horária da Sala:");
        for (int i = 0; i < numSessoes; i++) {
            if (sessoes[i] != null) {
                System.out.println("Horário " + i + ": " + sessoes[i].getFilme().getTitulo());
            } else {
                System.out.println("Horário " + i + ": Sessão não disponível");
            }
        }
    }
    
  */
