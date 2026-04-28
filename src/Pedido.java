public class Pedido {
    private Cliente cliente;
    private double monto;
    private boolean estado;


    public Pedido(Cliente cliente, double monto, boolean estado) {
        this.cliente = cliente;
        this.monto = monto;
        this.estado = estado;
    }


    public Pedido() {
    }

    public Pedido(Cliente cliente, double v) {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void validarPedido() {
        System.out.println("Validando pedido...");
        if (estado) {
            System.out.println("Pedido validado correctamente");
        }
    }
}