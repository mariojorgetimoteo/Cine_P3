// ESSA CLASSE PEDENDE DA CLASSE SESSAO
// BASICAMENTE ELA É UMA CLASSE DE EXIBIÇÃO DA SESSAO
public class Sala {
    //ATRIBUTO, PRIVADO
    private Sessao sessao;

    //CONSTRUTOR
    public Sala(Sessao sessao){
        this.sessao = sessao;
    }

    //GET E SET
    public Sessao getSessao() {
        return sessao;
    }
    public void setSessao(Sessao Sessão) {
        this.sessao = Sessão;
    }

    //MÉTODO, EXIBIÇÃO DA SESSÃO
    public void exibir_Sessao(){
        System.out.println(sessao);
    }

}
