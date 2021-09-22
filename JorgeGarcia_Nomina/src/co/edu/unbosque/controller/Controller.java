package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.model.persistence.EmpleadoDAO;
import co.edu.unbosque.model.persistence.EmpleadoDTO;
import co.edu.unbosque.view.PanelEntrada;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private Binarios bd;
	private View gui;
	private EmpleadoDAO objEmp;
	private EmpleadoDTO empleado;
	
	public Controller() {
		objEmp = new EmpleadoDAO();
		empleado = new EmpleadoDTO();
		bd = new Binarios();
		gui = new View(this);
		gui.setVisible(true); 
		probarEmpleado();
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		gui.getPanelEntrada();
		String resultado;
		
		if (evento.getActionCommand().equals(PanelEntrada.ESCRIBIR)) {
			resultado = bd.getBf().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
		}
		
		if(evento.getActionCommand().equals(PanelEntrada.LEER)) {
			bd.getBf().leerArchivoBinario();
			gui.mostrarCifras(
					bd.getBf().getREGISTROS(), 
					bd.getBf().getNumeros(), 
					bd.getBf().getValores());
		}
		
		if(evento.getActionCommand().equals(PanelEntrada.ESCRIBIR_REG)) {
			gui.escribirMensaje(bd.getBf().escribirRegistro());
		}
		
		if(evento.getActionCommand().equals(PanelEntrada.LEER_REG)) {
			bd.getBf().leerRegistro();
			gui.mostrarRegistros(3, bd.getBf().getDatos());
		}
		
		if (evento.getActionCommand().equals(PanelEntrada.ESCRIBIR_N)) {
			gui.escribirMensaje(bd.getBf().escribirNomina());
		}
		
		if (evento.getActionCommand().equals(PanelEntrada.LEER_N)) {
			bd.getBf().leerRegistro();
			gui.mostrarNomina(3, bd.getBf().getDatosNominas());
		}
		if (evento.getActionCommand().equals(PanelEntrada.ESCRIBIR_E)) {
			gui.escribirMensaje(bd.getBf().escribirEmpleados());
		}
		
		if (evento.getActionCommand().equals(PanelEntrada.LEER_E)) {
			
		}
	}
	
	public void probarEmpleado() {
		objEmp = new EmpleadoDAO();
		objEmp.obtenerEmpleados().forEach(System.out::println); //obtener todos los clientes
		
		System.out.println("****");// actualiza un cliente
		empleado = objEmp.obtenerEmpleado(0);
		empleado.setNombre("Rodrigo");
		empleado.setApellido("Perez");
		objEmp.actualizarEmpleado(empleado);
		
		System.out.println("****");//obtiene un cliente
		empleado = objEmp.obtenerEmpleado(0);
		System.out.println(empleado);
		
		System.out.println("****");//elimina un cliente
		empleado = objEmp.obtenerEmpleado(0);
		objEmp.borrarEmpleado(empleado);
		
	}
	
}
