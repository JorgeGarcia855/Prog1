package co.edu.unbosque.controller;

import co.edu.unbosque.model.Gestionar;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Gestionar m;
	private View gui;
	
	public Controller() {
		m = new Gestionar();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		gui.mostrarResultados(m.mostrarArchivo());
		m.gestionarArchivoCadena();
		gui.mostrarResultados(m.gestionarPropiedades());
	}
}
