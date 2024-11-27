package src.main.java;

public class Livro extends Conteudo {

    private String autor;

    public Livro(String descricao, String autor) {
        super(descricao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return "Livro: " + this.getDescricao() + " - Autor: " + this.autor + "\n";
    }
}