package co.edu.unbosque.model;

public class Ejecutivo extends Gerente{

	private String admin;
	private String dirigir;
	
	public Ejecutivo(String nombre, int edad) {
		super(nombre, edad);
		this.admin = "administra todos los aspectos de la empresa.";
		this.dirigir = "El ejecutivo puede dirigir u ordenar \ndirectamente a cualquier miembro de la empresa.";
	}
	
	public String adminEmpresa() {
		return super.nombre+" "+this.admin;
	}
	
	public String dirigirEmpresa() {
		return this.dirigir;
	}

	@Override
	public String organizarEmpleados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generarObjetivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String valorSueldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String personaEmpresa(String nombre, int edad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dormir(String dormido) {
		// TODO Auto-generated method stub
		return null;
	}
}
