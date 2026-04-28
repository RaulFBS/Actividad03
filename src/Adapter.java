public class Adapter implements FacturaService{
    private LegacyBillingSystem legacyBillingSystem;
    public Adapter(LegacyBillingSystem legacyBillingSystem){
        this.legacyBillingSystem = legacyBillingSystem;
    }

    @Override
    public void emitirFactura(Cliente cliente, double monto) {
        String nombreCliente = cliente.getNombre();
        String montoTexto = String.valueOf(monto);

        legacyBillingSystem.crearBoletaElectronica(nombreCliente,montoTexto);

        System.out.println("Factura emitidada com exito");

    }
}
