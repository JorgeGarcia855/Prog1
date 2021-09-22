package edu.unbosque.model.persistence;

import java.io.Serializable;
import java.util.ArrayList;

import edu.unbosque.model.PersonasDto;

public final class PersonasDao implements Serializable {

	private static ArrayList<PersonasDto> personas;

	private PersonasDao() {
		personas = new ArrayList<>();
	}

	public static void obtenerDatosCsv() {
		personas = OperacionArchivo.leerCsv();
		OperacionArchivo.escribir(personas);
	}

	public static PersonasDto buscarPersona(String alias) throws ClassNotFoundException {
		PersonasDto encontrado = null;
		personas= OperacionArchivo.obtener();
		assert personas != null;
		if (!personas.isEmpty()) {
			for (PersonasDto persona : personas) {
				if (persona.getAlias().equals(alias)) {
					encontrado = persona;
				}
			}
		}
		return encontrado;
	}

	public static PersonasDto  obtenerInformacionDadoId(String id) throws ClassNotFoundException {
		PersonasDto persona = null;
		if (OperacionArchivo.obtener() != null) {
			personas = OperacionArchivo.obtener();
		}
		assert personas != null;
		for (PersonasDto personasDto : personas) {
			if (personasDto.getId().equals(id)) {
				persona = personasDto;
			}
		}
		return persona;
	}

}
