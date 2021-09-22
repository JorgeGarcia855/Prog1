package co.edu.unbosque.model;

public abstract class Gerente extends Empleado{
	
	protected String orgnanizar;
	protected String objetivos;

	public Gerente(String nombre, int edad) {
		super(nombre, edad);
		this.orgnanizar = "esta organizando los deberes de los empleados.";
		this.objetivos = "El gerente crea las decisiones.";
	}
	
	public abstract String organizarEmpleados();
	public abstract String generarObjetivos();

}
