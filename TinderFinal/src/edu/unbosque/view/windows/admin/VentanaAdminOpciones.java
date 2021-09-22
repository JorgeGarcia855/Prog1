package edu.unbosque.view.windows.admin;

import edu.unbosque.view.panels.admin.PanelAdminOpciones;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaAdminOpciones extends JFrame{

	private PanelAdminOpciones pOpcionesAdmin;
	
	
	public VentanaAdminOpciones() {
		
		setTitle("Opciones del Admin");
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
		
	}
	
	public void inicializarComponentes() {
		
		pOpcionesAdmin = new PanelAdminOpciones();
		pOpcionesAdmin.setBounds(5, 5, 975,450);
		getContentPane().add(pOpcionesAdmin);
		
	}

	public PanelAdminOpciones getpOpcionesAdmin() {
		return pOpcionesAdmin;
	}

	public void setpOpcionesAdmin(PanelAdminOpciones pOpcionesAdmin) {
		this.pOpcionesAdmin = pOpcionesAdmin;
	}

	

	

}