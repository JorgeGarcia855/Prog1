package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.FrasesRegueton;
import co.edu.unbosque.model.persistence.Propiedades;

public class Gestionar {
	
	private Archivo archivo = new Archivo();
	
	public String mostrarArchivo() {
		return "lei este dato: "+archivo.leerArchivo();
	}
	
	public void gestionarArchivoCadena() {
		FrasesRegueton fra = new FrasesRegueton();
		archivo.escribirArchivo(fra.generadorCanciones());
	}
	
	public String gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
		return "Se leyeron estas propiedades: "+"\n"+prop.leerPropiedades();
	}
}
