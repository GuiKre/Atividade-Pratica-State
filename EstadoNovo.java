public class EstadoNovo implements EstadoPedido {

    @Override
    public void pagar(Order pedido) {
        pedido.setEstado(new EstadoPago());
        System.out.println("Pagamento recebido. Pedido mudou para: Pago");
    }

    @Override
    public void enviar(Order pedido) {
        System.out.println("[ERRO] Não é possível enviar um pedido que ainda não foi pago.");
    }

    @Override
    public void entregar(Order pedido) {
        System.out.println("[ERRO] Não é possível entregar um pedido que ainda não foi pago.");
    }

    @Override
    public void cancelar(Order pedido) {
        pedido.setEstado(new EstadoCancelado());
        System.out.println("Pedido cancelado.");
    }
}