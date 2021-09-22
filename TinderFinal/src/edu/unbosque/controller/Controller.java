package edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

import javax.mail.MessagingException;
import javax.mail.SendFailedException;


import edu.unbosque.model.*;
import edu.unbosque.model.persistence.HombresDao;
import edu.unbosque.model.persistence.MujeresDao;
import edu.unbosque.model.persistence.OperacionArchivo;
import edu.unbosque.model.persistence.PersonasDao;
import edu.unbosque.view.windows.VentanaPerfil;
import edu.unbosque.view.windows.VentanaPrincipal;
import edu.unbosque.view.windows.admin.VentanaAdminEliminar;
import edu.unbosque.view.windows.admin.VentanaAdminOpciones;
import edu.unbosque.view.windows.admin.VentanaAdminPrincipal;
import edu.unbosque.view.windows.admin.VentanaAdminTop;
import edu.unbosque.view.windows.VentanaInicioSesion;
import edu.unbosque.view.windows.admin.VentanaInicioSesionAdmin;
import edu.unbosque.view.windows.VentanaInscripcionHombres;
import edu.unbosque.view.windows.VentanaInscripcionMujer;
import edu.unbosque.view.windows.VentanaOpciones;

public class Controller implements ActionListener {

	private VentanaAdminPrincipal vadprincipal;
	private VentanaAdminEliminar vadeliminar;
	private VentanaAdminTop vadtop;
	private VentanaInicioSesion viniciosesion;
	private VentanaInicioSesionAdmin viniciosesionadmin;
	private VentanaInscripcionHombres vinscripsionhombres;
	private VentanaInscripcionMujer vinscripsionmujer;
	private VentanaPerfil vperfil;
	private VentanaPrincipal vprincipal;
	private VentanaOpciones vopciones;
	private VentanaAdminOpciones vopadmin;
	private String sexo;
	private String fecha;
	private String idperfil;
	private String aliasperfil;

	public Controller() throws ClassNotFoundException{
		vadprincipal = new VentanaAdminPrincipal();
		vadeliminar = new VentanaAdminEliminar();
		vadtop = new VentanaAdminTop();
		viniciosesion = new VentanaInicioSesion();
		viniciosesionadmin = new VentanaInicioSesionAdmin();
		vinscripsionhombres = new VentanaInscripcionHombres();
		vinscripsionmujer = new VentanaInscripcionMujer();
		vperfil = new VentanaPerfil();
		vprincipal = new VentanaPrincipal();
		vopciones = new VentanaOpciones();
		vopadmin = new VentanaAdminOpciones();
		System.out.println(OperacionArchivo.obtener());
		asignarOyentes();

		if (OperacionArchivo.obtener() == null) {

			PersonasDao.obtenerDatosCsv();
		}

	}

