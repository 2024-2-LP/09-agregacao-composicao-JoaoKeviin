package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Biblioteca {
private String nome;
private  List<Livro> livros;


    public Biblioteca(String nome, List<Livro> livro) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public Biblioteca(){}

    public void adicionarLivro(Livro livro){
        if (livro != null &&
                livro.getTitulo() != null && livro.getAutor() != null
                && livro.getDataPublicacao() != null
                && !livro.getTitulo().isBlank()  && !livro.getAutor().isBlank()
                ){

        livros.add(livro);

        }
    }


    public void removerLivroPorTitulo(String titulo){


        for (int i =0; i < livros.size(); i++){

            String tituloAtual = livros.get(i).getTitulo();

            if (tituloAtual.equalsIgnoreCase(titulo)){
                livros.remove(livros.get(i));
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo){

        if (titulo != null && !titulo.isBlank()){
            for (int i = 0; i < livros.size(); i ++){
                String tituloAtual = livros.get(i).getTitulo();
                if (tituloAtual.equalsIgnoreCase(titulo)){

                  return livros.get(i);

                }
            }
        }

        return null;

    }
    public Integer contarLivros(){
       return livros.size();

    }

    public List<Livro> obterLivrosAteAno(Integer ano){
        List<Livro> livroAnoAtual = new ArrayList<>();

        for (Livro livroAtual : livros){
            Integer dataAnoAtual = livroAtual.getDataPublicacao().getYear();
            if (dataAnoAtual <= ano){
                livroAnoAtual.add(livroAtual);
            }
        }
        return livroAnoAtual;
    }



}
