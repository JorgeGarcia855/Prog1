package co.edu.unbosque.model;

public class SeaPlane extends Airplane {

	@Override
	public String takeOff() {
		return "el avion acuatico despega";
	}

	@Override
	public String land() {
		return "el avion acuatico aterriza en el mar";
	}

	@Override
	public String fly() {
		return "el avion acuatico puede volar";
	}

	@Override
	public String vehiculoConducible() {
		return "el avion acuatico se puede conducir";
	}
	
	
	
}
