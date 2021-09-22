package co.edu.unbosque.model;

public class AgendaDeContactos {

	private Persona directorio[];
	private int tam;
	private int cantidad_ingresados;
	
	public AgendaDeContactos(int tam) {
		
		this.tam = tam;
		directorio = new Persona[this.tam];
		cantidad_ingresados = 0;
		
	}
	
	public boolean agregarPersona(Persona x) {
		
		if(x!=null && cantidad_ingresados<tam ) {
			directorio[cantidad_ingresados] = x;
			cantidad_ingresados++;
			return true;
		}else {
			return false;
		}
	}
	
	public void borrarContacto(int pos) {
		
		directorio[pos] = null;
		
	}
	

	public void moverPersona(int pos) {
		
		for (int i = pos; i < cantidad_ingresados-1; i++) {
			directorio[i] = directorio[i+1];
		}
		directorio[cantidad_ingresados-1]=null;
		cantidad_ingresados--;
	}
	
	public String verDirectorio() {
		String resp = "El directorio de personas es: \n";
		for (int i=0; i < cantidad_ingresados; i++) {
			resp = resp.concat("Contacto # "+(i+1)+". "+directorio[i] + "\n");
		}
		return resp;
	}
	
	public Persona getPosicionDirectorio(int pos) {
		
		if (pos<tam && pos>=0) {
			return directorio[pos];
		}
		return null;
	}

	public Persona[] getDirectorio() {
		return directorio;
	}

	public void setDirectorio(Persona[] directorio) {
		this.directorio = directorio;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getCantidad_ingresados() {
		return cantidad_ingresados;
	}

	public void setCantidad_ingresados(int cantidad_ingresados) {
		this.cantidad_ingresados = cantidad_ingresados;
	}
	
	
	
}
