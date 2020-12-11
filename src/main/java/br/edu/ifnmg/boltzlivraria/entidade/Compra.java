/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.boltzlivraria.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author denilson
 */
public class Compra extends Transacao{
    private int codigoCompra;
    private Editora codigoEditora;
    private List<ItensCompra> itensCompra;
    
    public Compra(){
        this.valor = 0;
        this.itensCompra = new ArrayList<>();
    }

    public void add(ItensCompra itens){
        this.itensCompra.add(itens);
    }
    
    public void remove(ItensCompra itens){
        this.itensCompra.remove(itens);
    }
    
    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }
    
    public Editora getCodigoEditora() {
        return codigoEditora;
    }

    public void setCodigoEditora(Editora codigoEditora) {
        this.codigoEditora = codigoEditora;
    }
    
    public boolean verificarLivrosEditora(ArrayList<Livro> listaLivros, int codigoEditora, int codigoLivro) {
        for(Livro livro : listaLivros){
            if(livro.getEditora().getCodigoEditora() == codigoEditora  && livro.getCodigoLivro() == codigoLivro){
                return true;
            }else{
                return false;
            }
        } 
        return false;
    }
}
