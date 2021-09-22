package co.edu.unbosque.model;

public class Airplane extends Vehicle implements Flyer{

	@Override
	public String takeOff() {
		return "el avion despega";
	}

	@Override
	public String land() {
		return "el avion aterriza";
	}

	@Override
	public String fly() {
		return "el avion vuela";
	}

	@Override
	public String vehiculoConducible() {
		return "el avion es un vehiculo conducibles";
	}
	
}
