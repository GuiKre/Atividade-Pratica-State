public interface EstadoPedido {

    void pagar(Order pedido);

    void enviar(Order pedido);

    void entregar(Order pedido);

    void cancelar(Order pedido);
}