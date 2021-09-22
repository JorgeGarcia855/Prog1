package edu.unbosque.model;

import java.io.Serializable;

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

	@Override
	public String toString() {
		return "Id: " + id + " | Nombre: " + nombre + " | Apellidos: " + apellido1 + " " + apellido2
				+ " | Sexo: " + sexo + " | Alias: " + alias + " | Contraseña: " + contraseña + " | Correo:" + correo
				+ " | Fecha: " + fecha + " | Edad: " + edad + " | Ingresos: " + ingresos + " | Divorcios: " + divorcios
				+ " | Likes Recibidos: " + numlikerec + " | Likes Otorgados: " + numlikeot + " | Matches: " + nummact + " | Estado: "
				+ estado + " | Estatura:" + estatura;
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