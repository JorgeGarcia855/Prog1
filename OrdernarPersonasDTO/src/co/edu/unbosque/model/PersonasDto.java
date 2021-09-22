package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class PersonasDto implements Serializable {
	private String id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String sexo;
	private String alias;
	private String contraseña;
	private String correo;
	private String fecha;
	private String edad;
	private String ingresos;
	private String divorcios;
	private String numlikerec;
	private String numlikeot;
	private String nummact;
	private String estado;
	private String estatura;

	public PersonasDto(String id, String nombre, String apellido1, String apellido2, String sexo, String alias,
			String contraseña, String correo, String fecha, String edad, String ingresos, String divorcios,
			String numlikerec, String numlikeot, String nummact, String estado, String estatura) {

		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.sexo = sexo;
		this.alias = alias;
		this.correo = correo;
		this.contraseña = contraseña;
		this.fecha = fecha;
		this.edad = edad;
		this.ingresos = ingresos;
		this.divorcios = divorcios;
		this.numlikerec = numlikerec;
		this.numlikeot = numlikeot;
		this.nummact = nummact;
		this.estado = estado;
		this.estatura = estatura;
	}
	
	public static Comparator<PersonasDto> ordernarIdAsc = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return Integer.parseInt(o1.id)-Integer.parseInt(o2.id);
		}
	};
	
	public static Comparator<PersonasDto> ordernarIdDes = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return Integer.parseInt(o2.id)-Integer.parseInt(o1.id);
		}
	};
	
	public static Comparator<PersonasDto> ordernarNomAsc = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return o1.nombre.compareTo(o2.nombre);
		}
	};
	
	public static Comparator<PersonasDto> ordernarNomDes = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return o2.nombre.compareTo(o1.nombre);
		}
	};
	
	public static Comparator<PersonasDto> ordernarApel1Asc = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return o1.apellido1.compareTo(o2.apellido1);
		}
	};
	
	public static Comparator<PersonasDto> ordernarApel1Des = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return o2.apellido1.compareTo(o1.apellido1);
		}
	};
	
	public static Comparator<PersonasDto> ordernarApel2Asc = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return o1.apellido2.compareTo(o2.apellido2);
		}
	};
	
	public static Comparator<PersonasDto> ordernarApel2Des = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return o2.apellido2.compareTo(o1.apellido2);
		}
	};
	
	public static Comparator<PersonasDto> ordernarAliasAsc = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return o1.alias.compareTo(o2.alias);
		}
	};
	
	public static Comparator<PersonasDto> ordernarAliasDes = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return o2.alias.compareTo(o1.alias);
		}
	};
	
	public static Comparator<PersonasDto> ordernarSexoH = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return o1.sexo.compareTo(o2.sexo);
		}
	};
	
	public static Comparator<PersonasDto> ordernarSexoM = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return o2.sexo.compareTo(o1.sexo);
		}
	};
	
	public static Comparator<PersonasDto> ordernarEdadAsc = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return Integer.parseInt(o1.edad)-Integer.parseInt(o2.edad);
		}
	};
	
	public static Comparator<PersonasDto> ordernarEdadDes = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return Integer.parseInt(o2.edad)-Integer.parseInt(o1.edad);
		}
	};
	
	public static Comparator<PersonasDto> ordernarLikesAsc = new Comparator<PersonasDto>() {
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return Integer.parseInt(o1.numlikerec)-Integer.parseInt(o2.numlikerec);
		}
	};
	
	public static Comparator<PersonasDto> ordernarLikesDes = new Comparator<PersonasDto>() {
		
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return Integer.parseInt(o2.numlikerec)-Integer.parseInt(o1.numlikerec);
		}
	};
	
	public static Comparator<PersonasDto> ordernarIngresosAsc = new Comparator<PersonasDto>() {
		
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return Integer.parseInt(o1.ingresos)-Integer.parseInt(o2.ingresos);
		}
	};
	
	public static Comparator<PersonasDto> ordernarIngresosDes = new Comparator<PersonasDto>() {
		
		@Override
		public int compare(PersonasDto o1, PersonasDto o2) {
			return Integer.parseInt(o2.ingresos)-Integer.parseInt(o1.ingresos);
		}
	};
	
	public static ArrayList<PersonasDto> ordenarLikesTop10(ArrayList<PersonasDto> per) {
		ArrayList<PersonasDto> top10 = new ArrayList<PersonasDto>(per.subList(0, 10));
		return top10;
	}
	
	@Override
	public String toString() {
		return "Mujeres [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", sexo=" + sexo + ", alias=" + alias + ",contraseña=" + contraseña + ", correo=" + correo
				+ ", fecha=" + fecha + ", edad=" + edad + ", ingresos=" + ingresos + ", divorcios=" + divorcios
				+ ", numlikerec=" + numlikerec + ", numlikeot=" + numlikeot + ", nummact=" + nummact + ", estado="
				+ estado + ", estatura=" + estatura + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getIngresos() {
		return ingresos;
	}

	public void setIngresos(String ingresos) {
		this.ingresos = ingresos;
	}

	public String getDivorcios() {
		return divorcios;
	}

	public void setDivorcios(String divorcios) {
		this.divorcios = divorcios;
	}

	public String getNumlikerec() {
		return numlikerec;
	}

	public void setNumlikerec(String numlikerec) {
		this.numlikerec = numlikerec;
	}

	public String getNumlikeot() {
		return numlikeot;
	}

	public void setNumlikeot(String numlikeot) {
		this.numlikeot = numlikeot;
	}

	public String getNummact() {
		return nummact;
	}

	public void setNummact(String nummact) {
		this.nummact = nummact;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstatura() {
		return estatura;
	}

	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}

}
