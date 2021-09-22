package co.edu.unbosque.controller;


import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.View;

public class Controller {
	
	private CynusX1 cy;
	private View gui;
	
	public Controller() {
		cy = new CynusX1();
		gui = new View();
		generarHabitantes();
	}
	
	public void generarHabitantes() {
		String texto1 = cy.getH1().volar()+"\n"+cy.getH1().crearFuego()+"\n"+cy.getH1().detenerTiempo()+"\n"+cy.getH1().estatura()+"\n\n";
		String texto2 = cy.getH2().volar()+"\n"+cy.getH2().crearFuego()+"\n"+cy.getH2().detenerTiempo()+"\n"+cy.getH2().estatura()+"\n\n";
		String texto3 = cy.getM().conocimientos()+"\n"+cy.getM().familia()+"\n"+cy.getM().profesión()+'\n'+cy.getM().colorOjos()+"\n\n";
		String texto4 = cy.getD().arrastrar()+"\n"+cy.getD().alma()+"\n"+cy.getD().duracionVida();
		gui.mostrarResultados(texto1+texto2+texto3+texto4);
	}
}
