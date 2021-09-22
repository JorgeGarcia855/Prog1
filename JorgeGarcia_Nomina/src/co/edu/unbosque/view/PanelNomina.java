package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelNomina extends JPanel{
	
	private JTextArea txtCedula, txtHTrabajadas, txtMes;
	
	
	
	private static final long serialVersionUID = 1L;

	public PanelNomina() {
		setLayout(new GridLayout(1,3));
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Nomina");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		txtCedula = new JTextArea("");
		add(txtCedula);
		txtHTrabajadas = new JTextArea("");
		add(txtHTrabajadas);
		txtMes = new JTextArea("");
		add(txtMes);
		
	}

	public JTextArea getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextArea txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JTextArea getTxtHTrabajadas() {
		return txtHTrabajadas;
	}

	public void setTxtHTrabajadas(JTextArea txtHTrabajadas) {
		this.txtHTrabajadas = txtHTrabajadas;
	}

	public JTextArea getTxtMes() {
		return txtMes;
	}

	public void setTxtMes(JTextArea txtMes) {
		this.txtMes = txtMes;
	}

}
