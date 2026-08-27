package pedidos;

public class Pedido {
    private int id;
    private Cliente cliente;
    private String nomePedido;
    private String dataPedido;

    public Pedido (int id,Cliente cliente, String nomePedido,String dataPedido){
        this.id = id;
        this.cliente = cliente;
        this.nomePedido = nomePedido;
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getId(){
        return  id;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

}
