package edu.unbosque.model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import edu.unbosque.model.persistence.OperacionArchivo;

public final class Graficos {

	private static final OperacionArchivo op = new OperacionArchivo();

	public static void NumeroDelikesrecibidos() throws ClassNotFoundException {

		Filtrado.ordenarNumLikesRecibidos(op.obtener());
		DefaultCategoryDataset data = new DefaultCategoryDataset();

		for (int i = Filtrado.ordenarNumLikesRecibidos(op.obtener()).size() - 1; i > Filtrado
				.ordenarNumLikesRecibidos(op.obtener()).size() - 11; i--) {
			data.setValue(Integer.parseInt(Filtrado.ordenarNumLikesRecibidos(op.obtener()).get(i).getNumlikerec()),
					Filtrado.ordenarNumLikesRecibidos(op.obtener()).get(i).getAlias(),
					Filtrado.ordenarNumLikesRecibidos(op.obtener()).get(i).getAlias());
		}

		JFreeChart barras = ChartFactory.createBarChart3D("USUARIOS CON MÁS LIKES DENTRO DEL PROGRAMA", "Usuarios",
				"Número de likes recibidos", (CategoryDataset) data, PlotOrientation.VERTICAL, true, true, false);

		ChartFrame frame = new ChartFrame("Gráfico", barras);
		frame.pack();
		frame.setVisible(true);
	}

	public static void NumeroDelikesdados() throws ClassNotFoundException {

		Filtrado.ordenarNumLikesOtorgados(op.obtener());
		DefaultCategoryDataset data = new DefaultCategoryDataset();

		for (int i = Filtrado.ordenarNumLikesOtorgados(op.obtener()).size() - 1; i > Filtrado
				.ordenarNumLikesOtorgados(op.obtener()).size() - 11; i--) {
			data.setValue(Integer.parseInt(Filtrado.ordenarNumLikesOtorgados(op.obtener()).get(i).getNumlikeot()),
					Filtrado.ordenarNumLikesOtorgados(op.obtener()).get(i).getAlias(),
					Filtrado.ordenarNumLikesOtorgados(op.obtener()).get(i).getAlias());
		}

		JFreeChart barras = ChartFactory.createBarChart3D("USUARIOS CON MÁS LIKES OTORGADOS", "Usuarios",
				"Número de likes otorgados", (CategoryDataset) data, PlotOrientation.VERTICAL, true, true, false);

		ChartFrame frame = new ChartFrame("Gráfico", barras);
		frame.pack();
		frame.setVisible(true);
	}

	public static void IngresosSuperiores(String alias, int sueldos) {

		DefaultCategoryDataset data = new DefaultCategoryDataset();
		data.setValue(sueldos, alias, alias);

		JFreeChart barras = ChartFactory.createBarChart3D("USUARIOS CON EL MAYOR SUELDO", "Usuarios", "Sueldo mensual",
				data, PlotOrientation.VERTICAL, true, true, false);

		ChartFrame frame = new ChartFrame("Gráfico", barras);
		frame.pack();
		frame.setVisible(true);
	}

}
