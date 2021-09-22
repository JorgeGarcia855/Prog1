package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class Nomina implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long cedula;
	private int horasTrabajadas;
	private String mes;
	
	public Nomina(long cedula, int horasTrabajadas, String mes) {
		this.cedula = cedula;
		this.horasTrabajadas = horasTrabajadas;
		this.mes = mes;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "Cedula:"+this.cedula+"\nHoras Trabajadas:"+this.horasTrabajadas+"\nMes:"+this.mes;
	}
	

}
