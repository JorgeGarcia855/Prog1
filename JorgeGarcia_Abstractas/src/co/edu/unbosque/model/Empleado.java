package co.edu.unbosque.model;

public abstract class Empleado extends Persona{
	
	protected String cargo;
	protected double sueldo;
	
	public Empleado(String nombre, int edad) {
		super(nombre, edad);
		this.cargo = "trabaja todo el dia";
		this.sueldo = 150000.0;
	}
	
	public abstract String trabajar();
	public abstract String valorSueldo();

}
