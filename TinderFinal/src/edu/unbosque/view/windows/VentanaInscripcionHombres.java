package edu.unbosque.view.windows;

import edu.unbosque.view.panels.PanelHombres;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaInscripcionHombres extends JFrame {

	private PanelHombres phombres;

	public VentanaInscripcionHombres() {

		setTitle("Inscripción Hombres");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);

		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}

	private void inicializarComponentes() {
		phombres = new PanelHombres();
		phombres.setBounds(5, 5, 473, 350);
		phombres.setOpaque(false);
		getContentPane().add(phombres);
	}

	public void mostrarMensaje(String mensaje) {

		JOptionPane.showMessageDialog(null, mensaje);
	}

	public PanelHombres getPhombres() {
		return phombres;
	}

	public void setPhombres(PanelHombres phombres) {
		this.phombres = phombres;
	}

}
