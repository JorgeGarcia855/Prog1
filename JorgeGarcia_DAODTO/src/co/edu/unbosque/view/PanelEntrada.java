package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNumero;
	private JButton inEmpleado, outEmpleado;
	public static final String ESCRIBIR_E = "EscribirE";
	public static final String LEER_E = "LeerE";
	
	public PanelEntrada() {
		setLayout( new GridLayout(4,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Archivos Binarios");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labEntrada = new JLabel("Digite un Valor");
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		
		inEmpleado = new JButton("Escribir Empleado");
		inEmpleado.setActionCommand(ESCRIBIR_E);
		
		outEmpleado = new JButton("Leer Empleado");
		outEmpleado.setActionCommand(LEER_E);
		add(inEmpleado);
		add(outEmpleado);
	}

	public JButton getInEmpleado() {
		return inEmpleado;
	}

	public void setInEmpleado(JButton inEmpleado) {
		this.inEmpleado = inEmpleado;
	}

	public JButton getOutEmpleado() {
		return outEmpleado;
	}

	public void setOutEmpleado(JButton outEmpleado) {
		this.outEmpleado = outEmpleado;
	}

	public static String getEscribirE() {
		return ESCRIBIR_E;
	}

	public static String getLeerE() {
		return LEER_E;
	}
	
}
