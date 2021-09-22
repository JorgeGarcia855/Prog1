package edu.unbosque.view.windows;

import edu.unbosque.view.panels.PanelInicioSesion;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaInicioSesion extends JFrame {

	private PanelInicioSesion panelInicioSesion;

	public VentanaInicioSesion() {
		setTitle("Inicio Sesión");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}

	public void inicializarComponentes() {
		panelInicioSesion = new PanelInicioSesion();
		panelInicioSesion.setBounds(5, 5, 475, 350);
		panelInicioSesion.setOpaque(false);
		getContentPane().add(panelInicioSesion);
	}

	public void mostrarMensaje(String mensaje) {

		JOptionPane.showMessageDialog(null, mensaje);
	}

	public PanelInicioSesion getPanelInicioSesion() {
		return panelInicioSesion;
	}

	public void setPanelInicioSesion(PanelInicioSesion panelInicioSesion) {
		this.panelInicioSesion = panelInicioSesion;
	}

}