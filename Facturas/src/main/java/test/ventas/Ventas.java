package test.ventas;

import ventas.*;

public class Ventas {
    public static void main(String[] args) {
        
        //Agregar clientes
        Cliente cliente1 = new Cliente("Erick Alas", TipoPago.CONTADO);
        Cliente cliente2 = new Cliente("Alexander Galdámez", TipoPago.CREDITO);

        //Agregar productos
        Producto producto1 = new Producto("Jabón", 3.5);
        Producto producto2 = new Producto("Cepillo de diente", 5.5);
        Producto producto3 = new Producto("Shampoo Freeze", 13.5);
        Producto producto4 = new Producto("Taza", 1.5);
        
        // Creación de ordenes
        Orden orden1 = new Orden();
        
        // Asignación de cliente a la orden
        orden1.agregarCliente(cliente1);
        
        // Agregar productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        
        // Mostrar detalles de la orden 
        orden1.mostrarOrden();
        
        // Creación de orden 2
        Orden orden2 = new Orden();
        
        // Asignación de cliente a la orden
        orden2.agregarCliente(cliente2);
        
        // Agregar productos a la orden
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        
        // Mostrar detalles de la orden 
        orden2.mostrarOrden();
    }
}
