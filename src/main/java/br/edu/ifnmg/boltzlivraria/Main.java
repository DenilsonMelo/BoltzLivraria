/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.boltzlivraria;

import br.edu.ifnmg.boltzlivraria.entidade.Autor;
import br.edu.ifnmg.boltzlivraria.entidade.Editora;
import br.edu.ifnmg.boltzlivraria.entidade.Livro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class Main {
    
    private static ArrayList<Autor> listaAutores = new ArrayList<>();
    private static ArrayList<Editora> listaEditoras = new ArrayList<>();
    private static ArrayList<Livro> listaLivros = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        inicializarDados();     
        menuLivraria();
    }
    
    public static void inicializarDados(){
        //AUTORES
        Autor autor1 = new Autor(1, "Carlos", "Pereira", "Castro");
        Autor autor2 = new Autor(2, "Roberto", "Castro", "Silva");
        Autor autor3 = new Autor(3, "Lucas", "Da Silva", "Costa");
        Autor autor4 = new Autor(4, "Marcos", "Costa", "Neves");
        Autor autor5 = new Autor(5, "Maria", "Pereira", "Santos");
        Autor autor6 = new Autor(6, "Julia", "Leal", "Pereira");
        Autor autor7 = new Autor(7, "Joana", "Rodrigues", "Araujo");
        Autor autor8 = new Autor(8, "José", "Araujo", "Castro");
        Autor autor9 = new Autor(9, "Joaquim", "Pereira", "Rodrigues");

        listaAutores.add(autor1);
        listaAutores.add(autor2);
        listaAutores.add(autor3);
        listaAutores.add(autor4);
        listaAutores.add(autor5);
        listaAutores.add(autor6);
        listaAutores.add(autor7);
        listaAutores.add(autor8);
        listaAutores.add(autor9);
        
        //EDITORAS
        Editora editora1 = new Editora(1, "Editora Sanhok", "00.000.001/0123-32", "sanhok@contato.com", "(38)5265-6325");
        Editora editora2 = new Editora(2, "Editora Mirage", "00.000.001/4521-12", "mirage@contato.com", "(99)6652-1214");
        Editora editora3 = new Editora(3, "Editora Vertigo", "00.000.022/6325-35", "vertigo@contato.com", "(38)9865-6325");
        Editora editora4 = new Editora(4, "Editora Erangel", "00.000.034/2254-77", "erangel@contato.com", "(61)2214-3662");
        
        listaEditoras.add(editora1);
        listaEditoras.add(editora2);
        listaEditoras.add(editora3);
        listaEditoras.add(editora4);
        
        //LIVROS
        Livro livro1 = new Livro(1, "A volta dos que não foram", "2015", autor1, editora1, "Romance","99-254-5264-8" ,25.99, 20);
        Livro livro2 = new Livro(2, "As tranças do rei careca", "2009", autor2, editora3, "Ficção","52-336-1102-4" ,22.99, 30);
        Livro livro3 = new Livro(3, "A vida mentirosa dos adultos", "2012", autor1, editora4, "Suspense","55-552-4582-3" ,29.99, 25);
        Livro livro4 = new Livro(4, "A Irmã do Sol", "2018", autor4, editora3, "Ficção","63-996-6357-1" ,23.99, 32);
        Livro livro5 = new Livro(5, "A vida não é útil", "2020", autor3, editora2, "Suspense","18-369-1597-8" ,35.99, 15);
        
        listaLivros.add(livro1);
        listaLivros.add(livro2);
        listaLivros.add(livro3);
        listaLivros.add(livro4);
        listaLivros.add(livro5);
    }
     
    public static void menuLivraria(){
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do{
            System.out.println("\n\n%%%%%%%%%%%%%%%BOLTZ LIVRARIA%%%%%%%%%%%%%%%");
            System.out.println("%% 1 - Cadastros                          %%");
            System.out.println("%% 2 - Consultas                          %%");
            System.out.println("%% 3 - Efetuar venda                      %%");          
            System.out.println("%% 4 - Sair                               %%");
            System.out.println("%% Informe a operação:                    %%");
            operacao = scanner.nextInt();
            
            if(operacao == 1){
               menuCadastros();
            }else if(operacao == 2){
                menuConsultas();
            }else if(operacao ==  3){
                //
            }
        }while(operacao != 4);
    
    }
    
    public static void exibirMenuOpcoes(){
        System.out.println("\n\n%%%%%%%%%%%%%%%BOLTZ LIVRARIA%%%%%%%%%%%%%%%");
        System.out.println("%% 1 - Livros                             %%");
        System.out.println("%% 2 - Autores                            %%");          
        System.out.println("%% 3 - Editoras                           %%");
        System.out.println("%% 4 - Voltar para o menu                 %%");
        System.out.println("%% 0 - Sair                               %%");
        System.out.println("%% Informe a operação:                    %%");
    }
    
    public static void menuCadastros(){
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do{
            exibirMenuOpcoes();
            operacao = scanner.nextInt();
            
            if(operacao == 1){
//                cadastrarLivros();
            }else if(operacao == 2){
                //
            }else if(operacao ==  3){
                //
            }
        }while(operacao != 4);
    }
    
    public static void menuConsultas(){
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do{
            exibirMenuOpcoes();
            operacao = scanner.nextInt();
            
            if(operacao == 1){
                consultarLivros();
            }else if(operacao == 2){
                consultarAutores();
            }else if(operacao ==  3){
                consultarEditoras();
            }else if(operacao ==  4){
                menuLivraria();
            }
        }while(operacao != 0);
        
    }
    
    public static void consultarLivros(){
        System.out.println("\n\n%%%%%%%%%%%%%%%BOLTZ LIVRARIA%%%%%%%%%%%%%%%");
        listaLivros.forEach(livro -> {
            System.out.println(livro);
        });
    }
    
    public static void consultarAutores(){
        System.out.println("\n\n%%%%%%%%%%%%%%%BOLTZ LIVRARIA%%%%%%%%%%%%%%%");
        listaAutores.forEach(autor -> {
            System.out.println(autor.getCodigoAutor() + " | " + autor.gerarReferencia());
        });
    }
    
    public static void consultarEditoras(){
        System.out.println("\n\n%%%%%%%%%%%%%%%BOLTZ LIVRARIA%%%%%%%%%%%%%%%");
        listaEditoras.forEach(editora -> {
            System.out.println(editora);
        });
    }

}
