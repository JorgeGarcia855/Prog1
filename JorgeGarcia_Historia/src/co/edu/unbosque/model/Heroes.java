package co.edu.unbosque.model;

public class Heroes extends KublaKan{
	
	public Heroes(String nombre, int edad, double estatura, String ojos, boolean alma) {
		super(nombre, edad, estatura, ojos, alma);
	}

	@Override
	public String habitarPlaneta() {
		return super.nombre+" habita en el norte del planeta.";
	}

	@Override
	public String sentir() {
		return super.nombre+" se siente a el mismo y a los demas del planeta.";
	}
	
	public String volar() {
		return super.nombre+" puede volar por los aires.";
	}
	
	public String crearFuego() {
		return super.nombre+" puede crear fuego con sus manos.";
	}
	
	public String detenerTiempo() {
		return super.nombre+" puede detener el tiempo.";
	}
	
	public String estatura() {
		try {
			if (getEstatura()!=3.0) {
				throw new EstaturaInvalidaException();
			}
		} catch (EstaturaInvalidaException e) {
			return "Estatura invalida para el heroe";
		}
		return "Su estatura es de "+getEstatura()+" metros";
	}

}
