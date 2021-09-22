package co.edu.unbosque.model.persistence;

public class Nombres {
	
	public String[] nombre;
	
	public Nombres() {
		nombre = new String[24];
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
		nombre[12] = "nombre13";
		nombre[13] = "nombre14";
		nombre[14] = "nombre15";
		nombre[15] = "nombre16";
		nombre[16] = "nombre17";
		nombre[17] = "nombre18";
		nombre[18] = "nombre19";
		nombre[19] = "nombre20";
		nombre[20] = "nombre21";
		nombre[21] = "nombre22";
		nombre[22] = "nombre23";
		nombre[23] = "nombre24";
	}
	
	public String generarNombre() {
		String texto = "";
		for (int i = 0; i < nombre.length; i++) {
			if(i==nombre.length-1) {
				texto +=(i+1)+","+nombre[i];
			}else {
				texto +=(i+1)+","+nombre[i]+"\n";
			}
		}
		return texto;
	}
	
	
	
}
