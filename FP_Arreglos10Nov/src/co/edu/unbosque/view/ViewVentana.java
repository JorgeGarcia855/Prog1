package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class ViewVentana {
	
	public ViewVentana() {
		
	}
	
	public void mostrarInfo(String mensaje, String tipo) {
		if(tipo.equals("informativo")) {
			JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
		}else if(tipo.equals("error")) {
			JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public String leerDato(String mensaje) {
		String dato = JOptionPane.showInputDialog(null,mensaje,"Agenda de Contactos",JOptionPane.QUESTION_MESSAGE);
		return dato;
	}
}
