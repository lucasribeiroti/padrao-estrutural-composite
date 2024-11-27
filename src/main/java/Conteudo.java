package src.main.java;

// Classe abstrata que serve como base para Biblioteca, Livro e Secao
public abstract class Conteudo {

    private String descricao; // Descrição do conteúdo (e.g., nome ou título)

    // Construtor que inicializa o conteúdo com uma descrição
    public Conteudo(String descricao) {
        this.descricao = descricao;
    }

    // Métodos getters e setters para a descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método abstrato que deve ser implementado por subclasses para retornar os detalhes do conteúdo
    public abstract String getConteudo();
}