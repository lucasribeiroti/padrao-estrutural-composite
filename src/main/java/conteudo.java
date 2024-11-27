package src.main.java;

public abstract class conteudo {

    private String descricao;

    public conteudo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getConteudo();
}