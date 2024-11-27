package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.Biblioteca;
import src.main.java.Livro;
import src.main.java.Secao;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void deveRetornarConteudoBiblioteca() {
        // Criando seções e adicionando livros
        Secao secao1 = new Secao("Tecnologia");

        Secao secao2 = new Secao("Literatura Clássica");
        Livro livro21 = new Livro("Dom Quixote", "Miguel de Cervantes");
        secao2.addConteudo(livro21);

        Secao secao3 = new Secao("Ficção Científica");
        Livro livro31 = new Livro("Duna", "Frank Herbert");
        Livro livro32 = new Livro("Fundação", "Isaac Asimov");
        secao3.addConteudo(livro31);
        secao3.addConteudo(livro32);

        // Criando uma biblioteca principal com as seções
        Secao bibliotecaConteudo = new Secao("Biblioteca Municipal");
        bibliotecaConteudo.addConteudo(secao1);
        bibliotecaConteudo.addConteudo(secao2);
        bibliotecaConteudo.addConteudo(secao3);

        // Adicionando a seção de conteúdos à Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.addConteudo(bibliotecaConteudo);

        // Verificando se o conteúdo gerado é o esperado
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
            // Criando uma biblioteca sem conteúdo
            Biblioteca biblioteca = new Biblioteca("Biblioteca Vazia");
            biblioteca.getConteudo(); // Tentando obter o conteúdo (deve falhar)
            fail(); // Se não lançar exceção, o teste falha
        }
        catch (Exception e) {
            // Verifica se a exceção lançada é do tipo esperado
            assertTrue(e instanceof NullPointerException || e instanceof IllegalStateException);
        }
    }
}
