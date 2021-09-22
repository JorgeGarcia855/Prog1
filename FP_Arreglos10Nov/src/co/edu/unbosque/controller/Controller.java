package co.edu.unbosque.controller;

import co.edu.unbosque.model.AgendaDeContactos;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.view.ViewVentana;

public class Controller {

	private ViewVentana vista;
	private Persona persona_aux;
	private AgendaDeContactos agenda;
	
	public Controller() {
		vista = new ViewVentana();
		funcionar();
	}
	
	public void funcionar() {
		
		agenda =new AgendaDeContactos(10);
		menu();
	}

	public void menu() {
		int opcion=0;
		
		do {
			opcion = Integer.parseInt(vista.leerDato("Seleccione:" 
										+ "\n\n1. Agregar Contactos"  
										+ "\n2. Eliminar Contacto"  
										+ "\n3. Ver Directorio"
										+ "\n4. Salir"
										+ "\n\nOpción:"));
			
			switch (opcion) {
				case 1:
					int num = 0;
					num= Integer.parseInt(vista.leerDato("¿Cuantos contactos quiere agregar?"));
					if(num<=10 && num>0) {
						for (int i = 0; i < num; i++) {
							ingresarPersona();
						}
					}else {
						vista.mostrarInfo("Ingrese un número positivo menor a 10", "error");
					}
					break;
				case 2:
					borrarPersona();
					vista.mostrarInfo(agenda.verDirectorio(), "informativo");
					break;
				case 3:
					if (agenda.getCantidad_ingresados()==0) {
						vista.mostrarInfo("Agenda vacía, por favor ingrese un contacto", "informativo");
					}else {
						vista.mostrarInfo(agenda.verDirectorio(), "informativo");						
					}
					break;
				case 4:
					vista.mostrarInfo("Hasta pronto", "informativo");
					break;
				default:
					vista.mostrarInfo("Sea Serio, OPCIÓN INVÁLIDA", "error");
					break;
			}
			
		} while (opcion!=4);
		
	}
	
	public void ingresarPersona() {
		
		String aux_correo = "";
		long aux_tel = 0;
		int aux_edad = 0;
		boolean error=false;
		String aux_nombre = vista.leerDato("Digite Nombre: ");

		do {
			try {
				aux_tel = Long.parseLong(vista.leerDato("Digite telefono: "));
				error=false;
			} catch (NumberFormatException e) {
				error=true;
			}
		} while (error);
		
		do {
			try {
				aux_edad = Integer.parseInt(vista.leerDato("Digite edad: "));
				error=false;
			} catch (NumberFormatException e) {
				error=true;
			}
		} while (error);
		
		do {
			aux_correo = vista.leerDato("Digite Correo: ");
			error = comprobarCorreo(aux_correo);
		} while (!error);
		
		persona_aux =new Persona(aux_nombre, aux_tel, aux_edad, aux_correo);
		if(agenda.agregarPersona(persona_aux)) {
			vista.mostrarInfo("La persona fué agregada satisfactoriamente", "informativo");
			vista.mostrarInfo(agenda.getPosicionDirectorio(agenda.getCantidad_ingresados()-1).toString(), "informativo");
		}else{
			vista.mostrarInfo("La persona no se agregó", "error");
		}
		
	}
	
	public void borrarPersona() {
		
		int pos = Integer.parseInt(vista.leerDato(agenda.verDirectorio()+"\n\nIngrese el número del contacto a eliminar"));
		agenda.getPosicionDirectorio(pos);
		pos = pos-1;
		agenda.borrarContacto(pos);
		agenda.moverPersona(pos);
	}
	
	public boolean comprobarCorreo(String correo) {
		
		int contador = 0;
		boolean comprobar = false;
		for(int i=0; i<correo.length(); i++) {
			if(correo.charAt(i) == '@' ) {
				contador++;
			}
		}
		if (contador!=1) {
			vista.mostrarInfo("Ingrese un correo valido", "error");;
		}else{
			comprobar =true;
		}
		return comprobar;
	}
}
