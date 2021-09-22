package co.edu.unbosque.controller;

import co.edu.unbosque.model.Herencia;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Herencia m;
	private View gui;
	
	public Controller() {
		m = new Herencia();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		String texto3 = m.getM().revisionObjetos()+"\n"+m.getM().reparacionObjetos()+"\n\n";
		String texto4 = m.getT().verificarRecursos()+"\n"+m.getT().dispDisponibles()+"\n\n";
		String texto5 = m.getEj().adminEmpresa()+"\n"+m.getEj().dirigirEmpresa()+"\n\n";
		String texto6 = m.getC().redesComercio()+"\n"+m.getC().trading();
		gui.mostrarResultados(texto3+texto4+texto5+texto6);
	}

}
