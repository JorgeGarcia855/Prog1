package edu.unbosque.view.panels.admin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelInicioSesionAdmin extends JPanel {

	private JLabel e_titulo, e_alias, e_contraseña;
	private JButton b_entrar,b_volverinicio;
	private JTextField jf_alias, jf_contraseña;

	public PanelInicioSesionAdmin() {
		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

		e_titulo = new JLabel("ADMINISTRADOR");
		e_titulo.setForeground(Color.black);
		e_titulo.setFont(new Font("Agency FB", 40, 45));
		e_titulo.setBounds(130, 40, 264, 45);
		add(e_titulo);

		e_alias = new JLabel("Ingresa el alias de administrador");
		e_alias.setForeground(Color.black);
		e_alias.setFont(new Font("Times new roman", 15, 15));
		e_alias.setBounds(130, 100, 264, 45);
		add(e_alias);

		jf_alias = new JTextField();
		jf_alias.setBounds(130, 140, 220, 35);
		jf_alias.setBorder(new LineBorder(null));
		jf_alias.setEditable(true);
		jf_alias.setFont(jf_alias.getFont().deriveFont(20f));
		add(jf_alias);

		e_contraseña = new JLabel("Ingresa la contraseña de administrador");
		e_contraseña.setForeground(Color.black);
		e_contraseña.setFont(new Font("Times new roman", 15, 15));
		e_contraseña.setBounds(130, 180, 264, 35);
		add(e_contraseña);

		jf_contraseña = new JTextField();
		jf_contraseña.setBounds(130, 215, 220, 35);
		jf_contraseña.setBorder(new LineBorder(null));
		jf_contraseña.setEditable(true);
		jf_contraseña.setFont(jf_contraseña.getFont().deriveFont(20f));
		add(jf_contraseña);

		b_entrar = new JButton("Entrar");
		b_entrar.setBackground(Color.white);
		b_entrar.setActionCommand("ENTRARADMIN");
		b_entrar.setBounds(195, 270, 90, 40);
		add(b_entrar);
		
		b_volverinicio = new JButton("Volver");
		b_volverinicio.setBackground(Color.white);
		b_volverinicio.setActionCommand("VOLVERINICIO");
		b_volverinicio.setBounds(380, 10, 80, 30);
		add(b_volverinicio);
	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JLabel getE_alias() {
		return e_alias;
	}

	public void setE_alias(JLabel e_alias) {
		this.e_alias = e_alias;
	}

	public JLabel getE_contraseña() {
		return e_contraseña;
	}

	public void setE_contraseña(JLabel e_contraseña) {
		this.e_contraseña = e_contraseña;
	}

	public JTextField getJf_alias() {
		return jf_alias;
	}

	public void setJf_alias(JTextField jf_alias) {
		this.jf_alias = jf_alias;
	}

	public JTextField getJf_contraseña() {
		return jf_contraseña;
	}

	public void setJf_contraseña(JTextField jf_contraseña) {
		this.jf_contraseña = jf_contraseña;
	}

	public JButton getB_entrar() {
		return b_entrar;
	}

	public void setB_entrar(JButton b_entrar) {
		this.b_entrar = b_entrar;
	}

	public JButton getB_volverinicio() {
		return b_volverinicio;
	}

	public void setB_volverinicio(JButton b_volverinicio) {
		this.b_volverinicio = b_volverinicio;
	}
	

}
