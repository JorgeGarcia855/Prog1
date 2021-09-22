package co.edu.unbosque.model;

public class Comercial extends Gerente{
	
	private String redes;
	private String trade;

	public Comercial(String nombre, int edad) {
		super(nombre, edad);
		this.redes = "maneja las redes de comercio.";
		this.trade = "Este controla las ventas de la empresa.";
	}
	
	public String redesComercio() {
		return super.nombre+" "+this.redes;
	}
	
	public String trading() {
		return this.trade;
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
