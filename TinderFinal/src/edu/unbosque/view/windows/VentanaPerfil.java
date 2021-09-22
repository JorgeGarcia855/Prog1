package edu.unbosque.view.windows;

import edu.unbosque.view.panels.PanelPerfil;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPerfil extends JFrame {

	private PanelPerfil pperfil;

	
	public VentanaPerfil() {
		
		setTitle("¡BIENVENIDO !");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);
		
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);	
	}
	
	private void inicializarComponentes() {
		
		pperfil = new PanelPerfil();
		pperfil.setBounds(10,10,765,540);
		pperfil.setOpaque(false);
		getContentPane().add(pperfil);
		


	}
	public void mostrarMensaje(String mensaje) {

		JOptionPane.showMessageDialog(null, mensaje);
	}

	public PanelPerfil getPperfil() {
		return pperfil;
	}

	public void setPperfil(PanelPerfil pperfil) {
		this.pperfil = pperfil;
	}

	




	
}
