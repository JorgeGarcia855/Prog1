package edu.unbosque.model;


import java.util.Calendar;
import java.util.GregorianCalendar;


public final class SeccionOpciones {

	private static int edad;

	public static String CalcularEdad(int año) {
		Calendar calendar = new GregorianCalendar();
		int añoactual = calendar.get(Calendar.YEAR);
		edad = añoactual - año;
		if (edad < 18) return "No cumple con la edad minima para usar la aplicación";
		else return "Fecha validada correctamente";
	}

	public static int getEdad() {
		return edad;
	}
}
