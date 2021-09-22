package edu.unbosque.view.windows;

import edu.unbosque.view.panels.PanelMujeres;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaInscripcionMujer extends JFrame {

	private PanelMujeres pmujeres;

	public VentanaInscripcionMujer() {

		setTitle("Inscripción Mujeres");
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
		pmujeres = new PanelMujeres();
		pmujeres.setBounds(5, 5, 473, 350);
		pmujeres.setOpaque(false);
		getContentPane().add(pmujeres);
	}

	public void mostrarMensaje(String mensaje) {

		JOptionPane.showMessageDialog(null, mensaje);
	}

	public PanelMujeres getPmujeres() {
		return pmujeres;
	}

	public void setPmujeres(PanelMujeres pmujeres) {
		this.pmujeres = pmujeres;
	}

}
