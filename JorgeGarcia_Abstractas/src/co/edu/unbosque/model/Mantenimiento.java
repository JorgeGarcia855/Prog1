package co.edu.unbosque.model;

public class Mantenimiento extends Empleado{
	
	protected String revisar;
	protected int valor;
	
	public Mantenimiento(String nombre, int edad) {
		super(nombre, edad);
		this.revisar = "revisa posibles fallas.";
		this.valor = 150000;
	}
	
	public String revisionObjetos() {
		return super.nombre+" "+this.revisar;
	}
	
	public String reparacionObjetos() {
		return "El valor de la reparacion es "+this.valor;
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
