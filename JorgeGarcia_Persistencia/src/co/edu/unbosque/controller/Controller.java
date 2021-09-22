package co.edu.unbosque.controller;

import co.edu.unbosque.view.View;
import co.edu.unbosque.model.EjercicioArchivo;

public class Controller {
	
	private EjercicioArchivo m;
	private View gui;
	
	public Controller() {
		gui = new View();
		m = new EjercicioArchivo();
		funcionar();
	}
	
	public void funcionar() {
		gui.mostrarResultados(m.gestionarArchivoCadena());
	}
}
