package edu.unbosque.view.windows.admin;

import edu.unbosque.view.panels.admin.PanelAdminPrincipal;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaAdminPrincipal extends JFrame {

	private PanelAdminPrincipal adminprincipal;

	public VentanaAdminPrincipal() {

		setTitle("¡ADMINISTRADOR!");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.darkGray);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}

	public void inicializarComponentes() {

		adminprincipal = new PanelAdminPrincipal();
		adminprincipal.setBounds(5, 5, 475, 350);
		adminprincipal.setOpaque(false);
		getContentPane().add(adminprincipal);

	}

	public PanelAdminPrincipal getAdminprincipal() {
		return adminprincipal;
	}

	public void setAdminprincipal(PanelAdminPrincipal adminprincipal) {
		this.adminprincipal = adminprincipal;
	}

}