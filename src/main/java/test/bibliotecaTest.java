package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.biblioteca;
import src.main.java.livro;
import src.main.java.secao;

import static org.junit.jupiter.api.Assertions.*;

class bibliotecaTest {

    @Test
    void deveRetornarConteudoBiblioteca() {
        secao secao1 = new secao("Tecnologia");

        secao secao2 = new secao("Literatura Clássica");
        livro livro21 = new livro("Dom Quixote", "Miguel de Cervantes");
        secao2.addConteudo(livro21);

        secao secao3 = new secao("Ficção Científica");
        livro livro31 = new livro("Duna", "Frank Herbert");
        livro livro32 = new livro("Fundação", "Isaac Asimov");
        secao3.addConteudo(livro31);
        secao3.addConteudo(livro32);

        secao bibliotecaConteudo = new secao("Biblioteca Municipal");
        bibliotecaConteudo.addConteudo(secao1);
        bibliotecaConteudo.addConteudo(secao2);
        bibliotecaConteudo.addConteudo(secao3);

        biblioteca biblioteca = new biblioteca("Biblioteca Central");
        biblioteca.addConteudo(bibliotecaConteudo);

        assertEquals("Biblioteca: Biblioteca Central\n" +
                "Seção: Biblioteca Municipal\n" +
                "Seção: Tecnologia\n" +
                "Seção: Literatura Clássica\n" +
                "Livro: Dom Quixote - Autor: Miguel de Cervantes\n" +
                "Seção: Ficção Científica\n" +
                "Livro: Duna - Autor: Frank Herbert\n" +
                "Livro: Fundação - Autor: Isaac Asimov\n", biblioteca.getConteudo());
    }

    @Test
    void deveRetornarExcecaoBibliotecaSemConteudo() {
        try {
            biblioteca biblioteca = new biblioteca("Biblioteca Vazia");
            biblioteca.getConteudo();
            fail();
        }
        catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IllegalStateException);
        }
    }
}
