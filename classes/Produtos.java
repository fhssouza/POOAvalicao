package classes;

public class Produtos {
    // atributos
    private int codigo;
    private String nome;
    private float valor;
    private int quantidadeEstoque;

    // Construturores
    public Produtos() {
    } // default
      // sobrecarregado

    public Produtos(int codigo, String nome, float valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // métodos de acesso - getters - setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String imprimir() {
        return "Código: " + codigo + "\nNome: " + nome + String.format("\nValor R$ %.2f \n", valor)
                + "\nQuantidade em Estoque: " + quantidadeEstoque;

    }

}
