package edu.unbosque.model;

import java.util.ArrayList;
import java.util.Comparator;

import edu.unbosque.model.persistence.OperacionArchivo;

public final class Filtrado {

	private static ArrayList<PersonasDto> pdto;

	private Filtrado() throws ClassNotFoundException {
		pdto = new ArrayList<>();
		OperacionArchivo op = new OperacionArchivo();
		pdto = op.obtener();
	}

	// METODO BURBUJA
	public static ArrayList<PersonasDto> ordenarNumLikesRecibidos(ArrayList<PersonasDto> likes) {
		PersonasDto temp;
		for (int i = 0; i < likes.size(); i++) {
			for (int j = 0; j < likes.size() - 1; j++) {
				if (Integer.parseInt(likes.get(j).getNumlikerec()) >= Integer
						.parseInt(likes.get(j + 1).getNumlikerec())) {
					temp = likes.get(j);
					likes.set(j, likes.get(j + 1));
					likes.set(j + 1, temp);
				}
			}
		}
		return likes;
	}

	//metodo de inserción
	public static ArrayList<PersonasDto> ordenarNumLikesOtorgados(ArrayList<PersonasDto> likesotor) {
		for (int i = 1; i < likesotor.size(); i++) {
			PersonasDto aux = likesotor.get(i);
			int j;
			for (j = i - 1; j >= 0
					&& Integer.parseInt(likesotor.get(j).getNumlikeot()) > Integer.parseInt(aux.getNumlikeot()); j--) {
				likesotor.set(j + 1, likesotor.get(j));
			}
			likesotor.set(j + 1, aux);
		}
		return likesotor;
	}

	public static Comparator<PersonasDto> ordernarNomAsc = Comparator.comparing(PersonasDto::getNombre);
	public static Comparator<PersonasDto> ordernarNomDes = (PersonasDto o1, PersonasDto o2) -> o2.getNombre().compareTo(o1.getNombre());
	
	public static Comparator<PersonasDto> ordernarApel1Asc = Comparator.comparing(PersonasDto::getApellido1);
	public static Comparator<PersonasDto> ordernarApel1Des = (PersonasDto o1, PersonasDto o2) -> o2.getApellido1().compareTo(o1.getApellido1());

	public static Comparator<PersonasDto> ordernarAliasAsc = Comparator.comparing(PersonasDto::getAlias);

	public static Comparator<PersonasDto> ordernarSexoH = Comparator.comparing(PersonasDto::getSexo);
	public static Comparator<PersonasDto> ordernarSexoM = (PersonasDto o1, PersonasDto o2) -> o2.getSexo().compareTo(o1.getSexo());
	
	public static Comparator<PersonasDto> ordernarEdadAsc = Comparator.comparingInt((PersonasDto o) -> Integer.parseInt(o.getEdad()));

	public static Comparator<PersonasDto> ordernarEdadDes = (PersonasDto o1, PersonasDto o2) -> Integer.parseInt(o2.getEdad()) - Integer.parseInt(o1.getEdad());
	
	public static Comparator<PersonasDto> ordernarLikesAsc = Comparator.comparingInt(o -> Integer.parseInt(o.getNumlikerec()));

	public static Comparator<PersonasDto> ordernarLikesDes = (o1, o2) -> Integer.parseInt(o2.getNumlikerec()) - Integer.parseInt(o1.getNumlikerec());

	public static Comparator<PersonasDto> ordernarIngresosDes = (o1, o2) -> (int) (Double.parseDouble(o2.getIngresos())-Double.parseDouble(o1.getIngresos()));

	public static ArrayList<PersonasDto> ordenarLikesTop10(ArrayList<PersonasDto> per) {
		return new ArrayList<>(per.subList(0, 10));
	}


	public static String mostrarNomAsc() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarNomAsc);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarNomDes() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarNomDes);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarApel1Asc() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarApel1Asc);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarApel1Des() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarApel1Des);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarAliasAsc() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarAliasAsc);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarAliasDes() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarAliasAsc);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarSexoH() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarSexoH);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarSexoM() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarSexoM);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarEdadAsc() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarEdadAsc);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarEdadDes() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarEdadDes);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarLikesAsc() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarLikesAsc);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarLikesDes() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarLikesDes);
		for (PersonasDto p : pdto) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}

	public static String mostrarTop10() {
		StringBuilder mostrar = new StringBuilder();
		pdto.sort(ordernarLikesDes);
		for (PersonasDto p : ordenarLikesTop10(pdto)) {
			mostrar.append(p.toString()).append("\n");
		}
		return mostrar.toString();
	}
	
	
	public static String mostrarIngr244(){
		StringBuilder mostrar = new StringBuilder();
		ArrayList<PersonasDto> ingpdto = (ArrayList<PersonasDto>) pdto.clone();
		for (PersonasDto personasDto : ingpdto) {
			if (personasDto.getIngresos().equals("")) {
				personasDto.setIngresos("0");
			}
		}
		ingpdto.sort(ordernarIngresosDes);
		ingpdto.removeIf(PersonasDto -> Double.parseDouble(PersonasDto.getIngresos())<244.85);
		for (PersonasDto p : ingpdto) {
			mostrar.append(p.toString()).append("\n");
		}
		
		return mostrar.toString();
	}
	
}