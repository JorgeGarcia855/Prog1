package edu.unbosque.view.windows;

import edu.unbosque.view.panels.PanelOpciones;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class VentanaOpciones extends JFrame {

	private PanelOpciones popciones;
	
	

	public VentanaOpciones() {
		
		setTitle("BOSTINDER");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);

		inicializarComponentes();
	
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
		
	}

	public void inicializarComponentes() {
		
		popciones = new PanelOpciones();
		popciones.setBounds(5, 5, 473, 350);
		popciones.setOpaque(true);
		getContentPane().add(popciones);
			
	}

	public void mostrarMensaje(String mensaje) {
		
		JOptionPane.showMessageDialog(null,mensaje);
	}
	
	public PanelOpciones getPopciones() {
		return popciones;
	}

	public void setPopciones(PanelOpciones popciones) {
		this.popciones = popciones;
	}

	

}