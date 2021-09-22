package edu.unbosque.view.panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class PanelInstrucciones extends JPanel {

	private JLabel e_titulo, e_como, e_numran, e_ej;
	private JTextArea c_como, c_num, c_ej;
	private JButton b_play, b_menu;

	
	public PanelInstrucciones() {
		setLayout(null);
		inicializarComponentes();
	}

	
	private void inicializarComponentes() {

		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

		b_menu = new JButton("Volver");
		b_menu.setBounds(5, 10, 95, 30);
		b_menu.setBackground(Color.lightGray);
		b_menu.setActionCommand("VOLVER");
		add(b_menu);

		e_titulo = new JLabel("INSTRUCCIONES");
		e_titulo.setFont(new Font("Algerian", 20, 30));
		e_titulo.setForeground(Color.white);
		e_titulo.setBounds(260, 40, 300, 45);
		add(e_titulo);

		e_como = new JLabel("�C�mo se juega?");
		e_como.setFont(new Font(getName(), getFont().BOLD, 14));
		e_como.setForeground(Color.white);
		e_como.setBounds(230, 85, 130, 20);
		add(e_como);

		c_como = new JTextArea("SIMONjar es un juego interactivo, basado en secuencias num�ricas establecidas por el juego con el fin de que el jugador repita esta secuenc�a en el �rden correcto.");
		c_como.setBackground(new Color(222, 222, 222));
		c_como.setFont(new Font(getName(), 12, 12));
		c_como.setLineWrap(true);
		c_como.setWrapStyleWord(true);
		c_como.setBounds(230, 115, 300, 70);
		c_como.setEditable(false);
		add(c_como);

		e_numran = new JLabel("Numero aleatorio");
		e_numran.setFont(new Font(getName(), getFont().BOLD, 14));
		e_numran.setBounds(230, 190, 130, 20);
		e_numran.setForeground(Color.white);
		add(e_numran);

		c_num = new JTextArea("El n�mero aleatorio (de 1 a 4 ) es creado para formar un v�nculo entre el jugador y el juego, este n�mero o patr�n interactua con la mente de manera indiscreta buscando la equivocaci�n por parte del jugador.");
		c_num.setBackground(new Color(222, 222, 222));
		c_num.setFont(new Font(getName(), 12, 12));
		c_num.setLineWrap(true);
		c_num.setWrapStyleWord(true);
		c_num.setBounds(230, 210, 300, 65);
		c_num.setEditable(false);
		add(c_num);

		e_ej = new JLabel("Ejemplo");
		e_ej.setFont(new Font(getName(), getFont().BOLD, 14));
		e_ej.setForeground(Color.white);
		e_ej.setBounds(194, 277, 130, 20);
		add(e_ej);

		c_ej = new JTextArea("El juego impone un n�mero aleatorio: [4,1,2,2].\nEl jugador deber� repetir esta secuenc�a en el mismo �rden num�rico\nsi quiere obtener un resultado correcto, de lo contrario obtendr� un resultado incorrecto.\nNOTA: La interacci�n se genera por medio de botones correspondientes al n�mero que se quiera repetir.");
		c_ej.setBackground(new Color(222, 222, 222));
		c_ej.setFont(new Font(getName(), 12, 12));
		c_ej.setLineWrap(true);
		c_ej.setWrapStyleWord(true);
		c_ej.setBounds(193, 304, 394, 94);
		c_ej.setEditable(false);
		add(c_ej);

		b_play = new JButton("�JUGAR AHORA!");
		b_play.setActionCommand("PLAY");
		b_play.setBackground(Color.lightGray);
		b_play.setBounds(600, 10, 155, 30);
		add(b_play);
	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JLabel getE_como() {
		return e_como;
	}

	public void setE_como(JLabel e_como) {
		this.e_como = e_como;
	}

	public JLabel getE_numran() {
		return e_numran;
	}

	public void setE_numran(JLabel e_numran) {
		this.e_numran = e_numran;
	}

	public JLabel getE_ej() {
		return e_ej;
	}

	public void setE_ej(JLabel e_ej) {
		this.e_ej = e_ej;
	}

	public JTextArea getC_como() {
		return c_como;
	}

	public void setC_como(JTextArea c_como) {
		this.c_como = c_como;
	}

	public JTextArea getC_num() {
		return c_num;
	}

	public void setC_num(JTextArea c_num) {
		this.c_num = c_num;
	}

	public JTextArea getC_ej() {
		return c_ej;
	}

	public void setC_ej(JTextArea c_ej) {
		this.c_ej = c_ej;
	}

	public JButton getB_play() {
		return b_play;
	}

	public void setB_play(JButton b_play) {
		this.b_play = b_play;
	}

	public JButton getB_menu() {
		return b_menu;
	}

	public void setB_menu(JButton b_menu) {
		this.b_menu = b_menu;
	}

}
