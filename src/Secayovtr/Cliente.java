package Secayovtr;

public class Cliente {

		 private int id;
		 private String rut;
		 private String nombre;
		 private String apellido;
		 private int telefono;
		 private String email;
		 
		 public Cliente() { 
			 
		 }
		  public Cliente(int id,String rut,String nombre,String apellido,int telefono,String email){ 
				 this.id = id;
				 this.rut = rut;
				 this.nombre = nombre;
				 this.apellido = apellido;
				 this.telefono = telefono;
				 this.email = email;
		  }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getRut() {
			return rut;
		}
		public void setRut(String rut) {
			this.rut = rut;
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
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		 
		

}
