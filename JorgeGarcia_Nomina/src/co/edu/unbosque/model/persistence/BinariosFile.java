package co.edu.unbosque.model.persistence;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class BinariosFile {

	private String ruta = "./data/prueba.out";
	private String rutaReg = "./data/registro.out";
	private String rutaNom = "./data/nomina.out";
	private String rutaEmp = "./data/empleado.out";
	
	private int REGISTROS = 10;
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	private ObjectInputStream in;
	private ObjectOutputStream out;

	private int numeros[];
	private double valores[];
	private Registro[] datos;
	private Nomina[] datosNominas;
	private Id ced;
	private ArrayList<EmpleadoDTO> empleados;
	

	public int getREGISTROS() {
		return REGISTROS;
	}

	public void setREGISTROS(int rEGISTROS) {
		REGISTROS = rEGISTROS;
	}

	
	public double[] getValores() {
		return valores;
	}

	public void setValores(double[] valores) {
		this.valores = valores;
	}

	public BinariosFile() {
		numeros = new int[10];
		valores = new double[10];
		datos = new Registro[10];
		ced = new Id();
		empleados = new ArrayList<EmpleadoDTO>();
	}

	public String escribirArchivoBinario() {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File(ruta);
		Random r=new Random(); 
		try{     
			fos=new FileOutputStream(f);     
			dos=new DataOutputStream(fos);     
			for (int i=0;i<REGISTROS;i++){ 
				dos.writeInt(i);
				dos.writeDouble(r.nextDouble());
			}     
			dos.close();
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	public void leerArchivoBinario() {
		f = new File(ruta);
		try {
			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
			for (int i=0; i<REGISTROS ; i++){
				numeros[i] = dis.readInt();
				valores[i] = dis.readDouble();
			}
			dis.close();
		}
		catch(IOException e){     
			e.printStackTrace(); 
		} 
	}

	public String escribirRegistro() {
		String mensaje = "Registro de Empleado Ingresado!";
		Registro staff[] = new Registro[3];
		staff[0] = new Registro("Empleado apellido1", 23, 1000, ced.id1());
		staff[1] = new Registro("Empleado apellido2", 45, 4000, ced.id2());
		staff[2] = new Registro("Empleado apellido3", 37, 8000, ced.id3());
		try {
			out = new ObjectOutputStream(new FileOutputStream(rutaReg));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public void leerRegistro() {
		try {
			in = new ObjectInputStream(new FileInputStream(rutaReg));
	        datos = (Registro[])in.readObject();
	        in.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void leerNomina() {
		try {
			in = new ObjectInputStream(new FileInputStream(rutaNom));
			datosNominas = (Nomina[])in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String escribirNomina() {
		String mensaje = "Registro de Nomina ingresado!";
		datosNominas = new Nomina[3];
		datosNominas[0] = new Nomina(ced.id1(), 23, "Enero");
		datosNominas[1] = new Nomina(ced.id2(), 28, "Marzo");
		datosNominas[2] = new Nomina(ced.id3(), 34, "Agosto");
		try {
			out = new ObjectOutputStream(new FileOutputStream(rutaNom));
			out.writeObject(empleados);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mensaje;
	}
	
	public void leerEmpleados() {
		try {
			in = new ObjectInputStream(new FileInputStream(rutaEmp ));
			empleados = (ArrayList<EmpleadoDTO>) in.readObject();
			in.close();
		} catch (IOException |ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String escribirEmpleados() {
		String mensaje = "Empleados ingreasdos";
		empleados.add(new EmpleadoDTO(0, "Enrique", "Iglesias", 453.00));
		empleados.add(new EmpleadoDTO(1, "Coronel", "Sanders", 999.00));
		try {
			out = new ObjectOutputStream(new FileOutputStream(rutaEmp));
			out.writeObject(rutaEmp);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mensaje;
	}
	
	

	public ArrayList<EmpleadoDTO> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<EmpleadoDTO> empleados) {
		this.empleados = empleados;
	}

	public Registro[] getDatos() {
		return datos;
	}

	public void setDatos(Registro[] datos) {
		this.datos = datos;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public Nomina[] getDatosNominas() {
		return datosNominas;
	}

	public void setDatosNominas(Nomina[] datosNominas) {
		this.datosNominas = datosNominas;
	}

}
