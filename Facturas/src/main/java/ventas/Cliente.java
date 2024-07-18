package ventas;

public class Cliente {
    //Atributos
    private int idCliente;
    private String nombreCliente;
    private TipoPago tipoPago;
    
    //Constructor
    public Cliente(String nombreCliente, TipoPago tipoPago) {
        this.nombreCliente = nombreCliente;
        this.tipoPago = tipoPago;
    }

    //Método toString
    @Override
    public String toString() {
        return nombreCliente + "," + " Tipo de Pago: " + tipoPago;
    }
}
