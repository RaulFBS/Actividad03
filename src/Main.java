//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  Cliente cliente = new Cliente("Raul Bonilla", "75343242");
  Pedido pedido = new Pedido( cliente,231.50,true);
  LegacyBillingSystem legacyBillingSystem = new LegacyBillingSystem();
  FacturaService facturaService = new Adapter(legacyBillingSystem);
  PedidoService pedidoService= new PedidoService(facturaService);

  pedidoService.registrarPedido(pedido);
}
