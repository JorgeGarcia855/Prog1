package co.edu.unbosque.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import co.edu.unbosque.controller.Controller;

public class VentanaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;

	private PanelPrincipal panelEntrada; 

	public VentanaPrincipal(Controller control) {
		setSize(350,100); 
		setResizable(false); 
		setTitle("JFreeChart"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 

		setLayout( new BorderLayout() );
	
		panelEntrada = new PanelPrincipal();
		add(panelEntrada,BorderLayout.CENTER);

		panelEntrada.getbChart().addActionListener(control);
	}

	public PanelPrincipal getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelPrincipal panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	
	
}
