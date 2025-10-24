public class EstadoPago implements EstadoPedido {

    @Override
    public void pagar(Order pedido) {
        System.out.println("[ERRO] O pedido já está pago.");
    }

    @Override
    public void enviar(Order pedido) {
        pedido.setEstado(new EstadoEnviado());
        System.out.println("Pedido enviado para o cliente. Pedido mudou para: Enviado");
    }

    @Override
    public void entregar(Order pedido) {
        System.out.println("[ERRO] Não é possível entregar um pedido que ainda não foi enviado.");
    }

    @Override
    public void cancelar(Order pedido) {
        pedido.setEstado(new EstadoCancelado());
        System.out.println("Pedido cancelado (pagamento será estornado).");
    }
}