package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;

public class PersonaSort {
	
	private ArrayList<PersonasDto> pdto;
	
	public PersonaSort() {
		pdto = new ArrayList<PersonasDto>();
		generarPersona();
		mostrar();
	}

	public void generarPersona() {
		pdto.add(new PersonasDto("3", "juan", "scevs", "tims", "H", "aass", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "43", "304.22", "si", "564", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("1", "pedro", "alsc", "erndf", "M", "bdsss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "18", "304.22", "si", "23", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("2", "adolfo", "voel", "togk", "H", "dcgss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "23", "304.22", "si", "123", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("5", "fernando", "xpel", "quas", "M", "kyyss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "75", "304.22", "si", "240", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("4", "yelena", "wored", "nvnf", "M", "zxdss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "4", "304.22", "si", "806", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("6", "juan", "scevs", "tims", "H", "aass", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "43", "304.22", "si", "12", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("8", "pedro", "alsc", "erndf", "M", "bdsss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "18", "304.22", "si", "503", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("7", "adolfo", "voel", "togk", "H", "dcgss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "23", "304.22", "si", "354", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("9", "fernando", "xpel", "quas", "M", "kyyss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "75", "304.22", "si", "333", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("10", "yelena", "wored", "nvnf", "M", "zxdss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "4", "304.22", "si", "993", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("11", "pedro", "alsc", "erndf", "M", "bdsss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "18", "304.22", "si", "403", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("12", "adolfo", "voel", "togk", "H", "dcgss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "23", "304.22", "si", "705", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("13", "fernando", "xpel", "quas", "M", "kyyss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "75", "304.22", "si", "270", "57", "3", "Dispnible", "1.35"));
		pdto.add(new PersonasDto("14", "yelena", "wored", "nvnf", "M", "zxdss", "394dfdd", "aaa@gmsa.com",
				"10/04/82", "4", "304.22", "si", "222", "57", "3", "Dispnible", "1.35"));
		
	}
	
	public void mostrar() {
		personaDesordenado();
		mostrarTop10();
//		ordernarPersonaIdAsc();
//		ordenarPersonaIdDes();
//		ordenarNomAsc();
//		ordenarNomDes();
//		ordernarApel1Asc();
//		ordernarApel1Des();
//		ordernarApel2Asc();
//		ordernarApel2Des();
//		ordernarAliasAsc();
//		ordernarAliasDes();
//		ordernarSexoH();
//		ordernarSexoM();
//		ordernarEdadAsc();
//		ordernarEdadDes();
//		ordernarLikesAsc();
//		ordernarLikesDes();
	}
	
	public void personaDesordenado() {
		System.out.println("sin ordenar");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarPersonaIdAsc() {
		Collections.sort(pdto, PersonasDto.ordernarIdAsc);
		System.out.println("Ordernar por id ascendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordenarPersonaIdDes() {
		Collections.sort(pdto, PersonasDto.ordernarIdDes);
		System.out.println("Ordernar por id descendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordenarNomAsc() {
		Collections.sort(pdto, PersonasDto.ordernarNomAsc);
		System.out.println("Ordernar por nombre ascendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordenarNomDes() {
		Collections.sort(pdto, PersonasDto.ordernarNomDes);
		System.out.println("Ordernar por nombre descendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarApel1Asc() {
		Collections.sort(pdto, PersonasDto.ordernarApel1Asc);
		System.out.println("Ordernar por apellido 1 ascendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarApel1Des() {
		Collections.sort(pdto, PersonasDto.ordernarApel1Des);
		System.out.println("Ordernar por apellido 1 descendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarApel2Asc() {
		Collections.sort(pdto, PersonasDto.ordernarApel2Asc);
		System.out.println("Ordernar por apellido 2 ascendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarApel2Des() {
		Collections.sort(pdto, PersonasDto.ordernarApel2Des);
		System.out.println("Ordernar por apellido 2 descendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarAliasAsc() {
		Collections.sort(pdto, PersonasDto.ordernarAliasAsc);
		System.out.println("Ordernar por alias ascendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarAliasDes() {
		Collections.sort(pdto, PersonasDto.ordernarAliasAsc);
		System.out.println("Ordernar por alias descendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarSexoH() {
		Collections.sort(pdto, PersonasDto.ordernarSexoH);
		System.out.println("Ordernar por hombres");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarSexoM() {
		Collections.sort(pdto, PersonasDto.ordernarSexoM);
		System.out.println("Ordernar por mujeres");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarEdadAsc() {
		Collections.sort(pdto, PersonasDto.ordernarEdadAsc);
		System.out.println("Ordernar por edad ascendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarEdadDes() {
		Collections.sort(pdto, PersonasDto.ordernarEdadDes);
		System.out.println("Ordernar por edad descendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarLikesAsc() {
		Collections.sort(pdto, PersonasDto.ordernarLikesAsc);
		System.out.println("Ordernar por likes ascendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void ordernarLikesDes() {
		Collections.sort(pdto, PersonasDto.ordernarLikesDes);
		System.out.println("Ordernar por likes descendiente");
		for (PersonasDto p : pdto) {
			System.out.println(p);
		}
	}
	
	public void mostrarTop10() {
		Collections.sort(pdto, PersonasDto.ordernarLikesDes);
		System.out.println("se muestra top 10");
		for (PersonasDto p : PersonasDto.ordenarLikesTop10(pdto)) {
			System.out.println(p);
		}
	}
}
