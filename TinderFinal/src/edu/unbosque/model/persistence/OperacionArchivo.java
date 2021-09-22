package edu.unbosque.model.persistence;

import java.io.*;
import java.util.ArrayList;

//import com.itextpdf.text.Chunk;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfDocument;
//import com.itextpdf.text.pdf.PdfWriter;

import edu.unbosque.model.PersonasDto;

public final class OperacionArchivo {

	public static ArrayList<PersonasDto> obtener() throws ClassNotFoundException {
		try {
			ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("./Data/Personas.dat"));
			ArrayList<PersonasDto> aux = (ArrayList<PersonasDto>) recuperar.readObject();
			recuperar.close();
			return aux;
		} catch (IOException e) {
			return null;

		}

	}

	public static void escribir(ArrayList<PersonasDto> aux) {
		try {
			ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./Data/Personas.dat"));
			escribir.writeObject(aux);
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<PersonasDto> leerCsv() {
		ArrayList<PersonasDto> personas = new ArrayList<>();
		BufferedReader lectura;
		try {
			lectura = new BufferedReader(new FileReader("./Data/datos.csv"));
			StringBuilder linea1;
			StringBuilder linea2 = new StringBuilder();
			String linea = lectura.readLine();
			char[] lineachar;
			while (linea != null) {
				lineachar = linea.toCharArray();
				int i = 1, cont = 0;
				linea1 = new StringBuilder(Character.toString(lineachar[0]));
				while (cont < 6) {
					linea1.append(lineachar[i]);
					if (lineachar[i] == ';') {
						cont++;
					}
					i++;
				}
				if (lineachar[i] == '"') {
					int j = 0, cont1 = i;
					while (j < 17) {
						linea2.append(lineachar[cont1]);
						j++;
						cont1++;
					}
					i += 18;

				} else {
					int j = 0, cont1 = i;
					while (j < 15) {
						linea2.append(lineachar[cont1]);
						j++;
						cont1++;
					}
					i += 16;
					// System.out.println(linea2+"\n");
				}
				while (i < lineachar.length) {
					linea1.append(lineachar[i]);
					i++;
				}
				linea = lectura.readLine();
				// linea2 += "\n" + linea1;
				String[] temp = linea1.toString().split(";");
				personas.add(new PersonasDto(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], linea2.toString(), temp[6],
						temp[7], temp[8], temp[9], temp[10], temp[11], temp[12], temp[13], temp[14], ""));
				linea2 = new StringBuilder();
			}
			// System.out.println(linea2);
			lectura.close();
		} catch (IOException e) {
			return null;
		}
		return personas;
	}

	//	public void generarPdf(String moda1, String media1, String mediana1, String moda2, String media2, String mediana2)
//			throws FileNotFoundException, DocumentException {
//
//		FileOutputStream informepdf = new FileOutputStream("informe.pdf");
//		Document documento = new Document();
//		PdfWriter.getInstance(documento, informepdf);
//
//		Paragraph titulo = new Paragraph("INFORME BOSTINDER");
//
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//
//		documento.open();
//
//		titulo.setAlignment(1);
//		documento.add(titulo);
//		documento.add(Chunk.NEWLINE);
//		documento.add(new Paragraph(dtf.format(LocalDateTime.now())));
//		documento.add(Chunk.NEWLINE);
//		documento.add(new Paragraph("ESTADISTICAS PARA NÚMERO DE LIKES RECIBIDOS"));
//		documento.add(Chunk.NEWLINE);
//		documento.add(new Paragraph("Moda número de likes recibidos por todos los usuarios: " + moda1));
//		documento.add(new Paragraph("Mediana número de likes recibidos por todos los usuarios: " + mediana1));
//		documento.add(new Paragraph("Media número de likes recibidos por todos los usuarios: " + media1));
//		documento.add(Chunk.NEWLINE);
//		documento.add(new Paragraph("ESTADISTICAS PARA NÚMERO DE LIKES OTORGADOS"));
//		documento.add(Chunk.NEWLINE);
//		documento.add(new Paragraph("Moda número de likes recibidos por todos los usuarios: " + moda2));
//		documento.add(new Paragraph("Mediana número de likes recibidos por todos los usuarios: " + mediana2));
//		documento.add(new Paragraph("Media número de likes recibidos por todos los usuarios: " + media2 ));
//		documento.close();
//
//	}

}
