package src.main.java;

import java.util.ArrayList;
import java.util.List;

// Classe que representa uma seção dentro de uma biblioteca ou outra seção
public class Secao extends Conteudo {

    private List<Conteudo> conteudos; // Lista para armazenar conteúdos da seção

    // Construtor que inicializa a seção com uma descrição e cria a lista de conteúdos
    public Secao(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<Conteudo>();
    }

    // Método para adicionar um conteúdo à seção
    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    // Método que retorna a descrição da seção e os conteúdos que ela contém
    public String getConteudo() {
        String saida = "Seção: " + this.getDescricao() + "\n"; // Adiciona o cabeçalho da seção
        for (Conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo(); // Adiciona os detalhes de cada item na lista
        }
        return saida; // Retorna a string final
    }
}