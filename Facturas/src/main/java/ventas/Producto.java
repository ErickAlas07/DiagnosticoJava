package ventas;

public class Producto {
    
    //Atributos
    private int idProducto;
    private String nombreProducto;
    private double precio;
    private static int contadorProductos;
    
    //Constructores
    public Producto() {
    }

    public Producto(String nombreProducto, double precio) {
        this.idProducto = ++contadorProductos;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    //Getter & Setter
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio + '}';
    }
}
