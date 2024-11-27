package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca extends Conteudo {

    private List<Conteudo> conteudos;

    public Biblioteca(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getConteudo() {
        String saida = "Biblioteca: " + this.getDescricao() + "\n";
        for (Conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}