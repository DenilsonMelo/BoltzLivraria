/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.boltzlivraria.entidade;

/**
 *
 * @author denilson
 */
public class ItensVenda {
    private int idLivro;
    private int idVenda;
    private int quantidade;

    public ItensVenda(){}
    
    public ItensVenda(int idLivro, int idVenda, int quantidade) {
        this.idLivro = idLivro;
        this.idVenda = idVenda;
        this.quantidade = quantidade;
    }
    
    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
  
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
