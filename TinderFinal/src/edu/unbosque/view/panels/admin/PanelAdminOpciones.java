package edu.unbosque.view.panels.admin;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelAdminOpciones extends JPanel {

	private JButton b_modnom, b_eliminar, b_modsexo, b_modedad, b_volver, b_salario, b_divorcios, b_numlike, b_estado;
	private JLabel lblNombre, lblEdad, lbleliminar, l_titulo, l_salrio, l_id, l_divorcios, l_numlikes, l_estado, l_sexo;
	private JTextField txtNombre, txtEdad, txteliminar, txtSalario, txtid, txtdivorcios, txtnumlikes, txtestado,
			txtsexo;

	public PanelAdminOpciones() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

		b_modnom = new JButton("Nombre");
		b_modnom.setBounds(356, 75, 100, 40);
		b_modnom.setBackground(Color.white);
		b_modnom.setActionCommand("MODNOM");
		add(b_modnom);

		b_eliminar = new JButton("Eliminar");
		b_eliminar.setActionCommand("ELIMINAR1");
		b_eliminar.setBackground(Color.white);
		b_eliminar.setBounds(580, 300, 100, 40);
		add(b_eliminar);

		b_modsexo = new JButton("Sexo");
		b_modsexo.setActionCommand("MODSEXO");
		b_modsexo.setBackground(Color.white);
		b_modsexo.setBounds(356, 177, 100, 40);
		add(b_modsexo);

		b_volver = new JButton("Volver");
		b_volver.setActionCommand("VOLVERADMINP");
		b_volver.setBackground(Color.white);
		b_volver.setBounds(800, 400, 100, 40);
		add(b_volver);

		b_modedad = new JButton("Edad");
		b_modedad.setActionCommand("MODEDAD");
		b_modedad.setBounds(356, 126, 100, 40);
		b_modedad.setBackground(Color.white);
		add(b_modedad);

		b_salario = new JButton("Salrio");
		b_salario.setActionCommand("MODSALARIO");
		b_salario.setBounds(800, 130, 100, 40);
		b_salario.setBackground(Color.white);
		add(b_salario);

		b_divorcios = new JButton("Divorcios");
		b_divorcios.setActionCommand("MODIVORCIOS");
		b_divorcios.setBounds(800, 180, 100, 40);
		b_divorcios.setBackground(Color.white);
		add(b_divorcios);

		b_numlike = new JButton("Likes");
		b_numlike.setActionCommand("MODNUMLIKES");
		b_numlike.setBounds(800, 231, 100, 40);
		b_numlike.setBackground(Color.white);
		add(b_numlike);

		b_estado = new JButton("ESTADO");
		b_estado.setActionCommand("MODESTADO");
		b_estado.setBounds(356, 228, 100, 40);
		b_estado.setBackground(Color.white);
		add(b_estado);

		l_titulo = new JLabel("OPCIONES ADMINISTRADOR");
		l_titulo.setFont(new Font("Algerian", 20, 40));
		l_titulo.setBounds(250, 15, 500, 45);
		add(l_titulo);

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Calibri", 20, 30));
		lblNombre.setBounds(10, 70, 250, 40);
		add(lblNombre);

		lbleliminar = new JLabel("Eliminar,digite Id:");
		lbleliminar.setFont(new Font("Calibri", 20, 30));
		lbleliminar.setBounds(120, 300, 400, 40);
		add(lbleliminar);

		lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Calibri", 20, 30));
		lblEdad.setBounds(10, 123, 250, 40);
		add(lblEdad);

		l_salrio = new JLabel("Salario");
		l_salrio.setFont(new Font("Calibri", 20, 30));
		l_salrio.setBounds(475, 123, 250, 40);
		add(l_salrio);

		l_id = new JLabel("Id");
		l_id.setFont(new Font("Calibri", 20, 30));
		l_id.setBounds(480, 70, 250, 40);
		add(l_id);

		l_sexo = new JLabel("Sexo");
		l_sexo.setFont(new Font("Calibri", 20, 30));
		l_sexo.setBounds(10, 176, 250, 40);
		add(l_sexo);

		l_divorcios = new JLabel("Divorcios");
		l_divorcios.setFont(new Font("Calibri", 20, 30));
		l_divorcios.setBounds(475, 176, 400, 40);
		add(l_divorcios);

		l_numlikes = new JLabel("Likes");
		l_numlikes.setFont(new Font("Calibri", 20, 30));
		l_numlikes.setBounds(475, 229, 400, 40);
		add(l_numlikes);

		l_estado = new JLabel("Estado");
		l_estado.setFont(new Font("Calibri", 20, 30));
		l_estado.setBounds(10, 229, 250, 40);
		add(l_estado);

		txtNombre = new JTextField("");
		txtNombre.setBounds(140, 79, 200, 30);
		txtNombre.setBorder(new LineBorder(null));
		add(txtNombre);

		txtEdad = new JTextField("");
		txtEdad.setBounds(140, 130, 200, 30);
		txtEdad.setBorder(new LineBorder(null));
		add(txtEdad);

		txtsexo = new JTextField("");
		txtsexo.setBounds(140, 181, 200, 30);
		txtsexo.setBorder(new LineBorder(null));
		add(txtsexo);

		txteliminar = new JTextField("");
		txteliminar.setBounds(350, 300, 200, 30);
		txteliminar.setBorder(new LineBorder(null));
		add(txteliminar);

		txtSalario = new JTextField("");
		txtSalario.setBounds(605, 130, 175, 30);
		txtSalario.setBorder(new LineBorder(null));
		add(txtSalario);

		txtid = new JTextField("");
		txtid.setBounds(605, 75, 175, 30);
		txtid.setBorder(new LineBorder(null));
		add(txtid);

		txtdivorcios = new JTextField("");
		txtdivorcios.setBounds(605, 185, 175, 30);
		txtdivorcios.setBorder(new LineBorder(null));
		add(txtdivorcios);

		txtnumlikes = new JTextField("");
		txtnumlikes.setBounds(605, 240, 175, 30);
		txtnumlikes.setBorder(new LineBorder(null));
		add(txtnumlikes);

		txtestado = new JTextField("");
		txtestado.setBounds(140, 232, 200, 30);
		txtestado.setBorder(new LineBorder(null));
		add(txtestado);

	}

	public JButton getB_modnom() {
		return b_modnom;
	}

	public void setB_modnom(JButton b_modnom) {
		this.b_modnom = b_modnom;
	}

	public JButton getB_eliminar() {
		return b_eliminar;
	}

	public void setB_eliminar(JButton b_eliminar) {
		this.b_eliminar = b_eliminar;
	}

	public JButton getB_modsexo() {
		return b_modsexo;
	}

	public void setB_modsexo(JButton b_modsexo) {
		this.b_modsexo = b_modsexo;
	}

	public JButton getB_modedad() {
		return b_modedad;
	}

	public void setB_modedad(JButton b_modedad) {
		this.b_modedad = b_modedad;
	}

	public JButton getB_volver() {
		return b_volver;
	}

	public void setB_volver(JButton b_volver) {
		this.b_volver = b_volver;
	}

	public JButton getB_salario() {
		return b_salario;
	}

	public void setB_salario(JButton b_salario) {
		this.b_salario = b_salario;
	}

	public JButton getB_divorcios() {
		return b_divorcios;
	}

	public void setB_divorcios(JButton b_divorcios) {
		this.b_divorcios = b_divorcios;
	}

	public JButton getB_numlike() {
		return b_numlike;
	}

	public void setB_numlike(JButton b_numlike) {
		this.b_numlike = b_numlike;
	}

	public JButton getB_estado() {
		return b_estado;
	}

	public void setB_estado(JButton b_estado) {
		this.b_estado = b_estado;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JTextField getTxteliminar() {
		return txteliminar;
	}

	public void setTxteliminar(JTextField txteliminar) {
		this.txteliminar = txteliminar;
	}

	public JTextField getTxtSalario() {
		return txtSalario;
	}

	public void setTxtSalario(JTextField txtSalario) {
		this.txtSalario = txtSalario;
	}

	public JTextField getTxtid() {
		return txtid;
	}

	public void setTxtid(JTextField txtid) {
		this.txtid = txtid;
	}

	public JTextField getTxtdivorcios() {
		return txtdivorcios;
	}

	public void setTxtdivorcios(JTextField txtdivorcios) {
		this.txtdivorcios = txtdivorcios;
	}

	public JTextField getTxtnumlikes() {
		return txtnumlikes;
	}

	public void setTxtnumlikes(JTextField txtnumlikes) {
		this.txtnumlikes = txtnumlikes;
	}

	public JTextField getTxtestado() {
		return txtestado;
	}

	public void setTxtestado(JTextField txtestado) {
		this.txtestado = txtestado;
	}

	public JTextField getTxtsexo() {
		return txtsexo;
	}

	public void setTxtsexo(JTextField txtsexo) {
		this.txtsexo = txtsexo;
	}

}
