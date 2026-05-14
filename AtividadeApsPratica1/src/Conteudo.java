
public abstract class Conteudo implements Reproduzivel {
    private int idConteudo;
    private String titulo;
    private String descricao;
    private int classificacaoindicativa;
    protected StatusDisponilibilidade statusDisponilibilidade;

    public Conteudo(int idConteudo, String titulo, String descricao, int classificacaoindicativa, StatusDisponilibilidade statusDisponilibilidade) {
        this.idConteudo = idConteudo;
        this.titulo = titulo;
    }

    public int getIdConteudo() {
         return idConteudo;
     }

     public boolean verificardiponibilidade(Regiao regiao){

     }

 }
