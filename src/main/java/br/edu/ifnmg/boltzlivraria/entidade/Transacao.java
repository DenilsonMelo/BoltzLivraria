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
    protected String codigo;
    protected Date data;
    protected double valor;
    protected char formaPagamento;
}
