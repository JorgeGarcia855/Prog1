package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EmpleadoDAO;
import co.edu.unbosque.model.persistence.EmpleadoDTO;
import co.edu.unbosque.model.persistence.EmpleadosFile;

public class Empleados {

	private EmpleadosFile ef;
	private EmpleadoDAO eCrud;
	private EmpleadoDTO eGen;

	public Empleados() {
		ef = new EmpleadosFile();
		eCrud = new EmpleadoDAO();
		eGen = new EmpleadoDTO();
	}

	public EmpleadosFile getEf() {
		return ef;
	}

	public void setEf(EmpleadosFile ef) {
		this.ef = ef;
	}

	public EmpleadoDAO geteCrud() {
		return eCrud;
	}

	public void seteCrud(EmpleadoDAO eCrud) {
		this.eCrud = eCrud;
	}

	public EmpleadoDTO geteGen() {
		return eGen;
	}

	public void seteGen(EmpleadoDTO eGen) {
		this.eGen = eGen;
	}
	
}
