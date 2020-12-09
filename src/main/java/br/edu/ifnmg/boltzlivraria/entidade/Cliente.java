/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.boltzlivraria.entidade;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author denilson
 */
public class Cliente extends Pessoa{
    private Calendar dataAniversario;
    
    public Cliente(Calendar dataAniversario){
        this.dataAniversario = dataAniversario;
    }
    
    public int pegarMesAniversario(){        
        return dataAniversario.get(Calendar.MONTH);
    }
}
