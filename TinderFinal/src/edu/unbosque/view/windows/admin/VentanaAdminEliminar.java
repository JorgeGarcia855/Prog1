package edu.unbosque.view.windows.admin;

import edu.unbosque.view.panels.admin.PanelAdminEliminar;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaAdminEliminar extends JFrame {

	private PanelAdminEliminar eliminar;

	public VentanaAdminEliminar() {

		setTitle("¡ADMINISTRADOR!");
		setSize(700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {

		eliminar = new PanelAdminEliminar();
		eliminar.setBounds(5, 5, 675, 550);
		eliminar.setOpaque(false);
		getContentPane().add(eliminar);

	}

	public PanelAdminEliminar getEliminar() {
		return eliminar;
	}

	public void setEliminar(PanelAdminEliminar eliminar) {
		this.eliminar = eliminar;
	}

}
