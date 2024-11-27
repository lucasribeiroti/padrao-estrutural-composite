package src.main.java;

// Classe que representa um livro, sendo um tipo específico de Conteudo
public class Livro extends Conteudo {

    private String autor; // Nome do autor do livro

    // Construtor que inicializa o livro com uma descrição (título) e o autor
    public Livro(String descricao, String autor) {
        super(descricao);
        this.autor = autor;
    }

    // Métodos getters e setters para o autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Implementação do método getConteudo, retornando os detalhes do livro
    public String getConteudo() {
        return "Livro: " + this.getDescricao() + " - Autor: " + this.autor + "\n";
    }
}