package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
	
	private List<EmpleadoDTO> empleados;
	
	public EmpleadoDAO() {
		empleados = new ArrayList<>();
		EmpleadoDTO empleado1 = new EmpleadoDTO(0, "Elivar", "Largo", 4343.0);;
		EmpleadoDTO empleado2 = new EmpleadoDTO(1, "Priscila", "Morocho", 2234.0);;
		crearEmpleado(empleado1);
		crearEmpleado(empleado2);
	}
	
	public void crearEmpleado(EmpleadoDTO empleado) {
		empleados.add(empleado);
	}
	
	public String borrarEmpleado(EmpleadoDTO empleado) {
		empleados.remove(empleado.getId());
		return "Empleado "+empleado.getId()+" eliminado satisfactoriamente";
	}
	
	public List<EmpleadoDTO> obtenerEmpleados() {
		return empleados;
	}
	
	public EmpleadoDTO obtenerEmpleado(int id) {
		return empleados.get(id);
	}
	
	public String actualizarEmpleado(EmpleadoDTO empleado) {
		empleados.get(empleado.getId()).setNombre(empleado.getNombre());
		empleados.get(empleado.getId()).setApellido(empleado.getApellido());
		return "Empleado id: "+ empleado.getId()+" actualizado satisfactoriamente";	
	}

}
