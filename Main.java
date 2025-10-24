public class Main {
    public static void main(String[] args) {

        System.out.println("--- Criando Pedido 1 (Caminho Feliz) ---");
        Order pedido1 = new Order();

        pedido1.pagar();    
        pedido1.enviar(); 
        pedido1.entregar(); 

        System.out.println("\n--- Tentando ações no Pedido 1 (já Entregue) ---");
        pedido1.pagar();   
        pedido1.cancelar();

        System.out.println("\n\n--- Criando Pedido 2 (Tentando ações erradas) ---");
        Order pedido2 = new Order();

        pedido2.enviar();
        pedido2.entregar(); 
        pedido1.pagar();     
        pedido2.pagar();     
        pedido2.pagar();    

        System.out.println("\n\n--- Criando Pedido 3 (Cancelamento) ---");
        Order pedido3 = new Order();
        
        pedido3.cancelar();
        pedido3.pagar();
    }
}