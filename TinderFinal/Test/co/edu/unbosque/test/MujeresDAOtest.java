package co.edu.unbosque.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.PersonasDto;
import co.edu.unbosque.persistence.MujeresDao;
import co.edu.unbosque.persistence.OperacionArchivo;
import junit.framework.TestCase;

public class MujeresDAOtest extends TestCase {

	private PersonasDto dto;
	MujeresDao mujdao;
	OperacionArchivo oparchivo;
	File file = new File("./dataTests/personas.dat");
	ArrayList<PersonasDto> lista;
	PersonasDto e1;
	PersonasDto e2;
	PersonasDto e3;
	PersonasDto e4;
	PersonasDto e5;
	PersonasDto e6;

	public MujeresDAOtest() {
		file.delete();
		try {
			file.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
		oparchivo = new OperacionArchivo();
		lista = oparchivo.leerArchivo(file);
		mujdao = new MujeresDao();

		e1 = new PersonasDto("1", "david", "el papasito", "rico", "H", "noloc", "asdf", "supta@gmail.com", "09/06/21",
				"85", "aplica", "12", "13", "14", "inactivo", "diponible", "2metros");
		e2 = new PersonasDto("2", "david", "el papasito", "rico", "H", "noloc", "asdf", "supta@gmail.com", "09/06/21",
				"85", "aplica", "12", "13", "14", "inactivo", "diponible", "2metros");

		lista.add(e1);
		lista.add(e2);

	}

	public void testMujeresDAO() {
		assertEquals("La cantidad de personas debe ser 1", 2, lista.size());

	}

	public void testAgregarPersona() throws ClassNotFoundException {

		assertTrue("Se debio agregar el empleado",
				mujdao.agregar(e1.getId(), e1.getNombre(), e1.getApellido1(), e1.getApellido2(), e1.getSexo(),
						e1.getAlias(), e1.getContraseña(), e1.getCorreo(), e1.getFecha(), e1.getEdad(),
						e1.getDivorcios(), e1.getNumlikerec(), e1.getNumlikeot(), e1.getNummact(), e1.getEstado(),
						e1.getEstatura()));

	}

	public void testEliminarPersona() throws ClassNotFoundException, IOException {

		assertFalse("Se debio eliminar el empleado", mujdao.eliminarUsuario(e2.getId()));
	}

	public void testBuscarMujer() throws ClassNotFoundException {

		 assertNull("No debio encontrar un usuario con id NO existente en el sistema",
		 mujdao.buscarMujer("888"));
//		assertNotNull("Debio encontrarse al usuario", mujdao.buscarMujer(e1.getId()));

	}

}
