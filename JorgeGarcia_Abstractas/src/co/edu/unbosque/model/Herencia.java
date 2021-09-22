package co.edu.unbosque.model;

public class Herencia {
	
	private Ejecutivo ej;
	private Mantenimiento m;
	private Comercial c;
	private Tecnologia t;
	
	
	public Herencia() {
		m = new Mantenimiento("Empleado 3", 33);
		t = new Tecnologia("Empleado 4", 55);
		ej = new Ejecutivo("Empleado 5", 42);
		c = new Comercial("Empleado 6", 25);
	}

	public Ejecutivo getEj() {
		return ej;
	}

	public void setEj(Ejecutivo ej) {
		this.ej = ej;
	}

	public Mantenimiento getM() {
		return m;
	}

	public void setM(Mantenimiento m) {
		this.m = m;
	}

	public Comercial getC() {
		return c;
	}

	public void setC(Comercial c) {
		this.c = c;
	}

	public Tecnologia getT() {
		return t;
	}

	public void setT(Tecnologia t) {
		this.t = t;
	}
	
}
