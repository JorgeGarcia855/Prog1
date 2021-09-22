package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelEmpleado extends JPanel{

	private static final long serialVersionUID = 1L;
	private JTextArea txtId, txtNom, txtApellido, txtSalario;
	
	public PanelEmpleado() {
		setLayout(new GridLayout(1, 3));
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Empleado");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		txtId = new JTextArea("");
		txtNom = new JTextArea("");
		txtApellido = new JTextArea("");
		txtSalario = new JTextArea("");
		
		textoEmpleado(txtId);
		textoEmpleado(txtNom);
		textoEmpleado(txtApellido);
		textoEmpleado(txtSalario);
	}
	
	private void textoEmpleado(JTextArea textArea) {
		textArea.setEditable(false);
		add(textArea);
	}

	public JTextArea getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextArea txtId) {
		this.txtId = txtId;
	}

	public JTextArea getTxtNom() {
		return txtNom;
	}

	public void setTxtNom(JTextArea txtNom) {
		this.txtNom = txtNom;
	}

	public JTextArea getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextArea txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextArea getTxtSalario() {
		return txtSalario;
	}

	public void setTxtSalario(JTextArea txtSalario) {
		this.txtSalario = txtSalario;
	}

}
