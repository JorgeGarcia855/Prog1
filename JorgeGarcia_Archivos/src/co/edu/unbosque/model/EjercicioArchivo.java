package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.*;

public class EjercicioArchivo {

	public String gestionarArchivoCadena() {
		EjemploFile archivo = new EjemploFile();
		Nombres n = new Nombres();
		archivo.escribirArchivo(n.generarNombre());
		return "lei este dato: "+archivo.leerArchivo();
	}
	
	public String gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
		return "Se leyeron estas propiedades: "+"\n"+prop.leerPropiedades();
	}
}
