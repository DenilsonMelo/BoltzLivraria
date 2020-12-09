/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.boltzlivraria;

import br.edu.ifnmg.boltzlivraria.entidade.Autor;
import br.edu.ifnmg.boltzlivraria.entidade.Cliente;
import br.edu.ifnmg.boltzlivraria.entidade.Editora;
import br.edu.ifnmg.boltzlivraria.entidade.Funcionario;
import br.edu.ifnmg.boltzlivraria.entidade.ItensVenda;
import br.edu.ifnmg.boltzlivraria.entidade.Livro;
import br.edu.ifnmg.boltzlivraria.entidade.Transacao;
import br.edu.ifnmg.boltzlivraria.entidade.Venda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author denilson
 */
public class Main {
    
    private static ArrayList<Autor> listaAutores = new ArrayList<>();
    private static ArrayList<Editora> listaEditoras = new ArrayList<>();
    private static ArrayList<Livro> listaLivros = new ArrayList<>();
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Venda> listaVendas = new ArrayList<>();
    private static ArrayList<Transacao> listaTransacao = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        inicializarDados();     
        autenticarFuncionario();
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
        
        //FUNCIONARIOS
        Funcionario funcionario1 = new Funcionario("marta", "atram258");
        Funcionario funcionario2 = new Funcionario("pedro", "ordep852");
        
        listaFuncionarios.add(funcionario1);
        listaFuncionarios.add(funcionario2);
        
