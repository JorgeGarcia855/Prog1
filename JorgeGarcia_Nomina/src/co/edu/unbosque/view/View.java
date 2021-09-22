package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.EmpleadoDAO;
import co.edu.unbosque.model.persistence.EmpleadoDTO;
import co.edu.unbosque.model.persistence.Nomina;
import co.edu.unbosque.model.persistence.Registro;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada;
	private PanelResultados panelResultados;
	private PanelRegistro panelRegistro;
	private PanelNomina panelNomina;
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
		panelResultados = new PanelResultados();
		//add(panelResultados);
		panelRegistro = new PanelRegistro();
		add(panelRegistro);
		panelNomina = new PanelNomina();
		add(panelNomina);
		panelEmpleado = new PanelEmpleado();
		add(panelEmpleado);
		
		panelEntrada.getButEscribir().addActionListener(control);
		panelEntrada.getButLeer().addActionListener(control);
		panelEntrada.getButLeerReg().addActionListener(control);
		panelEntrada.getButEscribirReg().addActionListener(control);
		panelEntrada.getInNomina().addActionListener(control);
		panelEntrada.getOutNomina().addActionListener(control);
		panelEntrada.getInEmpleado().addActionListener(control);
		panelEntrada.getOutEmpleado().addActionListener(control);
	}
	
	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarCifras(int numReg, int numeros[], double valores[]) {
		for (int i= 0 ; i<numReg ; i++) {
			getPanelResultados().getTxtMonto().append(String.valueOf(numeros[i])+"\n");
			getPanelResultados().getTxtValores().append(String.valueOf(valores[i])+"\n");
		}	
	}	

	public void mostrarRegistros(int numReg, Registro[] datos) {
		for (int i= 0 ; i<numReg ; i++) {
			getPanelRegistro().getTxtEdad().append(String.valueOf(datos[i].getEdad())+"\n");
			getPanelRegistro().getTxtNombre().append(String.valueOf(datos[i].getNombre())+"\n");
			getPanelRegistro().getTxtSalario().append(String.valueOf(datos[i].getSalario())+"\n");
			getPanelRegistro().getTxtCedula().append(String.valueOf(datos[i].getCedula())+"\n");
		}	
	}
	
	public void mostrarNomina(int numNom, Nomina[] datos) {
		for (int i = 0; i < numNom; i++) {
			getPanelNomina().getTxtCedula().append(String.valueOf(datos[i].getCedula()+"\n"));
			getPanelNomina().getTxtHTrabajadas().append(String.valueOf(datos[i].getHorasTrabajadas()+"\n"));
			getPanelNomina().getTxtMes().append(String.valueOf(datos[i].getMes()+"\n"));
		}
	}
	

	public PanelNomina getPanelNomina() {
		return panelNomina;
	}

	public void setPanelNomina(PanelNomina panelNomina) {
		this.panelNomina = panelNomina;
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelRegistro getPanelRegistro() {
		return panelRegistro;
	}

	public void setPanelRegistro(PanelRegistro panelRegistro) {
		this.panelRegistro = panelRegistro;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}

	public PanelEmpleado getPanelEmpleado() {
		return panelEmpleado;
	}

	public void setPanelEmpleado(PanelEmpleado panelEmpleado) {
		this.panelEmpleado = panelEmpleado;
	}
	
}
