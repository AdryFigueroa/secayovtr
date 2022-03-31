package Secayovtr;

public class Ejecutivo {


		private int id;
		private String nombre;
		private String apellido;
		private String tipo; // Ejecutivo Atencion o Ejecutivo Soporte

	public Ejecutivo() {
		
	}
	public Ejecutivo(int id,String nombre,String apellido,String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	
}
