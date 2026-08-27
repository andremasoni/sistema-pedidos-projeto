package pedidos;

public class Produto {
    private int id;
    private String nomeProduto;
    private double valorProduto;
    private int produtoEstoque;

    public Produto(int id, String nomeProduto, double valorProduto, int produtoEstoque) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.produtoEstoque = produtoEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public int getProdutoEstoque() {
        return produtoEstoque;
    }
}
