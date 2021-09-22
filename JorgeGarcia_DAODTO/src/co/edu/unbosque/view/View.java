package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.Controller;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada;
	private PanelEmpleado panelEmpleado;
	
	public View(Controller control) {
		setSize(500,700);
		setResizable(false);
		setTitle("Archivos Binarios");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4,4));
		
		panelEntrada = new PanelEntrada();
		add(panelEntrada);
		panelEmpleado = new PanelEmpleado();
		add(panelEmpleado);
		
		panelEntrada.getInEmpleado().addActionListener(control);
		panelEntrada.getOutEmpleado().addActionListener(control);
	}
	
	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelEmpleado getPanelEmpleado() {
		return panelEmpleado;
	}

	public void setPanelEmpleado(PanelEmpleado panelEmpleado) {
		this.panelEmpleado = panelEmpleado;
	}
	
}