	public void asignarOyentes() {

		vprincipal.getPrincipal().getB_admin().addActionListener(this);
		vprincipal.getPrincipal().getB_inscribirse().addActionListener(this);
		vprincipal.getPrincipal().getB_inicio().addActionListener(this);

		vadprincipal.getAdminprincipal().getB_eliminar().addActionListener(this);
		vadprincipal.getAdminprincipal().getB_estadisticas().addActionListener(this);
		vadprincipal.getAdminprincipal().getB_top().addActionListener(this);
		vadprincipal.getAdminprincipal().getB_volverprincipal().addActionListener(this);

		vadeliminar.getEliminar().getB_crood().addActionListener(this);
		vadeliminar.getEliminar().getB_buscar().addActionListener(this);
		vadeliminar.getEliminar().getB_generar().addActionListener(this);
		vadeliminar.getEliminar().getB_volveradmina().addActionListener(this);
		vadeliminar.getEliminar().getbFiltAsc().addActionListener(this);
		vadeliminar.getEliminar().getbFiltDes().addActionListener(this);
		vadeliminar.getEliminar().getbFiltGen().addActionListener(this);
		vadeliminar.getEliminar().getbMostIngr().addActionListener(this);

		vadtop.getPadmintop().getB_volver().addActionListener(this);

		viniciosesion.getPanelInicioSesion().getB_entrar().addActionListener(this);
		viniciosesion.getPanelInicioSesion().getB_volverinicio().addActionListener(this);

		viniciosesionadmin.getPanelInicioSesionadmin().getB_entrar().addActionListener(this);
		viniciosesionadmin.getPanelInicioSesionadmin().getB_volverinicio().addActionListener(this);

		vinscripsionhombres.getPhombres().getB_verificar().addActionListener(this);
		vinscripsionhombres.getPhombres().getBr_Disponible().addActionListener(this);
		vinscripsionhombres.getPhombres().getB_volverfecha().addActionListener(this);

		vinscripsionmujer.getPmujeres().getB_verificar().addActionListener(this);
		vinscripsionmujer.getPmujeres().getBr_Disponible().addActionListener(this);
		vinscripsionmujer.getPmujeres().getB_volverfecha().addActionListener(this);

		vopciones.getPopciones().getBr_hombre().addActionListener(this);
		vopciones.getPopciones().getBr_mujer().addActionListener(this);
		vopciones.getPopciones().getB_continuar().addActionListener(this);
		vopciones.getPopciones().getB_volverprincipal().addActionListener(this);

		vperfil.getPperfil().getB_cerrarsesion().addActionListener(this);
		vperfil.getPperfil().getB_megusta().addActionListener(this);
		vperfil.getPperfil().getB_siguiente().addActionListener(this);
		vperfil.getPperfil().getJcescoger().addActionListener(this);

		vopadmin.getpOpcionesAdmin().getB_modnom().addActionListener(this);
		vopadmin.getpOpcionesAdmin().getB_eliminar().addActionListener(this);
		vopadmin.getpOpcionesAdmin().getB_modsexo().addActionListener(this);
		vopadmin.getpOpcionesAdmin().getB_modedad().addActionListener(this);
		vopadmin.getpOpcionesAdmin().getB_volver().addActionListener(this);
		vopadmin.getpOpcionesAdmin().getB_salario().addActionListener(this);
		vopadmin.getpOpcionesAdmin().getB_divorcios().addActionListener(this);
		vopadmin.getpOpcionesAdmin().getB_numlike().addActionListener(this);
		vopadmin.getpOpcionesAdmin().getB_estado().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("ELIMINAR")) {
			vadprincipal.setVisible(false);
			vadeliminar.setVisible(true);

		} else if (arg0.getActionCommand().equals("VADMIN")) {
			vadprincipal.setVisible(true);
			vadeliminar.setVisible(false);
			vadtop.setVisible(false);

		} else if (arg0.getActionCommand().equals("TOP")) {
			vadprincipal.setVisible(false);
			vadtop.setVisible(true);
			vadtop.getPadmintop().getJusuario().setText(Filtrado.mostrarTop10());

		} else if (arg0.getActionCommand().equals("INICIO")) {
			vprincipal.setVisible(false);
			viniciosesion.setVisible(true);

		} else if (arg0.getActionCommand().equals("INSCRIBIRSE")) {
			vprincipal.setVisible(false);
			vopciones.setVisible(true);

		} else if (arg0.getActionCommand().equals("ADMIN")) {
			vprincipal.setVisible(false);
			viniciosesionadmin.setVisible(true);

		} else if (arg0.getActionCommand().equals("VOLVERADMINP")) {
			vprincipal.setVisible(false);
			vopadmin.setVisible(false);
			vadprincipal.setVisible(true);

		} else if (arg0.getActionCommand().equals("MODUSUARIOS")) {
			vprincipal.setVisible(false);
			vadprincipal.setVisible(false);
			vadeliminar.setVisible(false);
			vopadmin.setVisible(true);

		} else if (arg0.getActionCommand().equals("CONTINUAR")) {

			int edad = (int) vopciones.getPopciones().getJaños().getValue();
			int dias;
			boolean aux = false;

			if (vopciones.getPopciones().getJmeses().getValue() == "Abril"
					|| vopciones.getPopciones().getJmeses().getValue() == "Junio"
					|| vopciones.getPopciones().getJmeses().getValue() == "Septiembre"
					|| vopciones.getPopciones().getJmeses().getValue() == "Noviembre") {

				dias = 30;
				if ((int) vopciones.getPopciones().getJdias().getValue() <= dias) {

					vopciones.mostrarMensaje(SeccionOpciones.CalcularEdad(edad));

					aux = true;
				} else {
					vopciones.mostrarMensaje("La fecha es incorrecta");
				}

			} else if (vopciones.getPopciones().getJmeses().getValue() == "Febrero") {

				dias = 28;
				if ((int) vopciones.getPopciones().getJdias().getValue() <= dias) {

					vopciones.mostrarMensaje(SeccionOpciones.CalcularEdad(edad));
					aux = true;

				} else {
					vopciones.mostrarMensaje("La fecha es incorrecta");
				}
			} else {

				vopciones.mostrarMensaje(SeccionOpciones.CalcularEdad(edad));
				aux = true;

			}

			if (aux && SeccionOpciones.CalcularEdad(edad).equals("Fecha validada correctamente")) {

				if (vopciones.getPopciones().getBr_hombre().isSelected()) {
					vinscripsionhombres.setVisible(true);
					vopciones.setVisible(false);
					sexo = "H";

				} else if (vopciones.getPopciones().getBr_mujer().isSelected()) {
					vinscripsionmujer.setVisible(true);
					vopciones.setVisible(false);
					sexo = "M";
				}
				fecha = vopciones.getPopciones().getJedad().getText();

			}

		}

