import java.util.ArrayList;

public class RegistroVenda {
    private static ArrayList<Venda> registroVenda = new ArrayList<>();

    // metodo GET
    public static ArrayList<Venda> getRegistroVenda() {
        return registroVenda;
    }

    // Adicionar um objeto na lista
    static public void adicionar(Venda v) {
        registroVenda.add(v);

    }

    // Lista os dados de todos os objetos da lista
    static public String listar() {
        String saida = "";
        int i = 1;
        for (Venda v : registroVenda) {
            saida += "\n======== Venda N.º " + (i++) + " ======\n";
            saida += v.imprimir() + "\n";
        }
        return saida;
    }

}
