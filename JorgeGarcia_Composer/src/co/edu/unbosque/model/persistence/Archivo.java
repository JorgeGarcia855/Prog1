package co.edu.unbosque.model.persistence;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Archivo {
	
	private String archivodata = "./data/nombre.txt";
	private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo .txt", ".txt");
	
	public int escribirArchivo(String dato) { 
		JFileChooser j = new JFileChooser();
		j.setFileFilter(filter);
		j.showSaveDialog(j);
		File f = new File(j.getSelectedFile()+".txt");
		try {
			FileWriter fw = new FileWriter(f);		
			PrintWriter pw = new PrintWriter(fw);	
			pw.println(dato);			
			fw.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerArchivo() {
		String linea = "";
		String cadena = "";
		File f  = new File(this.archivodata);
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {
				cadena += linea+"\n";
				linea = br.readLine();
			}
		} catch (IOException e) {
			return null;
		}
		return cadena;
	}
}
