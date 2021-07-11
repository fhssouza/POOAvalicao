package classes;

public class Venda {
    private String data;
    private String produto;
    private int quantidade;

    public Venda() {
    }

    public Venda(String data, String produto, int quantidade) {
        this.data = data;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String imprimir() {
        return "Data da Venda: " + data + "\nNome do Produto: " + produto + "\nQuantidade Vendida: " + quantidade;

    }
}
