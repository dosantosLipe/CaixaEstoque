public class Produto {

    private String nome;
    private int quantidade;
    private double valor;

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void adiconarestoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerestoque(int quantidade) {
        if (this.quantidade >= quantidade)
            this.quantidade -= quantidade;
    }

    public void valorproduto(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }
}
