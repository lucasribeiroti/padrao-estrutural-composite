package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.Biblioteca;
import src.main.java.Livro;
import src.main.java.Secao;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void deveRetornarConteudoBiblioteca() {
        Secao secao1 = new Secao("Tecnologia");

        Secao secao2 = new Secao("Literatura Clássica");
        Livro livro21 = new Livro("Dom Quixote", "Miguel de Cervantes");
        secao2.addConteudo(livro21);

        Secao secao3 = new Secao("Ficção Científica");
        Livro livro31 = new Livro("Duna", "Frank Herbert");
        Livro livro32 = new Livro("Fundação", "Isaac Asimov");
        secao3.addConteudo(livro31);
        secao3.addConteudo(livro32);

        Secao bibliotecaConteudo = new Secao("Biblioteca Municipal");
        bibliotecaConteudo.addConteudo(secao1);
        bibliotecaConteudo.addConteudo(secao2);
        bibliotecaConteudo.addConteudo(secao3);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
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
            Biblioteca biblioteca = new Biblioteca("Biblioteca Vazia");
            biblioteca.getConteudo();
            fail();
        }
        catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IllegalStateException);
        }
    }
}
