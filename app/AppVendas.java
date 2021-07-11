package app;

import java.time.LocalDate;
import java.util.Scanner;

import classes.Cadastro;
import classes.Produtos;
import classes.Venda;
import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class AppVendas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int menu;

        // referencia para classe Produto
        Produtos objProdutos;

        String nome;
        float valor;
        int codigo, quantidadeEstoque;

        // referencia para classe RegistroVenda
        Venda objVenda;

        String data;
        String produto;
        int quantidade;

        do {
            exibirMenu();
            menu = entrada.nextInt();

            switch (menu) {
                case 1: // cadastro do produto
                    System.out.println("===> Cadastrar Produtos");
                    System.out.println("Digite o Código: ");
                    codigo = entrada.nextInt();
                    System.out.println("Digite o Nome do Produto: ");
                    nome = entradaString.nextLine();
                    System.out.println("Digite o Valor: ");
                    valor = entrada.nextFloat();
                    System.out.println("Digite a Quantidade em Estoque: ");
                    quantidadeEstoque = entrada.nextInt();

                    // criar o objeto da classe
                    objProdutos = new Produtos(codigo, nome, valor, quantidadeEstoque);

                    // guardar no ArrayList
                    Cadastro.adicionar(objProdutos);

                    break;
                case 2:
                    System.out.println("===> Listagem de Produtos");
                    System.out.println(Cadastro.listar());

                    break;
                case 3:
                    System.out.println("===> Consultar Produtos");
                    System.out.println("Digite o Nome do Produto: ");
                    nome = entradaString.nextLine();
                    System.out.println("Existem " + Cadastro.pesquisar(nome) + "Produtos do nome " + nome);
                    break;
                case 4:
                    // Realizar Vendas
                    System.out.println("===> Realizar Venda");
                    System.out.println("Data da Venda: ");
                    data = entradaString.nextLine();
                    System.out.println("Informar o Produto Vendido: ");
                    produto = entrada.nextLine();
                    System.out.println("Informar quantidade Vendida: ");
                    quantidade = entrada.nextInt();

                    // criar o objetoo da classe
                    objVenda = new Venda(data, produto, quantidade);

                    // guardar no ArrayList

                    break;
                case 5:

                    break;
                case 6:

                    break;

                default:
                    System.out.println("Opção de menu inválida!!!");
            }

        } while (menu != 6);

    } // fim main

    static void exibirMenu() {
        System.out.println("======APP VENDAS======");
        System.out.println("1. Incluir Produto");
        System.out.println("2. Listagem de Produtos");
        System.out.println("3. Consultar Produto");
        System.out.println("4. Realizar Venda");
        System.out.println("5. Vendas por período - detalhado");
        System.out.println("6. Sair");
        System.out.println("====> Escolha uma opção: ");
    }
}