        //CLIENTES
        GregorianCalendar data1 = new GregorianCalendar(2000, 2, 1);
        Cliente cliente1 = new Cliente(data1);
        GregorianCalendar data2 = new GregorianCalendar(1999, 5, 22);
        Cliente cliente2 = new Cliente(data2);
        
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
    }
     
    public static void menuLivraria(Funcionario funcionario){
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
                menuCadastros(funcionario);
            }else if(operacao == 2){
                menuConsultas(funcionario);
            }else if(operacao ==  3){
                efetuarVenda(funcionario);
            }
        }while(operacao != 4);
    
    }
    
    public static void exibirMenuOpcoes(Funcionario funcionario){
        System.out.println("\n\n%%%%%%%%%%%%%%%BOLTZ LIVRARIA%%%%%%%%%%%%%%%");
        System.out.println("%% 1 - Livros                             %%");
        System.out.println("%% 2 - Autores                            %%");          
        System.out.println("%% 3 - Editoras                           %%");
        System.out.println("%% 4 - Voltar para o menu                 %%");
        System.out.println("%% 0 - Sair                               %%");
        System.out.println("%% Informe a operação:                    %%");
    }
    
    public static void menuCadastros(Funcionario funcionario){
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do{
            exibirMenuOpcoes(funcionario);
            operacao = scanner.nextInt();
            
            if(operacao == 1){
                cadastrarLivro();
            }else if(operacao == 2){
                cadastrarAutor();
            }else if(operacao ==  3){
                cadastrarEditora();
            }
        }while(operacao != 4);
    }
    
    public static void menuConsultas(Funcionario funcionario){
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do{
            exibirMenuOpcoes(funcionario);
            operacao = scanner.nextInt();
            
            if(operacao == 1){
                consultarLivros();
            }else if(operacao == 2){
                consultarAutores();
            }else if(operacao ==  3){
                consultarEditoras();
            }else if(operacao ==  4){
                menuLivraria(funcionario);
            }
        }while(operacao != 0);
        
    }
    
    public static void consultarLivros(){
        listaLivros.forEach(livro -> {
            System.out.println(livro);
        });
    }
    
    public static void consultarAutores(){
        listaAutores.forEach(autor -> {
            System.out.println(autor.getCodigoAutor() + " | " + autor.gerarReferencia());
        });
    }
    
    public static void consultarEditoras(){
        listaEditoras.forEach(editora -> {
            System.out.println(editora);
        });
    }

    public static void cadastrarLivro(){
        System.out.println("\n\n%%%%%%%%%%%%%%%BOLTZ LIVRARIA%%%%%%%%%%%%%%%");
        
        Livro livro = new Livro();
        Scanner scanner = new Scanner(System.in);
        
        livro.setCodigoLivro(listaLivros.size()+1);
        
        System.out.println("Qual o titulo? ");
        livro.setTitulo(scanner.nextLine());        
        System.out.println("Qual o ano de publicação? ");
        livro.setAnoPublicacao(scanner.nextLine());
        
        System.out.println("Lista de autores cadastrados: ");
        consultarAutores();
        System.out.println("Qual o código do autor? ");
        int codigoAutor = scanner.nextInt();
        livro.setAutor(listaAutores.get((codigoAutor)-1));
        
        System.out.println("Lista de editoras cadastradas: ");
        consultarEditoras();
        System.out.println("Qual o código da editora? ");
        int codigoEditora = scanner.nextInt();
        livro.setEditora(listaEditoras.get((codigoEditora)-1));
        
        System.out.println("Qual a categoria? ");
        livro.setCategoria(scanner.next());
        System.out.println("Qual o ISBN? ");
        livro.setIsbn(scanner.next());
        System.out.println("Qual o valor? ");
        livro.setPreco(scanner.nextDouble());
        System.out.println("Qual a quantidade? ");
        livro.setQuantidade(scanner.nextInt());
                
        listaLivros.add(livro);
        
        System.out.println("\nLivro cadastrado com sucesso!");

    }
    
    public static void cadastrarAutor(){
        System.out.println("\n\n%%%%%%%%%%%%%%%BOLTZ LIVRARIA%%%%%%%%%%%%%%%");
        
        Autor autor = new Autor();
        Scanner scanner = new Scanner(System.in);
        
        autor.setCodigoAutor(listaAutores.size()+1);
        
        System.out.println("Qual o nome? ");
        autor.setNome(scanner.nextLine());
        System.out.println("Qual o primeiro sobrenome? ");
        autor.setPrimeiroSobrenome(scanner.nextLine());
        System.out.println("Qual o ultimo sobrenome? ");
        autor.setUltimoSobrenome(scanner.nextLine());
        
        listaAutores.add(autor);
        
        System.out.println("\nAutor cadastrado com sucesso!");
    }
    
    public static void cadastrarEditora(){
        System.out.println("\n\n%%%%%%%%%%%%%%%BOLTZ LIVRARIA%%%%%%%%%%%%%%%");
        
        Editora editora = new Editora();
        Scanner scanner = new Scanner(System.in);
        
        editora.setCodigoEditora(listaEditoras.size()+1);
        
        System.out.println("Qual a razão social? ");
        editora.setRazaoSocial(scanner.nextLine());
        System.out.println("Qual o CNPJ? ");
        editora.setCnpj(scanner.nextLine());
        System.out.println("Qual o email de contato? ");
        editora.setEmail(scanner.nextLine());
        System.out.println("Qual o telefone? ");
        editora.setTelefone(scanner.nextLine());
        
        listaEditoras.add(editora);
        
        System.out.println("\nEditora cadastrada com sucesso!");
    }
    
    private static void autenticarFuncionario() {
        Scanner scanner = new Scanner(System.in);        

        Funcionario funcionarioPesquisado = null;
        
        do{        
            System.out.println("\nDigite o login: ");
            String loginPesquisado = scanner.next();      
            System.out.println("Digite a senha: ");
            String senhaPesquisada = scanner.next();
            
            for(Funcionario funcionario : listaFuncionarios){
                if(funcionario.getLogin().equals(loginPesquisado)) {
                    funcionarioPesquisado = funcionario;

                    boolean autenticadoSucesso = funcionarioPesquisado.autenticar(senhaPesquisada);

                    if(autenticadoSucesso){
                        System.out.printf("\nAutenticado com sucesso!");
                        menuLivraria(funcionarioPesquisado);
                    }else{
                        System.out.printf("\nNão autenticado! Senha incorreta.");
                    }
                }
            }
            
            System.out.println("\nFuncionário não encontrado!");
            
        }while (funcionarioPesquisado == null);
    }
    
    public static void efetuarVenda(Funcionario funcionario){
        Scanner scanner = new Scanner(System.in);
        
        Venda venda = new Venda();
        
        int operacao = 1;
        double preco = 0;
        int quantidadeParcelas = 1;
                        
        System.out.println("\n\n%%%%%%%%%%%%%%%BOLTZ LIVRARIA%%%%%%%%%%%%%%%");

        System.out.println("Informe o código cliente: ");
        int codigoCliente = scanner.nextInt();
        
        while(operacao != 0){
            ItensVenda itens = new ItensVenda();
            System.out.println("Informe o código do livro: ");
            int codigoLivro = scanner.nextInt();
            
            for(Livro livro : listaLivros){
                if(livro.getCodigoLivro() == codigoLivro){
                    preco = livro.getPreco();
                }
            }
            
            System.out.println("Informe a quantidade: ");
            int quantidade = scanner.nextInt();
            
            itens.setIdVenda(venda.getCodigoVenda());
            itens.setIdLivro(codigoLivro);
            itens.setQuantidade(quantidade);
            
            System.out.println("Informe o metódo de pagamento: 1-DINHEIRO 2-CARTÃO");
            int formaPagamento = scanner.nextInt();
            

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
   
            venda.setIdCliente(codigoCliente);
            venda.setIdFuncionario(funcionario.getCodigoFuncionario());
            venda.setCodigoVenda(listaVendas.size()+1);
            venda.setFormaPagamento(formaPagamento);
            venda.setValor((venda.getValor() + preco) * quantidade);
            venda.setCodigoTransacao(listaTransacao.size()+1);
            venda.setData();

            venda.add(itens);
            
            do{
                System.out.println("Deseja adicionar outro livro? 0-NÃO 1-SIM");
                operacao = scanner.nextInt();
                if(operacao < 0 || operacao > 1){
                    System.err.println("Comando inválido!");
                }
            }while(operacao > 2);
            
            System.out.println("Subtotal: "+ venda.getValor());
            
            listaLivros.get(codigoLivro-1).setQuantidade(listaLivros.get(codigoLivro-1).getQuantidade() - quantidade);
            
        }
        
        listaVendas.add(venda);
        
        System.out.println("Venda concluida com sucesso!");     
        System.out.println("Total: "+ venda.getValor());
    }
}