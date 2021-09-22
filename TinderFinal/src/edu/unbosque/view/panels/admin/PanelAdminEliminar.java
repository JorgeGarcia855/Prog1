package edu.unbosque.view.panels.admin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class PanelAdminEliminar extends JPanel {

	private JLabel f_asc, f_des, f_gen;
	private JButton b_buscar, b_generar, b_volveradmina, bFiltAsc, bFiltDes, bFiltGen, bMostIngr, b_crood;
	private JTextArea jperfil;
	private JComboBox<String> jfiltroAsc, jfiltroDes, jfiltroGen;
	private JScrollPane jsp;

	public PanelAdminEliminar() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

		b_buscar = new JButton("Buscar");
		b_buscar.setActionCommand("BUSCAR");
		b_buscar.setBounds(270, 25, 100, 30);
		b_buscar.setBackground(Color.lightGray);
		add(b_buscar);

		b_generar = new JButton("Generar");
		b_generar.setActionCommand("GENERAR");
		b_generar.setBounds(100, 513, 155, 30);
		b_generar.setBackground(Color.lightGray);
		add(b_generar);

		jperfil = new JTextArea("");
		jperfil.setBounds(15, 100, 500, 400);
		jperfil.setBorder(new LineBorder(null));
		jperfil.setEditable(false);
		add(jperfil);

		jsp = new JScrollPane(jperfil);
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(15, 100, 500, 400);
		add(jsp);

		b_volveradmina = new JButton("Volver panel admin");
		b_volveradmina.setActionCommand("VADMIN");
		b_volveradmina.setBounds(320, 513, 155, 30);
		b_volveradmina.setBackground(Color.lightGray);
		add(b_volveradmina);

		f_asc = new JLabel("Mostrar Menor a Mayor");
		f_asc.setForeground(Color.BLACK);
		f_asc.setBounds(535, 85, 150, 45);
		add(f_asc);

		jfiltroAsc = new JComboBox<String>();
		jfiltroAsc.setBounds(535, 120, 120, 20);
		jfiltroAsc.setBorder(new LineBorder(null));
		jfiltroAsc.addItem("Alias");
		jfiltroAsc.addItem("Nombre");
		jfiltroAsc.addItem("Apellido");
		jfiltroAsc.addItem("Edad");
		jfiltroAsc.addItem("Likes");
		jfiltroAsc.setEditable(false);
		add(jfiltroAsc);

		bFiltAsc = new JButton("Mostrar");
		bFiltAsc.setActionCommand("FILTRARASC");
		bFiltAsc.setBounds(535, 145, 80, 15);
		add(bFiltAsc);

		f_des = new JLabel("Mostrar Mayor a Menor");
		f_des.setForeground(Color.BLACK);
		f_des.setBounds(535, 175, 150, 45);
		add(f_des);

		jfiltroDes = new JComboBox<String>();
		jfiltroDes.setBounds(535, 210, 120, 20);
		jfiltroDes.setBorder(new LineBorder(null));
		jfiltroDes.addItem("Alias");
		jfiltroDes.addItem("Nombre");
		jfiltroDes.addItem("Apellido");
		jfiltroDes.addItem("Edad");
		jfiltroDes.addItem("Likes");
		jfiltroDes.setEditable(false);
		add(jfiltroDes);

		bFiltDes = new JButton("Mostrar");
		bFiltDes.setActionCommand("FILTRARDES");
		bFiltDes.setBounds(535, 235, 80, 15);
		add(bFiltDes);

		f_gen = new JLabel("Mostrar por Genero");
		f_gen.setForeground(Color.BLACK);
		f_gen.setBounds(535, 250, 150, 45);
		add(f_gen);

		jfiltroGen = new JComboBox<String>();
		jfiltroGen.setBounds(535, 285, 120, 20);
		jfiltroGen.setBorder(new LineBorder(null));
		jfiltroGen.addItem("Hombres");
		jfiltroGen.addItem("Mujeres");
		jfiltroGen.setEditable(false);
		add(jfiltroGen);

		bFiltGen = new JButton("Mostrar");
		bFiltGen.setActionCommand("FILTRARGEN");
		bFiltGen.setBounds(535, 310, 80, 15);
		add(bFiltGen);

		bMostIngr = new JButton("Mostrar Ingresos >= 244.85");
		bMostIngr.setActionCommand("FILTRARING");
		bMostIngr.setBounds(400, 25, 210, 30);
		add(bMostIngr);

		b_crood = new JButton("Modificar usuarios");
		b_crood.setActionCommand("MODUSUARIOS");
		b_crood.setBounds(70, 25, 150, 30);
		b_crood.setBackground(Color.lightGray);
		add(b_crood);
	}

	public JButton getB_buscar() {
		return b_buscar;
	}

	public void setB_buscar(JButton b_buscar) {
		this.b_buscar = b_buscar;
	}

	public JButton getB_generar() {
		return b_generar;
	}

	public void setB_generar(JButton b_generar) {
		this.b_generar = b_generar;
	}

	public JTextArea getJperfil() {
		return jperfil;
	}

	public void setJperfil(JTextArea jperfil) {
		this.jperfil = jperfil;
	}

	public JButton getB_volveradmina() {
		return b_volveradmina;
	}

	public void setB_volveradmina(JButton b_volveradmina) {
		this.b_volveradmina = b_volveradmina;
	}

	public JComboBox<String> getJfiltroAsc() {
		return jfiltroAsc;
	}

	public void setJfiltroAsc(JComboBox<String> jfiltroAsc) {
		this.jfiltroAsc = jfiltroAsc;
	}

	public JComboBox<String> getJfiltroDes() {
		return jfiltroDes;
	}

	public void setJfiltroDes(JComboBox<String> jfiltroDes) {
		this.jfiltroDes = jfiltroDes;
	}

	public JButton getbFiltAsc() {
		return bFiltAsc;
	}

	public void setbFiltAsc(JButton bFiltAsc) {
		this.bFiltAsc = bFiltAsc;
	}

	public JButton getbFiltDes() {
		return bFiltDes;
	}

	public void setbFiltDes(JButton bFiltDes) {
		this.bFiltDes = bFiltDes;
	}

	public JComboBox<String> getJfiltroGen() {
		return jfiltroGen;
	}

	public void setJfiltroGen(JComboBox<String> jfiltroGen) {
		this.jfiltroGen = jfiltroGen;
	}

	public JButton getbFiltGen() {
		return bFiltGen;
	}

	public void setbFiltGen(JButton bFiltGen) {
		this.bFiltGen = bFiltGen;
	}

	public JButton getbMostIngr() {
		return bMostIngr;
	}

	public void setbMostIngr(JButton bMostIngr) {
		this.bMostIngr = bMostIngr;
	}

	public JButton getB_crood() {
		return b_crood;
	}

	public void setB_crood(JButton b_crood) {
		this.b_crood = b_crood;
	}

}
