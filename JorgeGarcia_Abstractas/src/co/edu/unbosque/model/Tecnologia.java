package co.edu.unbosque.model;

public class Tecnologia extends Empleado{
	
	protected String recursos;
	protected String dispositivos;

	public Tecnologia(String nombre, int edad) {
		super(nombre, edad);
		this.recursos = "revisa los recursos disponibles.";
		this.dispositivos = "No hay ningun dispositivo tecnologico disponible.";
	}
	
	public String verificarRecursos() {
		return super.nombre+" "+this.recursos;
	}
	
	public String dispDisponibles() {
		return this.dispositivos;
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
