package co.edu.unbosque.model;

public abstract class Persona {
	
	protected String nombre;
	protected int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public abstract String personaEmpresa(String nombre, int edad);
	public abstract String dormir(String dormido);
		
}