		else if (arg0.getActionCommand().equals("ENTRAR")) {

			aliasperfil = viniciosesion.getPanelInicioSesion().getJf_alias().getText();
			String contraseña = viniciosesion.getPanelInicioSesion().getJf_contraseña().getText();
			try {

				if (!aliasperfil.equals("") && !contraseña.equals("")) {

					PersonasDao.buscarPersona(aliasperfil);
					if (PersonasDao.buscarPersona(aliasperfil) != null) {
						if (PersonasDao.buscarPersona(aliasperfil).getContraseña().equals(contraseña)) {

							vperfil.setVisible(true);
							viniciosesion.setVisible(false);
							vperfil.getPperfil().getJperfil()
									.setText("            MI PERFIL\n" + "Username: " + aliasperfil + "\nEstado: "
											+ PersonasDao.buscarPersona(aliasperfil).getEstado()
											+ "\n Número de likes : "
											+ PersonasDao.buscarPersona(aliasperfil).getNumlikeot() + 1);
						} else {
							viniciosesion.mostrarMensaje("Usuario o contraseña incorrectos por favor verifiquelos");
						}
					} else {
						viniciosesion.mostrarMensaje("Usuario no registrado ");
					}
				} else {
					viniciosesion.mostrarMensaje("Por favor escriba su usuario y contraseña");

				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else if (arg0.getActionCommand().equals("VERIFICAR")) {
			String estado;
			int edad = SeccionOpciones.getEdad();
			try {

				if (vinscripsionmujer.getPmujeres().getBr_Disponible().isSelected()) {
					estado = "Disponible";
				} else {
					estado = "Inactivo";

				}
				if (vinscripsionmujer.getPmujeres().getJcorreo().getText().isEmpty()
						|| vinscripsionmujer.getPmujeres().getJnombrecompleto().getText().isEmpty()
						|| vinscripsionmujer.getPmujeres().getJalias().getText().isEmpty()
						|| vinscripsionmujer.getPmujeres().getJdivorcios().getText().isEmpty()
						|| vinscripsionmujer.getPmujeres().getJapellido2().getText().isEmpty()
						|| vinscripsionmujer.getPmujeres().getJlapellido1().getText().isEmpty()) {

					vinscripsionmujer.mostrarMensaje("Es necesario llenar todos los campos");

				} else {
					MujeresDao.agregar(String.valueOf(MujeresDao.generarnuevoId()),
							vinscripsionmujer.getPmujeres().getJnombrecompleto().getText(),
							vinscripsionmujer.getPmujeres().getJapellido1().getText(),
							vinscripsionmujer.getPmujeres().getJapellido2().getText(), sexo,
							vinscripsionmujer.getPmujeres().getJalias().getText(), Operaciones.getPassword(),
							vinscripsionmujer.getPmujeres().getJcorreo().getText(), fecha, String.valueOf(edad),
							vinscripsionmujer.getPmujeres().getJdivorcios().getText(), Operaciones.likes(),
							Operaciones.likes(), Operaciones.mathches(), estado,
							vinscripsionmujer.getPmujeres().getJestatura().getText());

					try {
						MailSenderAuth.setupServerProperties();

						MailSenderAuth.draftEmail(vinscripsionmujer.getPmujeres().getJcorreo().getText(),
								vinscripsionmujer.getPmujeres().getJalias().getText(),
								PersonasDao.buscarPersona(vinscripsionmujer.getPmujeres().getJalias().getText())
										.getContraseña());
						MailSenderAuth.sendEmail();

						vprincipal.setVisible(false);
						vopciones.setVisible(false);
						vinscripsionmujer.setVisible(false);
						vperfil.setVisible(true);
					} catch (SendFailedException e) {

						vinscripsionmujer.mostrarMensaje(
								"¡Su correo no fue encontrado! , no podrá recibir notificaciones de Bostinder");
						vinscripsionmujer
								.mostrarMensaje("Su alias es: " + vinscripsionmujer.getPmujeres().getJalias().getText()
										+ "\nSu contraseña es: " + Operaciones.getPassword());
						vprincipal.setVisible(false);
						vopciones.setVisible(false);
						vinscripsionhombres.setVisible(false);
						vperfil.setVisible(true);
					}

				}

			}

			catch (ClassNotFoundException | MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (arg0.getActionCommand().equals("VERIFICARHOMBRES")) {
			String estado;
			int edad = SeccionOpciones.getEdad();
			try {

				if (vinscripsionhombres.getPhombres().getBr_Disponible().isSelected()) {
					estado = "Disponible";
				} else {
					estado = "Inactivo";

				}
				if (vinscripsionhombres.getPhombres().getJcorreo().getText().isEmpty()
						|| vinscripsionhombres.getPhombres().getJnombrecompleto().getText().isEmpty()
						|| vinscripsionhombres.getPhombres().getJalias().getText().isEmpty()
						|| vinscripsionhombres.getPhombres().getJingresosmes().getText().isEmpty()
						|| vinscripsionhombres.getPhombres().getJapellido2().getText().isEmpty()
						|| vinscripsionhombres.getPhombres().getJlapellido1().getText().isEmpty()
						|| vinscripsionhombres.getPhombres().getJestatura().getText().isEmpty()) {

					vinscripsionhombres.mostrarMensaje("Es necesario llenar todos los campos");



				} else {
					HombresDao.agregarHombre(String.valueOf(MujeresDao.generarnuevoId()),
							vinscripsionhombres.getPhombres().getJnombrecompleto().getText(),
							vinscripsionhombres.getPhombres().getJapellido1().getText(),
							vinscripsionhombres.getPhombres().getJapellido2().getText(), sexo,
							vinscripsionhombres.getPhombres().getJalias().getText(), Operaciones.getPassword(),
							vinscripsionhombres.getPhombres().getJcorreo().getText(), fecha, String.valueOf(edad),
							vinscripsionhombres.getPhombres().getJingresosmes().getText(), Operaciones.likes(),
							Operaciones.likes(), Operaciones.mathches(), estado,
							vinscripsionhombres.getPhombres().getJestatura().getText());

					try {
						MailSenderAuth.setupServerProperties();

						MailSenderAuth.draftEmail(vinscripsionhombres.getPhombres().getJcorreo().getText(),
								vinscripsionhombres.getPhombres().getJalias().getText(),
								PersonasDao
										.buscarPersona(vinscripsionhombres.getPhombres().getJalias().getText())
										.getContraseña());
						MailSenderAuth.sendEmail();
						vprincipal.setVisible(false);
						vopciones.setVisible(false);
						vinscripsionhombres.setVisible(false);
						vperfil.setVisible(true);
					} catch (SendFailedException e) {

						vinscripsionhombres.mostrarMensaje(
								"¡Su correo no fue encontrado! , no podrá recibir notificaciones de Bostinder");
						vinscripsionhombres.mostrarMensaje(
								"Su alias es: " + vinscripsionhombres.getPhombres().getJalias().getText()
										+ "\nSu contraseña es: " + Operaciones.getPassword());
						vprincipal.setVisible(false);
						vopciones.setVisible(false);
						vinscripsionhombres.setVisible(false);
						vperfil.setVisible(true);
					}

				}

			}

			catch (ClassNotFoundException | MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (arg0.getActionCommand().equals("SIGUIENTE")) {

			double random;
			boolean aux = false;
			try {
				vperfil.getPperfil().getJmostrarperfil().setText("");
				if (vperfil.getPperfil().getJcescoger().getSelectedItem() == "Mujeres") {
					do {
						random = (int) (Math.random() * Objects.requireNonNull(OperacionArchivo.obtener()).size() + 1);
						int numero = (int) random;
						idperfil = String.valueOf(numero);
						System.out.println(MujeresDao.buscarMujer(idperfil));
						if (MujeresDao.buscarMujer(idperfil) != null) {
							vperfil.getPperfil().getJmostrarperfil().setText("Nombre: "
									+ MujeresDao.buscarMujer(idperfil).getNombre() + "\nPrimer apellido: "
									+ MujeresDao.buscarMujer(idperfil).getApellido1() + "\nSegundo apellido: "
									+ MujeresDao.buscarMujer(idperfil).getApellido2() + "\nEdad: "
									+ MujeresDao.buscarMujer(idperfil).getEdad() + "\nEstado:"
									+ MujeresDao.buscarMujer(idperfil).getEstado() + "\nNúmero de likes : "
									+ PersonasDao.obtenerInformacionDadoId(idperfil).getNumlikerec() + 1);
							System.out.println(idperfil);
							aux = true;
						}
					} while (!aux);
				} else if ((vperfil.getPperfil().getJcescoger().getSelectedItem() == "Hombres")) {

					do {
						random = (int) (Math.random() * Objects.requireNonNull(OperacionArchivo.obtener()).size() + 1);
						int numero = (int) random;
						idperfil = String.valueOf(numero);
						System.out.println(HombresDao.buscarHombre(idperfil));
						if (HombresDao.buscarHombre(idperfil) != null) {
							vperfil.getPperfil().getJmostrarperfil().setText("Nombre: "
									+ HombresDao.buscarHombre(idperfil).getNombre() + "\nPrimer apellido: "
									+ HombresDao.buscarHombre(idperfil).getApellido1() + "\nSegundo apellido: "
									+ HombresDao.buscarHombre(idperfil).getApellido2() + "\nEdad: "
									+ HombresDao.buscarHombre(idperfil).getEdad() + "\nEstado:"
									+ HombresDao.buscarHombre(idperfil).getEstado() + "\nNúmero de likes : "
									+ PersonasDao.obtenerInformacionDadoId(idperfil).getNumlikerec() + 1);
							System.out.println(idperfil);
							aux = true;
						}
					} while (!aux);

				}

				else {
					random = (int) (Math.random() * Objects.requireNonNull(OperacionArchivo.obtener()).size() + 1);
					int numero = (int) random;
					idperfil = String.valueOf(numero);
					System.out.println(PersonasDao.obtenerInformacionDadoId(idperfil));
					vperfil.getPperfil().getJmostrarperfil().setText("Nombre: "
							+ PersonasDao.obtenerInformacionDadoId(idperfil).getNombre() + "\nPrimer apellido: "
							+ PersonasDao.obtenerInformacionDadoId(idperfil).getApellido1()
							+ "\nSegundo apellido: "
							+ PersonasDao.obtenerInformacionDadoId(idperfil).getApellido2() + "\nEdad: "
							+ PersonasDao.obtenerInformacionDadoId(idperfil).getEdad() + "\nEstado:"
							+ PersonasDao.obtenerInformacionDadoId(idperfil).getEstado());
					System.out.println(idperfil);
				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (arg0.getActionCommand().equals("CERRAR")) {
			viniciosesion.getPanelInicioSesion().getJf_alias().setText("");
			viniciosesion.getPanelInicioSesion().getJf_contraseña().setText("");
			vperfil.getPperfil().getJmostrarperfil().setText(
					"¡Bienvenido a Bostinder! \n\nPara comenzar tu experiencia por favor\nPresiona el boton siguiente usuario. ");

			vperfil.getPperfil().getJperfil().setText("¡HOLA!\nUsuario nuevo");
			vperfil.setVisible(false);
			viniciosesion.setVisible(true);

			vinscripsionmujer.getPmujeres().getJnombrecompleto().setText("");
			vinscripsionmujer.getPmujeres().getJalias().setText("");
			vinscripsionmujer.getPmujeres().getJdivorcios().setText("");
			vinscripsionmujer.getPmujeres().getJapellido2().setText("");
			vinscripsionmujer.getPmujeres().getJapellido1().setText("");
			vinscripsionmujer.getPmujeres().getJcorreo().setText("");
			vinscripsionmujer.getPmujeres().getJestatura().setText("");

			vinscripsionhombres.getPhombres().getJnombrecompleto().setText("");
			vinscripsionhombres.getPhombres().getJalias().setText("");
			vinscripsionhombres.getPhombres().getJingresosmes().setText("");
			vinscripsionhombres.getPhombres().getJapellido2().setText("");
			vinscripsionhombres.getPhombres().getJapellido1().setText("");
			vinscripsionhombres.getPhombres().getJcorreo().setText("");
			vinscripsionhombres.getPhombres().getJestatura().setText("");
			aliasperfil = null;
			idperfil = null;
		}

		else if (arg0.getActionCommand().equals("VOLVERINICIO")) {
			vprincipal.setVisible(true);
			viniciosesion.setVisible(false);
			viniciosesion.getPanelInicioSesion().getJf_alias().setText("");
			viniciosesion.getPanelInicioSesion().getJf_contraseña().setText("");
			viniciosesionadmin.setVisible(false);
		}

		else if (arg0.getActionCommand().equals("VOLVERPRINCIPAL")) {
			vopciones.setVisible(false);
			vadprincipal.setVisible(false);
			vprincipal.setVisible(true);

			viniciosesionadmin.getPanelInicioSesionadmin().getJf_alias().setText("");
			viniciosesionadmin.getPanelInicioSesionadmin().getJf_contraseña().setText("");

		}

		else if (arg0.getActionCommand().equals("VOLVERFECHA")) {
			vopciones.setVisible(true);
			vinscripsionmujer.setVisible(false);
			vinscripsionhombres.setVisible(false);

		}

		else if (arg0.getActionCommand().equals("ENTRARADMIN")) {
			String alias = viniciosesionadmin.getPanelInicioSesionadmin().getJf_alias().getText();

			try {
				if (PersonasDao.buscarPersona(alias) != null) {
					if (alias.equals("ELADMIN")) {
						if (PersonasDao.buscarPersona(alias).getContraseña().equals(
								viniciosesionadmin.getPanelInicioSesionadmin().getJf_contraseña().getText())) {
							viniciosesionadmin.mostrarMensaje("¡Bienvenido administrador!");
							vadprincipal.setVisible(true);
							viniciosesionadmin.setVisible(false);
							viniciosesionadmin.getPanelInicioSesionadmin().getJf_alias().setText("");
							viniciosesionadmin.getPanelInicioSesionadmin().getJf_contraseña().setText("");
						} else {
							viniciosesionadmin.mostrarMensaje("Usted no es el admin");
						}
					} else {
						viniciosesionadmin.mostrarMensaje("Usted no es el admin");
					}
				} else {

					viniciosesionadmin.mostrarMensaje("Usted no es el admin");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (arg0.getActionCommand().equals("MEGUSTA")) {

			try {
				if (idperfil != null) {
					if (aliasperfil != null) {
						String nombre = PersonasDao.obtenerInformacionDadoId(idperfil).getNombre();
						String alias = aliasperfil;
						System.out.println(nombre + "\n" + alias);
					} else {
						vperfil.mostrarMensaje(
								"Debes iniciar sesión una segunda vez para interactuar con más personas");
					}

				} else {
					vperfil.mostrarMensaje("Debe presionar el botón siguiente usuario");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else if (arg0.getActionCommand().equals("ESTADISTICAS")) {

//			try {
//
//				System.out.println();
//				System.out.println();
//				y.getOp().generarPdf(String.valueOf(y.getOpemod().CalcularModaLikesRecibidos()),
//						String.valueOf(y.getOpemod().calcularMediaLikesRecibidos()),
//						y.getOpemod().calcularMedianaLikesRecibidos(
//								y.getFiltrado().ordenarNumLikesRecibidos(y.getOp().obtener())),
//						String.valueOf(y.getOpemod().CalcularModaLikesOtorgados()),
//						String.valueOf(y.getOpemod().calcularMediaLikesOtorgados()),
//						y.getOpemod().calcularMedianaLikesRecibidos(
//								y.getFiltrado().ordenarNumLikesOtorgados(y.getOp().obtener())));
//				y.getGraficos().NumeroDelikesrecibidos();
//				y.getGraficos().NumeroDelikesdados();
//
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (DocumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		} else if (arg0.getActionCommand().equals("MODNOM")) {
			try {

				if (vopadmin.getpOpcionesAdmin().getTxtid().getText().isEmpty()) {

					vinscripsionmujer.mostrarMensaje("Es obligatorio llenar el campo id");
				} else if (vopadmin.getpOpcionesAdmin().getTxtNombre().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtEdad().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxteliminar().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtSalario().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtdivorcios().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtnumlikes().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtestado().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtsexo().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje("Porfavor diligencie el campo id y almenos otro campo");
				} else if (MujeresDao.modificarNombre(vopadmin.getpOpcionesAdmin().getTxtid().getText(),
						vopadmin.getpOpcionesAdmin().getTxtNombre().getText())) {
					viniciosesionadmin.mostrarMensaje("Nombre actualizado");

				} else if (vopadmin.getpOpcionesAdmin().getTxtNombre().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje(
							"Porfavor diligencie el campo nombre \\n y asegurese de que el campo id este diligenciado");

				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (arg0.getActionCommand().equals("ELIMINAR1")) {
			try {

				if (vopadmin.getpOpcionesAdmin().getTxteliminar().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje("Porfavor diligencie el campo eliminar");
				} else {

					MujeresDao.eliminarUsuario(vopadmin.getpOpcionesAdmin().getTxteliminar().getText());
					viniciosesionadmin.mostrarMensaje("Usuario eliminado");

				}
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (arg0.getActionCommand().equals("MODSEXO")) {
			try {
				if (vopadmin.getpOpcionesAdmin().getTxtid().getText().isEmpty()) {

					vinscripsionmujer.mostrarMensaje("Es obligatorio llenar el campo id");
				} else if (vopadmin.getpOpcionesAdmin().getTxtNombre().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtEdad().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxteliminar().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtSalario().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtdivorcios().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtnumlikes().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtestado().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtsexo().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje("Porfavor diligencie el campo id y almenos otro campo");
				} else if (MujeresDao.modifcarSexo(vopadmin.getpOpcionesAdmin().getTxtid().getText(),
						vopadmin.getpOpcionesAdmin().getTxtsexo().getText())) {
					viniciosesionadmin.mostrarMensaje("sexo actualizado");

				} else if (vopadmin.getpOpcionesAdmin().getTxtsexo().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje(
							"Porfavor diligencie el campo sexo \n y asegurese de que el campo id este diligenciado");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (arg0.getActionCommand().equals("MODEDAD")) {
			try {
				if (vopadmin.getpOpcionesAdmin().getTxtid().getText().isEmpty()) {

					vinscripsionmujer.mostrarMensaje("Es obligatorio llenar el campo id");
				} else if (vopadmin.getpOpcionesAdmin().getTxtNombre().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtEdad().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxteliminar().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtSalario().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtdivorcios().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtnumlikes().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtestado().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtsexo().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje("Porfavor diligencie el campo id y almenos otro campo");
				} else if (MujeresDao.modificarEdad(vopadmin.getpOpcionesAdmin().getTxtid().getText(),
						vopadmin.getpOpcionesAdmin().getTxtEdad().getText())) {
					viniciosesionadmin.mostrarMensaje("edad actualizado");

				} else if (vopadmin.getpOpcionesAdmin().getTxtEdad().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje(
							"Porfavor diligencie el campo edad y \n y asegurese de que el campo id este diligenciado");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (arg0.getActionCommand().equals("MODSALARIO")) {
			try {
				if (vopadmin.getpOpcionesAdmin().getTxtid().getText().isEmpty()) {

					vinscripsionmujer.mostrarMensaje("Es obligatorio llenar el campo id");
				} else if (vopadmin.getpOpcionesAdmin().getTxtNombre().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtEdad().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxteliminar().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtSalario().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtdivorcios().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtnumlikes().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtestado().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtsexo().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje("Porfavor diligencie el campo id y almenos otro campo");
				} else if (MujeresDao.modificarIngresos(vopadmin.getpOpcionesAdmin().getTxtid().getText(),
						vopadmin.getpOpcionesAdmin().getTxtSalario().getText())) {
					viniciosesionadmin.mostrarMensaje("salario actualizado");

				} else if (vopadmin.getpOpcionesAdmin().getTxtSalario().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje(
							"Porfavor diligencie el campo salario \n y asegurese de que el campo id este diligenciado");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (arg0.getActionCommand().equals("MODIVORCIOS")) {
			try {
				if (vopadmin.getpOpcionesAdmin().getTxtid().getText().isEmpty()) {

					vinscripsionmujer.mostrarMensaje("Es obligatorio llenar el campo id");
				} else if (vopadmin.getpOpcionesAdmin().getTxtNombre().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtEdad().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxteliminar().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtSalario().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtdivorcios().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtnumlikes().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtestado().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtsexo().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje("Porfavor diligencie el campo id y almenos otro campo");
				} else if (MujeresDao.modificarDivorcios(vopadmin.getpOpcionesAdmin().getTxtid().getText(),
						vopadmin.getpOpcionesAdmin().getTxtdivorcios().getText())) {
					viniciosesionadmin.mostrarMensaje("divoscios actualizados");

				} else if (vopadmin.getpOpcionesAdmin().getTxtdivorcios().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje(
							"Porfavor diligencie el campo divorcios \n y asegurese de que el campo id este diligenciado");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (arg0.getActionCommand().equals("MODNUMLIKES")) {
			try {
				if (vopadmin.getpOpcionesAdmin().getTxtid().getText().isEmpty()) {

					vinscripsionmujer.mostrarMensaje("Es obligatorio llenar el campo id");
				} else if (vopadmin.getpOpcionesAdmin().getTxtNombre().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtEdad().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxteliminar().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtSalario().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtdivorcios().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtnumlikes().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtestado().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtsexo().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje("Porfavor diligencie el campo id y almenos otro campo");
				} else if (MujeresDao.modificarnumlikes(vopadmin.getpOpcionesAdmin().getTxtid().getText(),
						vopadmin.getpOpcionesAdmin().getTxtnumlikes().getText())) {
					viniciosesionadmin.mostrarMensaje("likes actualizados");

				} else if (vopadmin.getpOpcionesAdmin().getTxtnumlikes().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje(
							"Porfavor diligencie el campo likes \n y asegurese de que el campo id este diligenciado");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (arg0.getActionCommand().equals("MODESTADO")) {
			try {
				if (vopadmin.getpOpcionesAdmin().getTxtid().getText().isEmpty()) {

					vinscripsionmujer.mostrarMensaje("Es obligatorio llenar el campo id");
				} else if (vopadmin.getpOpcionesAdmin().getTxtNombre().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtEdad().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxteliminar().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtSalario().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtdivorcios().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtnumlikes().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtestado().getText().isEmpty()
						&& vopadmin.getpOpcionesAdmin().getTxtsexo().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje("Porfavor diligencie el campo id y almenos otro campo");
				} else if (MujeresDao.modificarEstado(vopadmin.getpOpcionesAdmin().getTxtid().getText(),
						vopadmin.getpOpcionesAdmin().getTxtestado().getText())) {
					viniciosesionadmin.mostrarMensaje("estado actualizado");

				} else if (vopadmin.getpOpcionesAdmin().getTxtestado().getText().isEmpty()) {

					viniciosesionadmin.mostrarMensaje(
							"Porfavor diligencie el campo estado \n y asegurese de que el campo id este diligenciado");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (arg0.getActionCommand().equals("FILTRARASC")) {
			vadeliminar.getEliminar().getJperfil().setText("");
			if (vadeliminar.getEliminar().getJfiltroAsc().getSelectedItem() == "Alias") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarAliasAsc());

			} else if (vadeliminar.getEliminar().getJfiltroAsc().getSelectedItem() == "Nombre") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarNomAsc());

			} else if (vadeliminar.getEliminar().getJfiltroAsc().getSelectedItem() == "Apellido") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarApel1Asc());

			} else if (vadeliminar.getEliminar().getJfiltroAsc().getSelectedItem() == "Edad") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarEdadAsc());

			} else if (vadeliminar.getEliminar().getJfiltroAsc().getSelectedItem() == "Likes") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarLikesAsc());

			}

		} else if (arg0.getActionCommand().equals("FILTRARDES")) {
			vadeliminar.getEliminar().getJperfil().setText("");
			if (vadeliminar.getEliminar().getJfiltroDes().getSelectedItem() == "Alias") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarAliasDes());

			} else if (vadeliminar.getEliminar().getJfiltroDes().getSelectedItem() == "Nombre") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarNomDes());

			} else if (vadeliminar.getEliminar().getJfiltroDes().getSelectedItem() == "Apellido") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarApel1Des());

			} else if (vadeliminar.getEliminar().getJfiltroDes().getSelectedItem() == "Edad") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarEdadDes());

			} else if (vadeliminar.getEliminar().getJfiltroDes().getSelectedItem() == "Likes") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarLikesDes());

			}
		} else if (arg0.getActionCommand().equals("FILTRARGEN")) {
			vadeliminar.getEliminar().getJperfil().setText("");
			if (vadeliminar.getEliminar().getJfiltroGen().getSelectedItem() == "Hombres") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarSexoH());

			} else if (vadeliminar.getEliminar().getJfiltroGen().getSelectedItem() == "Mujeres") {
				vadeliminar.getEliminar().getJperfil().setText("");
				vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarSexoM());

			}
		} else if (arg0.getActionCommand().equals("FILTRARING")) {
			vadeliminar.getEliminar().getJperfil().setText("");
			vadeliminar.getEliminar().getJperfil().setText(Filtrado.mostrarIngr244());
		}
	}

}
