package src.main.java;

import java.util.ArrayList;
import java.util.List;

// A classe Biblioteca é uma especialização de Conteudo que representa uma coleção de conteúdos como livros e seções.
public class Biblioteca extends Conteudo {

    private List<Conteudo> conteudos; // Lista que armazena os conteúdos da biblioteca (e.g., livros, seções).

    // Construtor que inicializa a biblioteca com uma descrição e cria uma lista vazia para armazenar os conteúdos.
    public Biblioteca(String descricao) {
        super(descricao); // Chama o construtor da classe base (Conteudo) para definir a descrição.
        this.conteudos = new ArrayList<Conteudo>(); // Inicializa a lista de conteúdos como vazia.
    }

    // Método para adicionar um conteúdo à lista da biblioteca.
    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo); // Adiciona o conteúdo (e.g., Livro ou Secao) à lista de conteúdos.
    }

    // Método que retorna a descrição da biblioteca e os detalhes de todos os seus conteúdos.
    public String getConteudo() {
        // Verifica se a lista de conteúdos está vazia. Se estiver, lança uma exceção indicando que a biblioteca está vazia.
        if (conteudos.isEmpty()) {
            throw new IllegalStateException("A biblioteca está vazia."); // Exceção para evitar retornar uma biblioteca sem conteúdos.
        }

        String saida = "Biblioteca: " + this.getDescricao() + "\n"; // Inicia a string com a descrição da biblioteca.

        // Percorre todos os conteúdos da lista e adiciona os detalhes de cada um à string de saída.
        for (Conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo(); // Chama o método getConteudo de cada item para obter sua representação.
        }

        return saida; // Retorna a string final contendo a descrição e os detalhes de todos os conteúdos.
    }
}
