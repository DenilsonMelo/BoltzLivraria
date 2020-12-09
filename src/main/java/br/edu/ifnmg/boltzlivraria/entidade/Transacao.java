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
public abstract class Transacao {
    protected int codigoTransacao;
    protected Date data;
    protected double valor;
    protected int formaPagamento;
    protected int quantidadeParcelas;

    public Transacao() {
        this.codigoTransacao = 0;
        this.data = new Date();
        this.valor = 0;
        this.formaPagamento = 0;
    }

    public int getCodigoTransacao() {
        return codigoTransacao;
    }

    public void setCodigoTransacao(int codigoTransacao) {
        this.codigoTransacao = codigoTransacao;
    }

    public Date getData() {
        return data;
    }

    public void setData() {
        this.data = new Date();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    
}
