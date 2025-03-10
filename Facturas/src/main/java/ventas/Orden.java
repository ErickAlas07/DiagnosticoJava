package ventas;

import java.util.Date;

public class Orden {

    //Atributos
    private int idOrden;
    private Producto[] productos;
    private Cliente cliente;
    private Date fecha;
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10; //Constante

    //Constructores 
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
        this.fecha = new Date();
    }

    public void agregarCliente(Cliente cliente) {
        this.cliente = cliente;
        System.out.println("Cliente agregado correctamente.\n");
    }

    public void agregarProducto(Producto producto) {
        try {
            if (contadorProductos >= MAX_PRODUCTOS) {
                throw new ArrayIndexOutOfBoundsException("Producto no agregado, supera el máximo de productos permitidos (" + MAX_PRODUCTOS + ").");
            } else {
                //Agregar producto si hay espacio disponible.
                this.productos[contadorProductos++] = producto;
                System.out.println("Producto agregado correctamente.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //Manejo de la excepción
            System.out.println(e.getMessage());
        }
    }

    public double calcularTotal() {
        //variable para el precio total
        double total = 0;

        //Ciclo for para recorrer productos y obtener el precio de cada producto
        for (int i = 0; i < contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        //Imprimir datos
        System.out.println("\nID Orden: " + idOrden);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente);
        System.out.println("\nProductos de la Orden:\n");

        //Imprimir cada uno de los productos (nombre y precio)
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println((i + 1) + ". " + productos[i].getNombreProducto() + " - $" + productos[i].getPrecio());
        }

        System.out.println("\nTotal de la Orden: $" + calcularTotal());
        System.out.println("\n*************************************\n");
    }

}
