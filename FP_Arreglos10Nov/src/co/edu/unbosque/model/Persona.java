package co.edu.unbosque.model;

public class Persona {

	private String nombre;
	private long telefono;
	private int edad;
	private String correo;
	
	public Persona() {
		nombre = "";
		telefono = 0;
		edad = 0;
		correo = "";
	}
		
	public Persona(String nombre, long telefono, int edad, String correo) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+" || Telefono: "+ telefono +" || Edad: "+edad+" || Correo: "+correo;
	}
	
	
	
}
