package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class Registro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private int edad;
	private double salario;
	private int id;
	
	public Registro(String nombre, int edad, double salario, int id){
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public long getCedula() {
		return id;
	}

	public void setCedula(int id) {
		this.id = id;
	}
	
	
	public String toString() {
		return "Nombre:"+this.nombre+"\nEdad:"+this.edad+"\nSalario:"+this.salario+"\nCedula:"+this.id;
		
	}
}
