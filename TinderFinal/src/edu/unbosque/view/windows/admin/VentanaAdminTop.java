package edu.unbosque.view.windows.admin;

import edu.unbosque.view.panels.admin.PanelAdminTop;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class VentanaAdminTop extends JFrame {

	private PanelAdminTop padmintop;

	public VentanaAdminTop() {

		setTitle("Top 10");
		setSize(750, 410);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);

	}

	public void inicializarComponentes() {

		padmintop = new PanelAdminTop();
		padmintop.setBounds(5, 5, 725, 360);
		add(padmintop, BorderLayout.NORTH);

	}

	public PanelAdminTop getPadmintop() {
		return padmintop;
	}

	public void setPadmintop(PanelAdminTop padmintop) {
		this.padmintop = padmintop;
	}

}