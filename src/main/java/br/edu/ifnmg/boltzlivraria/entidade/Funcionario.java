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
public class Funcionario extends Pessoa{
    private int codigoFuncionario;
    private String login;
    private String senha;
    private double salario;
    private double comissao;
    
    public Funcionario(String login, String senha, double salario){
        this.login = login;
        this.senha = senha;
        this.salario = salario;
    }

    public Funcionario() {}

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
     
    public boolean autenticar(String senha) {
        if (this.getSenha().equals(senha)) {
            return true;
        } else {
            return false;
        }
    }
}
