package co.edu.unbosque.model;

public class ColorOjosInvalidoException extends Exception {
	
	public ColorOjosInvalidoException() {
		super("El color de los ojos del habitante es invalida para el tipo de descendiente de KublaKan");
	}
	
	public ColorOjosInvalidoException(String mensaje) {
		super(mensaje);
	}
}
