package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Empleados;
import co.edu.unbosque.model.persistence.EmpleadoDAO;
import co.edu.unbosque.model.persistence.EmpleadoDTO;
import co.edu.unbosque.view.PanelEntrada;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View gui;
	private EmpleadoDAO objEmp;
	private EmpleadoDTO empleado;
	private Empleados emp;
	
	public Controller() {
		emp = new Empleados();
		gui = new View(this);
		gui.setVisible(true); 
		objEmp = new EmpleadoDAO();
		probarEmpleado();
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String resultado;
		if (evento.getActionCommand().equals(PanelEntrada.LEER_E)) {
			gui.escribirMensaje(emp.getEf().escribirEmpleados());
		}
		
	}
	
	public void probarEmpleado() {
		
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
