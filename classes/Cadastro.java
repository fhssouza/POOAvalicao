package classes;

import java.util.ArrayList;

public class Cadastro {
    private static ArrayList<Produtos> listaProdutos = new ArrayList<>();

    // metodo GET
    public static ArrayList<Produtos> getListaProdutos() {
        return listaProdutos;
    }

    // Adicionar um objeto na lista
    static public void adicionar(Produtos p) {
        listaProdutos.add(p);

    }

    // Lista os dados de todos os objetos da lista
    static public String listar() {
        String saida = "";
        int i = 1;
        for (Produtos p : listaProdutos) {
            saida += "\n======== Produto N.º " + (i++) + " ======\n";
            saida += p.imprimir() + "\n";
        }
        return saida;
    }

    // pesquisar por nome do produto
    static public int pesquisar(String nome) {
        int qtd = 0;

        for (Produtos p : listaProdutos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                qtd++;
            }
        }

        return qtd;
    }

}
