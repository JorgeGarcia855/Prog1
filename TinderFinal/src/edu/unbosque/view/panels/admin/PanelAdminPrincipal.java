package edu.unbosque.view.panels.admin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelAdminPrincipal extends JPanel {

	private JLabel e_titulo;
	private JButton b_estadisticas, b_eliminar, b_top, b_volverprincipal;

	public PanelAdminPrincipal() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

		e_titulo = new JLabel("Administrador");
		e_titulo.setForeground(Color.white);
		e_titulo.setFont(new Font("Algerian", 20, 40));
		e_titulo.setBounds(87, 30, 400, 45);
		add(e_titulo);

		b_estadisticas = new JButton("Generar informe");
		b_estadisticas.setActionCommand("ESTADISTICAS");
		b_estadisticas.setBounds(155, 110, 155, 30);
		b_estadisticas.setBackground(Color.white);
		add(b_estadisticas);

		b_eliminar = new JButton("Gestionar usuarios");
		b_eliminar.setActionCommand("ELIMINAR");
		b_eliminar.setBounds(155, 170, 155, 30);
		b_eliminar.setBackground(Color.white);
		add(b_eliminar);

		b_top = new JButton("Mirar top 10");
		b_top.setActionCommand("TOP");
		b_top.setBounds(155, 230, 155, 30);
		b_top.setBackground(Color.white);
		add(b_top);

		b_volverprincipal = new JButton("Volver");
		b_volverprincipal.setActionCommand("VOLVERPRINCIPAL");
		b_volverprincipal.setBounds(360, 300, 90, 35);
		b_volverprincipal.setBackground(Color.white);
		add(b_volverprincipal);

	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JButton getB_estadisticas() {
		return b_estadisticas;
	}

	public void setB_estadisticas(JButton b_estadisticas) {
		this.b_estadisticas = b_estadisticas;
	}

	public JButton getB_eliminar() {
		return b_eliminar;
	}

	public void setB_eliminar(JButton b_eliminar) {
		this.b_eliminar = b_eliminar;
	}

	public JButton getB_top() {
		return b_top;
	}

	public void setB_top(JButton b_top) {
		this.b_top = b_top;
	}

	public JButton getB_volverprincipal() {
		return b_volverprincipal;
	}

	public void setB_volverprincipal(JButton b_volverprincipal) {
		this.b_volverprincipal = b_volverprincipal;
	}

}