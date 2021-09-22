package edu.unbosque.view.windows.admin;

import edu.unbosque.view.panels.admin.PanelInicioSesionAdmin;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaInicioSesionAdmin extends JFrame {

	private PanelInicioSesionAdmin panelInicioSesionadmin;

	public VentanaInicioSesionAdmin() {
		setTitle("ADMINISTRADOR");
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
		panelInicioSesionadmin = new PanelInicioSesionAdmin();
		panelInicioSesionadmin.setBounds(5, 5, 475, 350);
		panelInicioSesionadmin.setOpaque(false);
		getContentPane().add(panelInicioSesionadmin);
	}

	public void mostrarMensaje(String mensaje) {

		JOptionPane.showMessageDialog(null, mensaje);
	}

	public PanelInicioSesionAdmin getPanelInicioSesionadmin() {
		return panelInicioSesionadmin;
	}

	public void setPanelInicioSesionadmin(PanelInicioSesionAdmin panelInicioSesionadmin) {
		this.panelInicioSesionadmin = panelInicioSesionadmin;
	}

}