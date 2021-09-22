package co.edu.unbosque.model;

public class Desterrados extends KublaKan{
	
	private int vivir;

	public Desterrados(String nombre, int edad, double estatura, String ojos, boolean alma) {
		super(nombre, edad, estatura, ojos, alma);
	}

	@Override
	public String habitarPlaneta() {
		return super.nombre+" habita en el extremo sur del planeta.";
	}

	@Override
	public String sentir() {
		return super.nombre+" solo se siente a si mismo.";
	}
	
	public String arrastrar() {
		return super.nombre+" se arrastra de un lugar a otro.";
	}
	
	public String alma() {
		String soul = "";
		try {
			if (isAlma()==false) {
				soul = "no es autentica";
			}else {
				throw new CondicionAlmaInvalidaException();
			}
		}catch (CondicionAlmaInvalidaException e) {
			return "Tipo de alma invalido";
		}
		return "Su alma "+soul;
	}
	
	public String duracionVida() {
		return "El vivia exactamente "+getVivir()+" años.";
	}

	public int getVivir() {
		return vivir;
	}

	public void setVivir(int vivir) {
		this.vivir = vivir;
	}

}
