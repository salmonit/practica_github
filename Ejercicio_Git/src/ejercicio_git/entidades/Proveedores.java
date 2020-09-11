package ejercicio_git.entidades;

public class Proveedores {

	private int telefono; 
	private String nit; 
	private String direccion; 
	private int cantidad; 
	private String producto; 
	private String nombreProveedor ;
	
	private Proveedores(int telefono, String nit, String direccion, int cantidad, String producto,
			String nombreProveedor) {
		
		this.telefono = telefono;
		this.nit = nit;
		this.direccion = direccion;
		this.cantidad = cantidad;
		this.producto = producto;
		this.nombreProveedor = nombreProveedor;
	} 
	
	private Proveedores () {}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	

	
	
}
