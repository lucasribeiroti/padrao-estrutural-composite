package src.main.java;

import java.util.ArrayList;
import java.util.List;

// A classe Biblioteca é uma especialização de Conteudo que contém uma lista de outros conteúdos (e.g., livros, seções)
public class Biblioteca extends Conteudo {

    private List<Conteudo> conteudos; // Lista para armazenar os conteúdos da biblioteca

    // Construtor que inicializa a biblioteca com uma descrição e cria a lista de conteúdos
    public Biblioteca(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<Conteudo>();
    }

    // Método para adicionar um conteúdo à lista da biblioteca
    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    // Método que retorna a descrição e todos os conteúdos da biblioteca
    public String getConteudo() {
        String saida = "Biblioteca: " + this.getDescricao() + "\n"; // Adiciona o cabeçalho da biblioteca
        for (Conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo(); // Adiciona o conteúdo de cada item na lista
        }
        return saida; // Retorna a string final
    }
}