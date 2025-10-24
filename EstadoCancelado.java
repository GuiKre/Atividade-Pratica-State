public class EstadoCancelado implements EstadoPedido {

    @Override
    public void pagar(Order pedido) {
        System.out.println("[ERRO] Não é possível pagar um pedido cancelado.");
    }

    @Override
    public void enviar(Order pedido) {
        System.out.println("[ERRO] Não é possível enviar um pedido cancelado.");
    }

    @Override
    public void entregar(Order pedido) {
        System.out.println("[ERRO] Não é possível entregar um pedido cancelado.");
    }

    @Override
    public void cancelar(Order pedido) {
        System.out.println("[ERRO] O pedido já está cancelado.");
    }
}