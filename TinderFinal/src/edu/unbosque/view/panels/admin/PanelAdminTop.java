package edu.unbosque.view.panels.admin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class PanelAdminTop extends JPanel {

	private JTextArea jusuario;
	private JLabel e_titulo, e_usuario, e_contraseña;
	private JButton b_volver;
	private JComboBox<String> jcfiltro;
	private JScrollPane jsp;

	public PanelAdminTop() {

		setLayout(null);

		inicializarComponentes();
	}

	public void inicializarComponentes() {

		e_titulo = new JLabel("Top 10 Usuarios");
		e_titulo.setForeground(Color.black);
		e_titulo.setFont(new Font("Algerian", 20, 40));
		e_titulo.setBounds(175, 10, 500, 45);
		add(e_titulo);

		jusuario = new JTextArea("");
		jusuario.setBounds(5, 60, 700, 250);
		jusuario.setBorder(new LineBorder(null));
		jusuario.setEditable(false);
		add(jusuario);
		
		jsp = new JScrollPane(jusuario);
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(5,60, 700, 250);
		add(jsp);

		b_volver = new JButton("Volver panel admin");
		b_volver.setBounds(305, 315, 155, 30);
		b_volver.setActionCommand("VADMIN");
		add(b_volver);

	}

	public JButton getB_volver() {
		return b_volver;
	}

	public void setB_volver(JButton b_volver) {
		this.b_volver = b_volver;
	}

	public JTextArea getJusuario() {
		return jusuario;
	}

	public void setJusuario(JTextArea jusuario) {
		this.jusuario = jusuario;
	}

}