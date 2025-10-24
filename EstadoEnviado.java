public class EstadoEnviado implements EstadoPedido {

    @Override
    public void pagar(Order pedido) {
        System.out.println("[ERRO] O pedido já foi pago e enviado.");
    }

    @Override
    public void enviar(Order pedido) {
        System.out.println("[ERRO] O pedido já foi enviado.");
    }

    @Override
    public void entregar(Order pedido) {
        pedido.setEstado(new EstadoEntregue());
        System.out.println("Pedido entregue ao cliente. Pedido mudou para: Entregue");
    }

    @Override
    public void cancelar(Order pedido) {
        System.out.println("[ERRO] Não é possível cancelar um pedido que já foi enviado.");
    }
}