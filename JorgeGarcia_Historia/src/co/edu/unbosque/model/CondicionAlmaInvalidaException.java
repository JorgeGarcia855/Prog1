package co.edu.unbosque.model;

public class CondicionAlmaInvalidaException extends Exception {

	public CondicionAlmaInvalidaException() {
		super("El alma del habitante es invalida para el tipo de descendiente de KublaKan");	
	}
	
	public CondicionAlmaInvalidaException(String mensaje) {
		super(mensaje);
	}
	

}
