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
public class Autor {
    private int codigoAutor;
    private String nome;
    private String primeiroSobrenome;
    private String ultimoSobrenome;
    
    public Autor(){}
    
    public Autor(int codigoAutor, String nome, String primeiroSobrenome, String ultimoSobrenome) {
        this.codigoAutor = codigoAutor;
        this.nome = nome;
        this.primeiroSobrenome = primeiroSobrenome;
        this.ultimoSobrenome = ultimoSobrenome;
    }

    public String gerarReferencia(){
        String referencia = ultimoSobrenome.toUpperCase() + ", " + nome + " " + primeiroSobrenome;
        return referencia;
    }
    
    public int getCodigoAutor(){
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrimeiroSobrenome() {
        return primeiroSobrenome;
    }

    public void setPrimeiroSobrenome(String primeiroSobrenome) {
        this.primeiroSobrenome = primeiroSobrenome;
    }

    public String getUltimoSobrenome() {
        return ultimoSobrenome;
    }

    public void setUltimoSobrenome(String ultimoSobrenome) {
        this.ultimoSobrenome = ultimoSobrenome;
    }
    
    

}

