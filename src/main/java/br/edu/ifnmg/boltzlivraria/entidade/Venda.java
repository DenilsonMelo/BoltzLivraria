/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.boltzlivraria.entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class Venda extends Transacao{
    private int codigoVenda;
    private int idCliente;
    private int idFuncionario;
    private List<ItensVenda> itensVenda;

    public Venda() {
        this.idCliente = 0;
        this.idFuncionario = 0;
        this.itensVenda = new ArrayList<>();
        this.valor = 0;
    }

    public Venda(int idCliente, int idFuncionario, ItensVenda itens, double valor, Calendar dataVenda) {
        this.idCliente = idCliente;
        this.idFuncionario = idFuncionario;
        this.itensVenda = new ArrayList<>();
    }

    public void add(ItensVenda itens){
        this.itensVenda.add(itens);
    }
    
    public void remove(ItensVenda itens){
        this.itensVenda.remove(itens);
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public List<ItensVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItensVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    public void verificarQuantidadeParcelas(Venda venda, int formaPagamento){
        Scanner scanner = new Scanner(System.in);
        if(formaPagamento == 2){
            do{
                System.out.println("Informe a quantidade de parcelas que deseja: ");
                quantidadeParcelas = scanner.nextInt();
                if(quantidadeParcelas < 0 || quantidadeParcelas > 12){
                    System.err.println("Quantidade de parcelas inválida!");
                }else{
                    venda.setQuantidadeParcelas(quantidadeParcelas);
                }  
            }while(quantidadeParcelas < 0 || quantidadeParcelas > 12);
        }
    }
}
