package edu.unbosque.view.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelMujeres extends JPanel {

	private ImageIcon im;
	private JTextField jcorreo, jnombrecompleto, jalias, jestatura, jdivorcios, japellido1, japellido2;
	private JLabel jldisponible, jlcorreo, jlnombrecompleto, jlalias, jlestatura, jldivorcios, jlingreso, h_titulo,
			jlapellido1, jlapellido2;
	private JRadioButton br_Disponible;
	private JButton b_verificar,b_volverfecha;

	public PanelMujeres() {

		inicializarComponentes();
		setLayout(null);

	}

	public ImageIcon getIm() {
		return im;
	}

	public void setIm(ImageIcon im) {
		this.im = im;
	}

	public void inicializarComponentes() {
		setBorder(new LineBorder(Color.pink));

		h_titulo = new JLabel("Inscripción Mujeres");
		h_titulo.setFont(new Font("Algerian", 60, 30));
		h_titulo.setBounds(85, 15, 320, 45);
		add(h_titulo);

		jlcorreo = new JLabel("Correo electrónico: ");
		jlcorreo.setFont(new Font("Calibri", 30, 15));
		jlcorreo.setBounds(30, 100, 125, 20);
		add(jlcorreo);

		jcorreo = new JTextField();
		jcorreo.setBounds(160, 100, 100, 20);
		jcorreo.setBorder(new LineBorder(null));
		jcorreo.setEditable(true);
		add(jcorreo);

		jlnombrecompleto = new JLabel("Primer nombre : ");
		jlnombrecompleto.setFont(new Font("Calibri", 30, 15));
		jlnombrecompleto.setBounds(30, 140, 110, 20);
		add(jlnombrecompleto);

		jnombrecompleto = new JTextField();
		jnombrecompleto.setBounds(160, 140, 100, 20);
		jnombrecompleto.setBorder(new LineBorder(null));
		jnombrecompleto.setEditable(true);
		add(jnombrecompleto);

		jlapellido1 = new JLabel("Primer apellido : ");
		jlapellido1.setFont(new Font("Calibri", 30, 15));
		jlapellido1.setBounds(30, 180, 200, 20);
		add(jlapellido1);

		japellido1 = new JTextField();
		japellido1.setBounds(160, 180, 100, 20);
		japellido1.setBorder(new LineBorder(null));
		japellido1.setEditable(true);
		add(japellido1);

		jlapellido2 = new JLabel("Segundo apellido : ");
		jlapellido2.setFont(new Font("Calibri", 30, 15));
		jlapellido2.setBounds(30, 220, 200, 20);
		add(jlapellido2);

		japellido2 = new JTextField();
		japellido2.setBounds(160, 220, 100, 20);
		japellido2.setBorder(new LineBorder(null));
		japellido2.setEditable(true);
		add(japellido2);

		jlalias = new JLabel("Alias : ");
		jlalias.setFont(new Font("Calibri", 30, 15));
		jlalias.setBounds(280, 100, 100, 20);
		add(jlalias);

		jalias = new JTextField();
		jalias.setBounds(345, 100, 100, 20);
		jalias.setBorder(new LineBorder(null));
		jalias.setEditable(true);
		add(jalias);

		jlestatura = new JLabel("Estatura : ");
		jlestatura.setFont(new Font("Calibri", 30, 15));
		jlestatura.setBounds(280, 180, 100, 20);
		add(jlestatura);

		jestatura = new JTextField();
		jestatura.setBounds(345, 180, 100, 20);
		jestatura.setBorder(new LineBorder(null));
		jestatura.setEditable(true);
		add(jestatura);

		jldivorcios = new JLabel("Divorcios : ");
		jlestatura.setFont(new Font("Calibri", 30, 15));
		jldivorcios.setBounds(280, 140, 100, 20);
		add(jldivorcios);

		jdivorcios = new JTextField();
		jdivorcios.setBounds(345, 140, 100, 20);
		jdivorcios.setBorder(new LineBorder(null));
		jdivorcios.setEditable(true);
		add(jdivorcios);

		jldisponible = new JLabel("Estado : ");
		jldisponible.setFont(new Font("Calibri", 30, 15));
		jldisponible.setBounds(280, 220, 100, 20);
		add(jldisponible);

		br_Disponible = new JRadioButton("Disponible");
		br_Disponible.setBounds(345, 220, 100, 20);
		br_Disponible.setActionCommand("DISPONIBLE");
		br_Disponible.setBackground(Color.white);
		add(br_Disponible);

		b_verificar = new JButton("Inscribirse");
		b_verificar.setBounds(200, 280, 105, 40);
		b_verificar.setActionCommand("VERIFICAR");
		b_verificar.setBackground(Color.lightGray);
		add(b_verificar);
		
		b_volverfecha = new JButton("Volver");
		b_volverfecha.setBounds(375, 310, 90, 30);
		b_volverfecha.setActionCommand("VOLVERFECHA");
		b_volverfecha.setBackground(Color.white);
		add(b_volverfecha);

	}

	public JTextField getJcorreo() {
		return jcorreo;
	}

	public void setJcorreo(JTextField jcorreo) {
		this.jcorreo = jcorreo;
	}

	public JTextField getJnombrecompleto() {
		return jnombrecompleto;
	}

	public void setJnombrecompleto(JTextField jnombrecompleto) {
		this.jnombrecompleto = jnombrecompleto;
	}

	public JTextField getJalias() {
		return jalias;
	}

	public void setJalias(JTextField jalias) {
		this.jalias = jalias;
	}

	public JTextField getJestatura() {
		return jestatura;
	}

	public void setJestatura(JTextField jestatura) {
		this.jestatura = jestatura;
	}

	public JTextField getJdivorcios() {
		return jdivorcios;
	}

	public void setJdivorcios(JTextField jdivorcios) {
		this.jdivorcios = jdivorcios;
	}

	public JLabel getJldisponible() {
		return jldisponible;
	}

	public void setJldisponible(JLabel jldisponible) {
		this.jldisponible = jldisponible;
	}

	public JLabel getJlcorreo() {
		return jlcorreo;
	}

	public void setJlcorreo(JLabel jlcorreo) {
		this.jlcorreo = jlcorreo;
	}

	public JLabel getJlnombrecompleto() {
		return jlnombrecompleto;
	}

	public void setJlnombrecompleto(JLabel jlnombrecompleto) {
		this.jlnombrecompleto = jlnombrecompleto;
	}

	public JLabel getJlalias() {
		return jlalias;
	}

	public void setJlalias(JLabel jlalias) {
		this.jlalias = jlalias;
	}

	public JLabel getJlestatura() {
		return jlestatura;
	}

	public void setJlestatura(JLabel jlestatura) {
		this.jlestatura = jlestatura;
	}

	public JLabel getJldivorcios() {
		return jldivorcios;
	}

	public void setJldivorcios(JLabel jldivorcios) {
		this.jldivorcios = jldivorcios;
	}

	public JLabel getJlingreso() {
		return jlingreso;
	}

	public void setJlingreso(JLabel jlingreso) {
		this.jlingreso = jlingreso;
	}

	public JLabel getH_titulo() {
		return h_titulo;
	}

	public void setH_titulo(JLabel h_titulo) {
		this.h_titulo = h_titulo;
	}

	public JRadioButton getBr_Disponible() {
		return br_Disponible;
	}

	public void setBr_Disponible(JRadioButton br_Disponible) {
		this.br_Disponible = br_Disponible;
	}

	public JButton getB_verificar() {
		return b_verificar;
	}

	public void setB_verificar(JButton b_verificar) {
		this.b_verificar = b_verificar;
	}

	public JTextField getJapellido1() {
		return japellido1;
	}

	public void setJapellido1(JTextField japellido1) {
		this.japellido1 = japellido1;
	}

	public JTextField getJapellido2() {
		return japellido2;
	}

	public void setJapellido2(JTextField japellido2) {
		this.japellido2 = japellido2;
	}

	public JLabel getJlapellido1() {
		return jlapellido1;
	}

	public void setJlapellido1(JLabel jlapellido1) {
		this.jlapellido1 = jlapellido1;
	}

	public JLabel getJlapellido2() {
		return jlapellido2;
	}

	public void setJlapellido2(JLabel jlapellido2) {
		this.jlapellido2 = jlapellido2;
	}

	public JButton getB_volverfecha() {
		return b_volverfecha;
	}

	public void setB_volverfecha(JButton b_volverfecha) {
		this.b_volverfecha = b_volverfecha;
	}
	
	

}