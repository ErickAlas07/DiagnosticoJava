package test.ventas;

import ventas.*;

public class Ventas {
    public static void main(String[] args) {
        
        //Agregar clientes
        Cliente cliente1 = new Cliente("Erick Alas", TipoPago.CONTADO);
        Cliente cliente2 = new Cliente("Alexander Galdámez", TipoPago.CREDITO);
        Cliente cliente3 = new Cliente("Leticia Alvarenga", TipoPago.CONTADO);

        //Agregar productos
        Producto producto1 = new Producto("Jabón", 3.5);
        Producto producto2 = new Producto("Cepillo de diente", 5.5);
        Producto producto3 = new Producto("Shampoo Freeze", 13.5);
        Producto producto4 = new Producto("Taza", 1.5);
        Producto producto5 = new Producto("Acondicionador", 14.5);
        Producto producto6 = new Producto("Enjuage bucal", 4.5);
        Producto producto7 = new Producto("Platos desechables", 1.5);
        
        // Creación de ordenes
        Orden orden1 = new Orden();
        
        //Asignar un cliente a la orden
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
       
        //Agregar productos y cliente a la orden
        orden2.agregarCliente(cliente2);

        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        
        // Mostrar detalles de la orden 
        orden2.mostrarOrden();
        
                // Creación de orden 2
        Orden orden3 = new Orden();
       
        //Agregar productos y cliente a la orden
        orden3.agregarCliente(cliente3);

        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto6);
        orden3.agregarProducto(producto7);
        
        // Mostrar detalles de la orden 
        orden3.mostrarOrden();
    }
}
