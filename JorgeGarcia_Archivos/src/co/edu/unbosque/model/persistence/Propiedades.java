package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties();
	private String archivoprop = "./data/archivo.properties";
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreProyecto", "ArchivosTexto");
			prop.setProperty("nombreArchivo", "archivo.properties");
			prop.setProperty("nombreCodigoFuente", "Propiedades.java");
			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop)); //leer el archivo de propiedades
			prop.list(System.out); //obtener las propiedades definidas
			//Reading each property value
			linea += "nombre del Proyecto: "+ prop.getProperty("nombreProyecto")+"\n";
			linea += "nombre del Archivo: "+ prop.getProperty("nombreArchivo")+"\n";
			linea += "nombre de la Clase Java: "+ prop.getProperty("nombreCodigoFuente")+"\n";
		} catch (IOException ex) {
			return null;
		}
		return linea;
	}
}
