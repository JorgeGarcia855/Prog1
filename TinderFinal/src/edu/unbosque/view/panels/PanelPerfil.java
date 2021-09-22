package edu.unbosque.view.panels;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;


public class PanelPerfil extends JPanel {

	private JTextArea jmostrarperfil, jperfil;
	private JLabel jltitulo, jltitulo1;
	private JScrollPane lista;
	private JComboBox<String> jcescoger; 
	private JButton b_megusta,b_cerrarsesion,b_siguiente;

	public PanelPerfil() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		
		jltitulo = new JLabel("BOSTINDER");
		jltitulo.setForeground(Color.white);
		jltitulo.setFont(new Font("Algerian", 20, 40));
		jltitulo.setBounds(100, 0, 264, 45);
		add(jltitulo);
		
		jmostrarperfil= new JTextArea("¡Bienvenido a Bostinder! \n\nPara comenzar tu experiencia por favor\nPresiona el boton siguiente usuario. ");
		jmostrarperfil.setBounds(10, 60, 400, 200);
		jmostrarperfil.setBorder(new LineBorder(null));
		jmostrarperfil.setFont(jmostrarperfil.getFont().deriveFont(5f));
		jmostrarperfil.setFont(new Font("Times new roman", 20, 20));
		jmostrarperfil.setEditable(false);
		add(jmostrarperfil);
		
		
		jperfil= new JTextArea("¡HOLA!\nUsuario nuevo");
		jperfil.setBounds(423, 60, 130, 70);
		jperfil.setBorder(new LineBorder(null));
		jperfil.setEditable(false);
		add(jperfil);
		
		lista = new JScrollPane(jperfil);
		lista.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		lista.setBounds(423,60, 140, 80);
		add(lista);
		
		
		jltitulo1 = new JLabel("Elige tus preferencias:");
		jltitulo1.setForeground(Color.white);
		//jltitulo1.setFont(new Font("Algerian", 20, 40));
		jltitulo1.setBounds(423,130 , 264, 45);
		add(jltitulo1);
		
		jcescoger = new JComboBox<String>();
		jcescoger.setActionCommand("ESCOGER");
		jcescoger.setBounds(423, 174, 140, 30);
		jcescoger.setBorder(new LineBorder(null));
		jcescoger.addItem("Hombres");
		jcescoger.addItem("Mujeres");
		jcescoger.addItem("Los dos");
		jcescoger.setEditable(false);
		add(jcescoger);
		
		b_megusta = new JButton("HOLA BB <3");
		b_megusta.setBounds(210,280, 120, 30);
		b_megusta.setActionCommand("MEGUSTA");
		add(b_megusta);
		
		b_cerrarsesion = new JButton("Cerrar sesion");
		b_cerrarsesion.setBounds(443, 0, 120, 30);
		b_cerrarsesion.setActionCommand("CERRAR");
		add(b_cerrarsesion);
		
		b_siguiente= new JButton("Siguente usuario");
		b_siguiente.setBounds(60, 280, 140, 30);
		b_siguiente.setActionCommand("SIGUIENTE");
		add(b_siguiente);

	}

	public JTextArea getJmostrarperfil() {
		return jmostrarperfil;
	}

	public void setJmostrarperfil(JTextArea jmostrarperfil) {
		this.jmostrarperfil = jmostrarperfil;
	}

	public JLabel getJlaias() {
		return jltitulo;
	}

	public void setJlaias(JLabel jlaias) {
		this.jltitulo = jlaias;
	}

	public JComboBox<String> getJcescoger() {
		return jcescoger;
	}

	public void setJcescoger(JComboBox<String> jcescoger) {
		this.jcescoger = jcescoger;
	}

	public JButton getB_megusta() {
		return b_megusta;
	}

	public void setB_megusta(JButton b_megusta) {
		this.b_megusta = b_megusta;
	}

	public JButton getB_cerrarsesion() {
		return b_cerrarsesion;
	}

	public void setB_cerrarsesion(JButton b_cerrarsesion) {
		this.b_cerrarsesion = b_cerrarsesion;
	}

	public JButton getB_siguiente() {
		return b_siguiente;
	}

	public void setB_siguiente(JButton b_siguiente) {
		this.b_siguiente = b_siguiente;
	}

	public JTextArea getJperfil() {
		return jperfil;
	}

	public void setJperfil(JTextArea jperfil) {
		this.jperfil = jperfil;
	}
	
	

}
