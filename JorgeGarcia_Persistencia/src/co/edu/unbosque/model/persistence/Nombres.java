package co.edu.unbosque.model.persistence;

public class Nombres {
	
	public String[] nombre;
	
	public Nombres() {
		nombre = new String[12];
		letraNombres();
	}
	
	public void letraNombres() {
		nombre[0] = "nombre1";
		nombre[1] = "nombre2";
		nombre[2] = "nombre3";
		nombre[3] = "nombre4";
		nombre[4] = "nombre5";
		nombre[5] = "nombre6";
		nombre[6] = "nombre7";
		nombre[7] = "nombre8";
		nombre[8] = "nombre9";
		nombre[9] = "nombre10";
		nombre[10] = "nombre11";
		nombre[11] = "nombre12";
	}
	
	public String generarNombre() {
		String texto = "";
		for (int i = 0; i < nombre.length; i++) {
			texto +=nombre[i]+"\n";
		}
		return texto;
	}
	
}
