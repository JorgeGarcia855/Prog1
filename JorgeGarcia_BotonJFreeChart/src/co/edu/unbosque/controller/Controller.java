package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Chart;
import co.edu.unbosque.view.PanelPrincipal;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private Chart c;
	private VentanaPrincipal gui;
	
	public Controller() {
		c = new Chart();
		gui = new VentanaPrincipal(this);
		gui.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gui.getPanelEntrada();
		if (e.getActionCommand().equals(PanelPrincipal.CHART)) {
			c.chart();
		}
	}
}
