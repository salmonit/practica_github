/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_git.entidades;

/**
 *
 * @author salmonIT
 */
public class Ventas {
    
    private String producto;
    private Double precio;
    private Integer cantidad;

    public Ventas(String producto, Double precio, Integer cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ventas{" + "producto=" + producto + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
}
