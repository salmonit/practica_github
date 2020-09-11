
package ejercicio_git.entidades;

public class Producto {

    private int id_producto;
    private String nombre;
    private int precio;
    private String proveedor;
    private int cantidad;

    public void Asignacion(int id_producto, String nombre, int precio, String proveedor, int cantidad) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
    }
    

    public void Retorno(){
        
        
    }
    
}
