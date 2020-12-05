/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.boltzlivraria.entidade;

import java.util.Date;

/**
 *
 * @author denilson
 */
public class Livro {
    private int codigoLivro;
    private String titulo;
    private String anoPublicacao;
    private Autor autor;
    private Editora editora;
    private String isbn;
    private double preco;
    private int quantidade;
    private String categoria;

    public Livro(int codigoLivro, String titulo, String anoPublicacao, Autor autor, Editora editora, String categoria,String isbn, double preco, int quantidade) {
        this.codigoLivro = codigoLivro;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
        this.isbn = isbn;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Livro() {
        
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String dataPublicacao) {
        this.anoPublicacao = dataPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    

    @Override
    public String toString() {
        return "Código: " + codigoLivro + "| Título: " + titulo + 
                "| Ano publicacao: " + anoPublicacao + "| Autor: " + autor.gerarReferencia() +
                "| Editora: " + editora.getRazaoSocial() + "| Categoria: " + categoria + "| ISBN: " + isbn + "| Preço:" + preco + 
                "| Quantidade:" + quantidade;
    }
    
    
}
