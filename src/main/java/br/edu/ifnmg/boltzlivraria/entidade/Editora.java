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
public class Editora {
    private int codigoEditora;
    private String razaoSocial;
    private String cnpj;
    private String email;
    private String telefone;
    
    public Editora(){}

    public Editora(int codigoEditora, String razaoSocial, String cnpj, String email, String telefone) {
        this.codigoEditora = codigoEditora;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCodigoEditora() {
        return codigoEditora;
    }

    public void setCodigoEditora(int codigoEditora) {
        this.codigoEditora = codigoEditora;
    }
    

    @Override
    public String toString() {
        return codigoEditora + " | " + razaoSocial;
    }
    
    
}
