package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class EmpleadoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private double salario;
	private String nombre, apellido;
	
	public EmpleadoDTO(){
		super();
	}

	public EmpleadoDTO(int id, String nombre, String apellido, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Id: "+this.getId()+"\nNombre: "+this.getNombre()+"\nApellido: "+this.getApellido()+"\nSalario: "+ this.getSalario();
	}
}
