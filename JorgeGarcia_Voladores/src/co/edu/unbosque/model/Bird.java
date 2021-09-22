package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer{

	

	@Override
	public String takeOff() {
		return "la ave empieza a volar";
	}

	@Override
	public String land() {
		return "la ave aterriza";
	}

	@Override
	public String fly() {
		return "la ave vuela";
	}
	
	public String layEggs() {
		return "la ave hace huevos";
	}

	@Override
	public String eat() {
		return "la ave come";
	}
	
	public String buildNest() {
		return "la ave hace un nido";
	}

}
