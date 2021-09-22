package edu.unbosque.view.panels;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagenInstrucciones extends JPanel{
	
	private ImageIcon im;

	public PanelImagenInstrucciones() {
		
	}
	
	public void paint (Graphics g) {
		Dimension tam = getSize();
		im =  new ImageIcon(getClass().getResource("/imagenes/ImagenInstrucciones.jpg"));
		g.drawImage(im.getImage(),0,0, 772, 540, null);
		setOpaque(false);
		super.paint(g);
	}

	public ImageIcon getIm() {
		return im;
	}

	public void setIm(ImageIcon im) {
		this.im = im;
	}

	
	
}
