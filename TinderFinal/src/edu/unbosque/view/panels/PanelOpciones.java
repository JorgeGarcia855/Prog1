package edu.unbosque.view.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PanelOpciones extends JPanel {

	private JRadioButton br_hombre, br_mujer;
	private ButtonGroup bg_sexos;
	private JButton b_continuar, b_volverprincipal;
	private JLabel jltitulo, jltitulo1;
	private JTextArea jedad;
	private JSpinner jdias, jmeses, jaños;
	private SpinnerModel smdias, smmeses, smaños;
	private String fechanacimiento;

	public PanelOpciones() {
		setLayout(null);
		inicializarComponentes();

	}

	public void inicializarComponentes() {

		setBorder(new LineBorder(Color.darkGray));

		jltitulo = new JLabel("Selecciona tu fecha de nacimiento:");
		jltitulo.setForeground(Color.black);
		jltitulo.setFont(new Font("Times new roman", 15, 15));
		jltitulo.setBounds(120, 10, 264, 45);
		add(jltitulo);

		jedad = new JTextArea("");
		jedad.setBounds(110, 50, 240, 40);
		jedad.setBorder(new LineBorder(null));
		jedad.setFont(jedad.getFont().deriveFont(25f));
		jedad.setEditable(false);
		add(jedad);

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Obtubre", "Noviembre", "Diciembre" };

		String años = String.valueOf(java.time.Year.now());
		int años1 = Integer.parseInt(años);

		smdias = new SpinnerNumberModel(1, 1, 31, 1);
		smmeses = new SpinnerListModel(meses);
		smaños = new SpinnerNumberModel(años1, años1 - 100, años1, 1);

		jdias = new JSpinner(smdias);
		jmeses = new JSpinner(smmeses);
		jaños = new JSpinner(smaños);

		jdias.setBounds(110, 105, 60, 40);
		jmeses.setBounds(194, 105, 85, 40);
		jaños.setBounds(300, 105, 60, 40);

		jdias.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				fechanacimiento = String.valueOf(jdias.getValue() + "/" + jmeses.getValue() + "/" + jaños.getValue());
				jedad.setText(fechanacimiento);

			}
		});

		jmeses.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				fechanacimiento = String.valueOf(jdias.getValue() + "/" + jmeses.getValue() + "/" + jaños.getValue());
				jedad.setText(fechanacimiento);

			}
		});

		jaños.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				fechanacimiento = String.valueOf(jdias.getValue() + "/" + jmeses.getValue() + "/" + jaños.getValue());
				jedad.setText(fechanacimiento);

			}
		});
		add(jdias);
		add(jmeses);
		add(jaños);

		JFormattedTextField editardias = ((JSpinner.DefaultEditor) jdias.getEditor()).getTextField();
		editardias.setEditable(false);
		editardias.setBackground(Color.white);

		JFormattedTextField editarmeses = ((JSpinner.DefaultEditor) jmeses.getEditor()).getTextField();
		editarmeses.setEditable(false);
		editarmeses.setBackground(Color.white);

		JFormattedTextField editaraños = ((JSpinner.DefaultEditor) jaños.getEditor()).getTextField();
		editaraños.setEditable(false);
		editaraños.setBackground(Color.white);

		jltitulo1 = new JLabel("Selecciona tu sexo:");
		jltitulo1.setForeground(Color.black);
		jltitulo1.setFont(new Font("Times new roman", 15, 15));
		jltitulo1.setBounds(120, 150, 264, 45);
		add(jltitulo1);

		bg_sexos = new ButtonGroup();

		br_hombre = new JRadioButton("HOMBRE");
		br_hombre.setBackground(Color.LIGHT_GRAY);
		br_hombre.setActionCommand("HOMBRE");
		br_hombre.setBounds(150, 200, 80, 50);

		br_mujer = new JRadioButton("MUJER");
		br_mujer.setBackground(Color.lightGray);
		br_mujer.setActionCommand("MUJER");
		br_mujer.setBounds(240, 200, 80, 50);

		bg_sexos.add(br_hombre);
		bg_sexos.add(br_mujer);

		add(br_hombre);
		add(br_mujer);

		b_continuar = new JButton("Continuar");
		b_continuar.setBackground(Color.lightGray);
		b_continuar.setActionCommand("CONTINUAR");
		b_continuar.setBounds(190, 270, 90, 40);
		add(b_continuar);

		b_volverprincipal = new JButton("Volver");
		b_volverprincipal.setBackground(Color.white);
		b_volverprincipal.setActionCommand("VOLVERPRINCIPAL");
		b_volverprincipal.setBounds(370, 300, 90, 40);
		add(b_volverprincipal);

	}

	public JSpinner getJdias() {
		return jdias;
	}

	public void setJdias(JSpinner jdias) {
		this.jdias = jdias;
	}

	public JSpinner getJmeses() {
		return jmeses;
	}

	public void setJmeses(JSpinner jmeses) {
		this.jmeses = jmeses;
	}

	public JSpinner getJaños() {
		return jaños;
	}

	public void setJaños(JSpinner jaños) {
		this.jaños = jaños;
	}

	public JRadioButton getBr_hombre() {
		return br_hombre;
	}

	public void setBr_hombre(JRadioButton br_hombre) {
		this.br_hombre = br_hombre;
	}

	public JRadioButton getBr_mujer() {
		return br_mujer;
	}

	public void setBr_mujer(JRadioButton br_mujer) {
		this.br_mujer = br_mujer;
	}

	public JButton getB_continuar() {
		return b_continuar;
	}

	public void setB_continuar(JButton b_continuar) {
		this.b_continuar = b_continuar;
	}

	public JTextArea getJedad() {
		return jedad;
	}

	public void setJedad(JTextArea jedad) {
		this.jedad = jedad;
	}

	public JButton getB_volverprincipal() {
		return b_volverprincipal;
	}

	public void setB_volverprincipal(JButton b_volverprincipal) {
		this.b_volverprincipal = b_volverprincipal;
	}
	

}
