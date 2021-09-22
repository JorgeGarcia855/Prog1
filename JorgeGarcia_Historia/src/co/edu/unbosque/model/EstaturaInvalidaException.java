package co.edu.unbosque.model;

public class EstaturaInvalidaException extends Exception {

	public EstaturaInvalidaException() {
		super("La estatura del habitante es invalida para el tipo de descendiente de KublaKan");
	}
	
	public EstaturaInvalidaException(String mensaje) {
		super(mensaje);
	}
}
