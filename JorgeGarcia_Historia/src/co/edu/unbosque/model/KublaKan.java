package co.edu.unbosque.model;

public abstract class KublaKan {
	
	protected int edad;
	protected double estatura;
	protected String color_ojos;
	protected boolean alma;
	protected String nombre;
	
	public KublaKan(String nombre, int edad, double estatura, String ojos, boolean alma) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		this.color_ojos = ojos;
		this.alma = alma;
	}

	public abstract String habitarPlaneta();
	public abstract String sentir();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getColor_ojos() {
		return color_ojos;
	}

	public void setColor_ojos(String color_ojos) {
		this.color_ojos = color_ojos;
	}

	public boolean isAlma() {
		return alma;
	}

	public void setAlma(boolean alma) {
		this.alma = alma;
	}

}
