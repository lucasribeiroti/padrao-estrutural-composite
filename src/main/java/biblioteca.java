package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class biblioteca extends conteudo {

    private List<conteudo> conteudos;

    public biblioteca(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<conteudo>();
    }

    public void addConteudo(conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getConteudo() {
        if (conteudos.isEmpty()) {
            throw new IllegalStateException("A biblioteca está vazia.");
        }

        String saida = "Biblioteca: " + this.getDescricao() + "\n";


        for (src.main.java.conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo();
        }

        return saida;
    }
}
