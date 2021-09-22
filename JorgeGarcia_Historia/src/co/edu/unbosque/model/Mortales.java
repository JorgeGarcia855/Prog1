package co.edu.unbosque.model;

public class Mortales extends KublaKan{

	public Mortales(String nombre, int edad, double estatura, String ojos, boolean alma) {
		super(nombre, edad, estatura, ojos, alma);
	}

	@Override
	public String habitarPlaneta() {
		return "habita en el este del planeta.";
	}

	@Override
	public String sentir() {
		return super.nombre+" puede sentir a otros mortales.";
	}
	
	public String conocimientos(){
		return super.nombre+" puede adquirir conocimientos.";
	}
	
	public String familia(){
		return super.nombre+" tiene una familia.";
	}
	
	public String profesión(){
		return super.nombre+" ejerce una profesión.";
	}
	
	public String colorOjos(){
		try {
			if (getColor_ojos()!="violeta") {
				throw new ColorOjosInvalidoException();
			}
		} catch (ColorOjosInvalidoException e) {
			return "El color es invalido.";
		}
		return "Sus ojos son color "+getColor_ojos()+".";
	}

}
