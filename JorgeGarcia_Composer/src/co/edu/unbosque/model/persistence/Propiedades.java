package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties();
	private String archivoprop = "./data/archivo.properties";
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("numeroEstrofas", "3");
			prop.setProperty("numeroFrases", "4");
			prop.setProperty("cantante1", "Conejo Malo");
			prop.setProperty("cantante2", "Karola Gonzalez");
			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out); 
			linea += "Numero de Estrofas: "+ prop.getProperty("numeroEstrofas")+"\n";
			linea += "Numero de Frases: "+ prop.getProperty("numeroFrases")+"\n";
			linea += "Nombre del primer cantante: "+ prop.getProperty("cantante1")+"\n";
			linea += "Nombre del segundo cantante: "+ prop.getProperty("cantante2");
			
		} catch (IOException ex) {
			return null;
		}
		return linea;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoprop() {
		return archivoprop;
	}

	public void setArchivoprop(String archivoprop) {
		this.archivoprop = archivoprop;
	}
	
}
