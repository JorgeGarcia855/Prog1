package edu.unbosque.model.persistence;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import edu.unbosque.model.PersonasDto;

public final class MujeresDao implements Serializable {

	private static ArrayList<PersonasDto> mujer;
	private static final OperacionArchivo operacion = new OperacionArchivo();

	private MujeresDao() {
		mujer = new ArrayList<>();
	}


	public static PersonasDto buscarMujer(String id) throws ClassNotFoundException {
		PersonasDto encontrado = null;
		mujer = operacion.obtener();
		if (!mujer.isEmpty()) {
			for (PersonasDto personasDto : mujer) {
				if (personasDto.getSexo().equals("M")) {
					if (personasDto.getId().equals(id)) {
						encontrado = personasDto;
					}
				}
			}
		}
		return encontrado;
	}

	public static int generarnuevoId() throws ClassNotFoundException {

		mujer = operacion.obtener();
		int auxid = 0;
		for (int i = 0; i < mujer.size(); i++) {

			auxid++;

		}
		auxid += 1;

		return auxid;

	}

	public static void agregar(String id, String nombre, String apellido1, String apellido2, String sexo, String alias,
						String contraseña, String correo, String fecha, String edad, String divorcios, String numlikerec,
						String numlikeot, String nummact, String estado, String estatura) throws ClassNotFoundException {

		if (operacion.obtener() != null) {
			mujer = operacion.obtener();
		}
		PersonasDto nuevo = new PersonasDto(id, nombre, apellido1, apellido2, sexo, alias, contraseña, correo, fecha,
				edad, null, divorcios, numlikerec, numlikeot, nummact, estado, estatura);

		mujer.add(nuevo);
		JOptionPane.showMessageDialog(null, "Inscrito exitosamente");

		operacion.escribir(mujer);
	}

	public static void eliminarUsuario(String id) throws ClassNotFoundException, IOException {

		if (operacion.obtener() != null) {
			mujer = operacion.obtener();
		}
		for (PersonasDto p : mujer) {
			if (p.getId().equals(id)) {
				mujer.remove(p);
			}
			operacion.escribir(mujer);
		}

	}

	public static boolean modificarNombre(String id, String nuevoNom) throws ClassNotFoundException {
		boolean aux = false;
		if (operacion.obtener() != null) {
			mujer = operacion.obtener();
		}
		for (PersonasDto p : mujer) {
			if (p.getId().equals(id)) {
				p.setNombre(nuevoNom);

				aux = true;

			}
		}
		operacion.escribir(mujer);
		return aux;

	}

	public static boolean modifcarSexo(String id, String nuevoSexo) throws ClassNotFoundException {
		boolean aux = false;
		if (operacion.obtener() != null) {
			mujer = operacion.obtener();
		}

		for (PersonasDto p : mujer) {
			if (p.getId().equals(id)) {
				p.setSexo(nuevoSexo);
				aux = true;
			}
		}
		// Escribimos
		operacion.escribir(mujer);
		return aux;

	}

	public static boolean modificarEdad(String id, String nuevaEdad) throws ClassNotFoundException {
		boolean aux = false;
		if (operacion.obtener() != null) {
			mujer = operacion.obtener();
		}
		for (PersonasDto p : mujer) {
			if (p.getId().equals(id)) {
				p.setEdad(nuevaEdad);
				aux = true;
			}
		}
		operacion.escribir(mujer);
		return aux;

	}

	public static boolean modificarIngresos(String id, String nuevosIngresos) throws ClassNotFoundException {
		boolean aux = false;
		if (operacion.obtener() != null) {
			mujer = operacion.obtener();
		}
		for (PersonasDto p : mujer) {
			if (p.getId().equals(id)) {
				p.setIngresos(nuevosIngresos);
				aux = true;
			}
		}
		operacion.escribir(mujer);
		return aux;

	}

	public static boolean modificarDivorcios(String id, String nuevoDivorcios) throws ClassNotFoundException {
		boolean aux = false;

		if (operacion.obtener() != null) {
			mujer = operacion.obtener();
		}
		for (PersonasDto p : mujer) {
			if (p.getId().equals(id)) {
				p.setDivorcios(nuevoDivorcios);
				aux = true;
			}
		}
		operacion.escribir(mujer);
		return aux;

	}

	public static boolean modificarnumlikes(String id, String nuevoLikes) throws ClassNotFoundException {
		boolean aux = false;

		if (operacion.obtener() != null) {
			mujer = operacion.obtener();
		}
		for (PersonasDto p : mujer) {
			if (p.getId().equals(id)) {
				p.setNumlikerec(nuevoLikes);
				aux = true;
			}
		}
		operacion.escribir(mujer);
		return aux;

	}

	public static boolean modificarEstado(String id, String nuevoEstado) throws ClassNotFoundException {
		boolean aux = false;
		if (operacion.obtener() != null) {
			mujer = operacion.obtener();
		}
		for (PersonasDto p : mujer) {
			if (p.getId().equals(id)) {
				p.setEstado(nuevoEstado);
				aux = true;
			}
		}
		operacion.escribir(mujer);
		return aux;

	}

}
