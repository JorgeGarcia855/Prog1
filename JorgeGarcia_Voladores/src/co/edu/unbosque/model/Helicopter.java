package co.edu.unbosque.model;

public class Helicopter extends Airplane{

	@Override
	public String takeOff() {
		return "el helicoptero despega";
	}

	@Override
	public String land() {
		return "el helicoptero aterriza en un helipueto";
	}

	@Override
	public String fly() {
		return "el helicoptero puede volar";
	}

	@Override
	public String vehiculoConducible() {
		return "el helicoptero es un vehiculo conducible";
	}

}
