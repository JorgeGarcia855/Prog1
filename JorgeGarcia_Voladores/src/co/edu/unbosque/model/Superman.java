package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {

	
	@Override
	public String takeOff() {
		return "Superman despega";
	}

	@Override
	public String land() {
		return "Superman aterriza";
	}

	@Override
	public String fly() {
		return "Superman vuela";
	}
	
	@Override
	public String eat() {
		return "Superman comé";
	}

	@Override
	public String habitanteKryptonia() {
		return "Superman era un habitante de Kryptonia";
	}
	
	public String leapBuilding() {
		return "Superman puede saltar encima de edificios";
	}
	
	public String stopBullet() {
		return "Superman puede detener balas";
	}

	

}
