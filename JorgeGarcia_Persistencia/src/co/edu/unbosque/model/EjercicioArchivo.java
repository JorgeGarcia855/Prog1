package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.*;


public class EjercicioArchivo {

	public String gestionarArchivoCadena() {
		EjemploFile archivo = new EjemploFile();
		Nombres n = new Nombres();
		archivo.escribirArchivo(n.generarNombre());
		return "lei este dato: "+archivo.leerArchivo();
	}
	
}
