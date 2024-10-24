package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;
    private List<Avaliacao> avaliacoes;

    public Livro(String titulo, String autor, LocalDate dataPublicacao, List<Avaliacao> avaliacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.avaliacoes = new ArrayList<>();
    }

    public Livro(){

    }

    public void adicionarAvaliacao(String descricao, Double qtdEstrela){


            if (descricao != null && qtdEstrela != null &&   !descricao.isBlank() && qtdEstrela >=0 && qtdEstrela <=5){
                Avaliacao novaAvaliacao = new Avaliacao(descricao, qtdEstrela);
                avaliacoes.add(novaAvaliacao);
            }


    }

    public Double calcularMediaAvaliacoes(){
        Double soma = 0.00;
        Double media = 0.00;

        if (!avaliacoes.isEmpty()) {
            for (Avaliacao avaliacaoTotal : avaliacoes) {
                soma += avaliacaoTotal.getQtdEstrelas();
            }

            media = soma / avaliacoes.size();

            return media;
        }
    return 0.00;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                ", avaliacoes=" + avaliacoes +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
