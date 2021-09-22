package co.edu.unbosque.model.persistence;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmpleadosFile {
	
	private String rutaEmp = "./data/empleados.out";
	private ArrayList<EmpleadoDTO> empleados;
	
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	private ObjectInputStream in;
	private ObjectOutputStream out;

	public EmpleadosFile() {
		empleados = new ArrayList<>();
		
	}
	
	public void leerEmpleados() {
		f = new File(rutaEmp);
		try {
			in = new ObjectInputStream(new FileInputStream(rutaEmp));
			empleados = (ArrayList<EmpleadoDTO>) in.readObject();
			in.close();
		} catch (IOException |ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String escribirEmpleados() {
		String mensaje = "Empleados ingreasdos";
		EmpleadoDTO staff[] = new EmpleadoDTO[3];
		staff[0] = new EmpleadoDTO(0, "Enrique", "Iglesias", 453.00);
		empleados.add(new EmpleadoDTO(1, "Coronel", "Sanders", 999.00));
		try {
			out = new ObjectOutputStream(new FileOutputStream(rutaEmp));
			out.writeObject(empleados);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mensaje;
	}
	
	

}
