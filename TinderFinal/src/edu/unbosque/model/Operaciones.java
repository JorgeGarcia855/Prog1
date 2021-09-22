package edu.unbosque.model;

import java.util.ArrayList;
import java.util.Objects;

import edu.unbosque.model.persistence.OperacionArchivo;

public final class Operaciones {

	private final static String minusculas = "abcdefghijklmnopqrstuvwxyz0123456789";

	public static String getPassword() {
		StringBuilder pswd = new StringBuilder();
		for (int i = 0; i < 16; i++) {
			pswd.append(minusculas.charAt((int) (Math.random() * minusculas.length())));
		}
		System.out.println(pswd);
		return pswd.toString();
	}

	public static String likes() {
		String resul = "";
		double random = Math.pow(10, 2 - 1) + Math.random() * ((Math.pow(10, 2) - 1) - Math.pow(10, 2 - 1));
		int numero = (int) random;
		resul = String.valueOf(numero);
		System.out.println(random);
		return resul;
	}

	public static String mathches() {
		String resul = "";
		double random = Math.pow(10, 0) + Math.random() * ((Math.pow(10, 1) - 1) - Math.pow(10, 0));
		int numero = (int) random;
		resul = String.valueOf(numero);
		System.out.println(resul);

		return resul;
	}

	public static int CalcularModaLikesRecibidos() throws ClassNotFoundException {

		int moda = 0;
		int numlikesrec = 0;
		int cont1 = 0;
		boolean aux = true;
		ArrayList<String> num = new ArrayList<>();
		ArrayList<PersonasDto> personas1 = OperacionArchivo.obtener();

		for (int i = 0; i < personas1.size(); i++) {
			int cont = 0;

			if (aux) {
				for (int j = 0; j < personas1.size() - 1; j++) {

					if (personas1.get(i).getNumlikerec().equals(personas1.get(j).getNumlikerec())) {
						cont++;

						num.add(personas1.get(i).getNumlikerec());

					}

				}
			}

			if (cont > cont1) {
				numlikesrec = Integer.parseInt(Objects.requireNonNull(OperacionArchivo.obtener()).get(i).getNumlikerec());
				moda = numlikesrec;
				cont1 = cont;
			}

			for (String s : num) {
				aux = !s.equals(personas1.get(i).getNumlikerec());
			}

		}

		return moda;
	}

	public static double calcularMediaLikesRecibidos() throws ClassNotFoundException {

		int cont = 0;
		ArrayList<PersonasDto> personas = OperacionArchivo.obtener();
		double media = 0;

		assert personas != null;
		for (PersonasDto persona : personas) {
			cont += Integer.parseInt(persona.getNumlikerec());

		}

		media = cont / personas.size();

		return media;
	}

	public static String calcularMedianaLikesRecibidos(ArrayList<PersonasDto> personas1) {

		String mediana = "";
		if (personas1.size() % 2 != 0) {
			int posicion = (personas1.size() + 1) / 2;
			mediana = personas1.get(posicion).getNumlikerec();
		} else {
			int posicion = (personas1.size() + 1) / 2;
			int calmediana = Integer.parseInt(
					personas1.get(posicion).getNumlikerec() + personas1.get(posicion + 1).getNumlikerec()) / 2;
			mediana = String.valueOf(calmediana);
		}
		return mediana;
	}

	public static int CalcularModaLikesOtorgados() throws ClassNotFoundException {

		int moda = 0;
		int numlikesotor;
		int cont1 = 0;
		boolean aux = true;
		ArrayList<String> num = new ArrayList<String>();
		ArrayList<PersonasDto> personas1 = OperacionArchivo.obtener();

		for (int i = 0; i < Objects.requireNonNull(personas1).size(); i++) {
			int cont = 0;

			if (aux) {
				for (int j = 0; j < personas1.size() - 1; j++) {

					if (personas1.get(i).getNumlikeot().equals(personas1.get(j).getNumlikeot())) {
						cont++;

						num.add(personas1.get(i).getNumlikeot());

					}

				}
			}

			if (cont > cont1) {
				numlikesotor = Integer.parseInt(Objects.requireNonNull(OperacionArchivo.obtener()).get(i).getNumlikeot());
				moda = numlikesotor;
				cont1 = cont;
			}

			for (String s : num) {
				aux = !s.equals(personas1.get(i).getNumlikeot());
			}

		}

		return moda;
	}

	public static double calcularMediaLikesOtorgados() throws ClassNotFoundException {

		int cont = 0;
		ArrayList<PersonasDto> personas = OperacionArchivo.obtener();
		double media;

		assert personas != null;
		for (PersonasDto persona : personas) {
			cont += Integer.parseInt(persona.getNumlikeot());

		}

		media = cont / personas.size();

		return media;
	}

	public static String calcularMedianaLikesOtorgados(ArrayList<PersonasDto> personas1) {

		String mediana;
		if (personas1.size() % 2 != 0) {
			int posicion = (personas1.size() + 1) / 2;
			mediana = personas1.get(posicion).getNumlikeot();
		} else {
			int posicion = (personas1.size() + 1) / 2;
			double calmediana = Integer
					.parseInt(personas1.get(posicion).getNumlikeot() + personas1.get(posicion + 1).getNumlikeot()) / 2;
			mediana = String.valueOf(calmediana);
		}
		return mediana;
	}

}
