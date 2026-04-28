public class PedidoService {
    private FacturaService facturaService;

    public PedidoService(FacturaService facturaService) {
        this.facturaService = facturaService;
    }
    public void registrarPedido(Pedido pedido) {
        pedido.validarPedido();
        if(pedido.isEstado()){
            facturaService.emitirFactura(pedido.getCliente(), pedido.getMonto());
            System.out.println("Pedido registrado con exito");

        }else {
            System.out.println("Pedido no registrado con exito");
        }
    }
}
