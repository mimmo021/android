package dfj.projetolivro;

import java.io.Serializable;

/**
 * Created by mimmo on 10/10/2015.
 *
 * Criação da classe Livro com seus 3 atributos.
 * a classe livro deve implemntar Serializable.
 * gerar construtor.
 * Gerar Overrido do método toString.
 *
 * Apos esses passos criar arquivo ListaLivroFragment.
 *
 */
public class Livro implements Serializable{

    public String titulo;
    public  String autor;
    public  int ano;


    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        /**
         * Iniciamente o toString vem com
         * return super.toString
         * mudar para o codigo abaixo.
         */
        return titulo + " - " + autor + ", " + ano;
    }
}
