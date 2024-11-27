package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class secao extends conteudo {

    private List<conteudo> conteudos;

    public secao(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<conteudo>();
    }

    public void addConteudo(conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getConteudo() {
        String saida = "Seção: " + this.getDescricao() + "\n";
        for (src.main.java.conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}