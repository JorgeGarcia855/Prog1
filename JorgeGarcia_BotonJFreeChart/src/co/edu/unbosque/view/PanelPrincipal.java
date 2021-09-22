package co.edu.unbosque.view;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelPrincipal extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JButton bChart;
	public static final String CHART = "Convertir";
	
	public PanelPrincipal() {
		setLayout( new GridLayout(1,1) );
		labEntrada = new JLabel("Boton JFreeChart");
		bChart = new JButton("Pie Chart");
		bChart.setActionCommand(CHART);
		add(labEntrada);
		add(new JLabel(""));
		add(bChart);
	}
	
	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}


	public JButton getbChart() {
		return bChart;
	}

	public void setbChart(JButton butConvertir) {
		this.bChart = butConvertir;
	}


	public static String getConvertir() {
		return CHART;
	}
	
}
