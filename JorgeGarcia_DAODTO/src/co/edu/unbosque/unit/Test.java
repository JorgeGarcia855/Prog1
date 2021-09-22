package co.edu.unbosque.unit;

import co.edu.unbosque.model.persistence.EmpleadoDAO;
import co.edu.unbosque.model.persistence.EmpleadoDTO;
import junit.framework.TestCase;


public class Test extends TestCase {
	
	EmpleadoDAO emp;
	EmpleadoDTO emp1, emp2 ,emp3;
	
	public void setUp() {
		emp = new EmpleadoDAO();
		emp1 = new EmpleadoDTO(0, "Sebastian", "Gomez", 455.0);
		emp2 = new EmpleadoDTO(1, "Alfonso", "Lopez", 3455.0);
		emp3 = new EmpleadoDTO(2, "Eduardo", "Perez", 3855.0);
	}
	
	public void testCrearEmpleado() {
		emp.crearEmpleado(emp1);
		assertEquals("Los datos al crear no coinciden.","Sebastian", emp1.getNombre());
	}
	
	public void testObtenerEmpleado() {
		emp.obtenerEmpleado(emp2.getId());
		assertEquals("Los datos obtenidos no coinciden.",1, emp2.getId());
	}
	
	public void testActualizarEmpleado() {
		emp1 = emp.obtenerEmpleado(0);
		emp1.setNombre("Julian");
		emp1.setApellido("Marquez");
		emp.actualizarEmpleado(emp1);
		assertEquals("No se actualizo los datos", "Empleado id: 0 actualizado satisfactoriamente" , emp.actualizarEmpleado(emp1));
	}
	
	public void testBorrarEmpleado() {
		emp1 = emp.obtenerEmpleado(0);
		assertEquals("El empleado no fue eliminado","Empleado "+0+" eliminado satisfactoriamente", emp.borrarEmpleado(emp1));
	}
	
	public void tearDown() {
		emp = null;
	}

}
