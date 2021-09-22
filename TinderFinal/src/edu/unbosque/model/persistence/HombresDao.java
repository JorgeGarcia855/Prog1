package edu.unbosque.model.persistence;

import java.io.Serializable;
import java.util.ArrayList;

import edu.unbosque.model.PersonasDto;

public final class HombresDao implements Serializable {

	private static ArrayList<PersonasDto> hombres;
	private static final OperacionArchivo operacion = new OperacionArchivo();

	private HombresDao() {
		hombres = new ArrayList<>();
	}

	public static PersonasDto buscarHombre(String id) throws ClassNotFoundException {
		PersonasDto encontrado = null;
		hombres = operacion.obtener();
		if (!hombres.isEmpty()) {
			for (PersonasDto hombre : hombres) {
				if (hombre.getSexo().equals("H")) {
					if (hombre.getId().equals(id)) {
						encontrado = hombre;
					}
				}
			}
		}
		return encontrado;
	}

	public static void agregarHombre(String id, String nombre, String apellido1, String apellido2, String sexo, String alias,
							  String contraseña, String correo, String fecha, String edad, String salario, String numlikerec,
							  String numlikeot, String nummact, String estado, String estatura) throws ClassNotFoundException {

		if (operacion.obtener() != null) {
			hombres = operacion.obtener();
			// System.out.println("SE HIZO");
		}
		PersonasDto nuevo = new PersonasDto(id, nombre, apellido1, apellido2, sexo, alias, contraseña, correo, fecha,
				edad, salario, null, numlikerec, numlikeot, nummact, estado, estatura);

		assert hombres != null;
		hombres.add(nuevo);

		operacion.escribir(hombres);
	}

}
