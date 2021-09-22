package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelRegistro extends JPanel{

	private JTextArea txtNombre;
	private JTextArea txtEdad;
	private JTextArea txtSalario;
	private JTextArea txtCedula;
	
	private static final long serialVersionUID = 1L;
	
	public PanelRegistro() {
		setLayout( new GridLayout(1,4) );
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Registros");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		initAtributos();
		
		textArea(txtCedula);
		textArea(txtEdad);
		textArea(txtNombre);
		textArea(txtSalario);
	}
	
	private void textArea(JTextArea textArea ) {
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(Color.WHITE);
		add(textArea);
	}
	
	private void initAtributos() {
		txtCedula = new JTextArea("");
		txtEdad = new JTextArea("");
		txtNombre = new JTextArea("");
		txtSalario = new JTextArea("");
	}

	public JTextArea getTxtNombre() {
		return txtNombre;
	}

	public JTextArea getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextArea txtCedula) {
		this.txtCedula = txtCedula;
	}

	public void setTxtNombre(JTextArea txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextArea getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextArea txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JTextArea getTxtSalario() {
		return txtSalario;
	}

	public void setTxtSalario(JTextArea txtSalario) {
		this.txtSalario = txtSalario;
	}
	
}
