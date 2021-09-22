package co.edu.unbosque.model.persistence;

import java.util.Properties;
import java.util.Random;

public class FrasesRegueton {
	
	private Properties prop = new Properties();
	private String[] c1, c2, c3 ,c4, c5, c6;
	
	public FrasesRegueton() {
		c1= new String[4];
		c2= new String[4];
		c3= new String[4];
		c4= new String[4];
		c5= new String[4];
		c6= new String[4];
		arregloFrases();
	}
	
	public void arregloFrases() {
		c1[0]= "mami"; 
		c1[1]= "bebe";
		c1[2]= "princess";
		c1[3]= "mami";
		
		c2[0]= "yo quiero";
		c2[1]= "yo puedo";
		c2[2]= "yo vengo a";
		c2[3]= "voy a";
		
		c3[0]= "encenderte";
		c3[1]= "amarte";
		c3[2]= "ligar";
		c3[3]= "jugar";
		
		c4[0]= "suave";
		c4[1]= "lento";
		c4[2]= "rapido";
		c4[3]= "fuerte";
		
		c5[0]= "hasta que salga el sol";
		c5[1]= "toda la noche";
		c5[2]= "hasta el amanecer";
		c5[3]= "todo el dia";
		
		c6[0]= "sin anestesia";
		c6[1]= "sin compromiso";
		c6[2]= "feis to feis";
		c6[3]= "sin miedo";
	}
	
	public String generadorCanciones() {
		String l = "";
		for (int i = 1; i <=12; i++) {
			int n1= new Random().nextInt(4);
			int n2= new Random().nextInt(4);
			int n3= new Random().nextInt(4);
			int n4= new Random().nextInt(4);
			int n5= new Random().nextInt(4);
			int n6= new Random().nextInt(4);
			l+=c1[n1]+" "+c2[n2]+" "+c3[n3]+" "+c4[n4]+" "+c5[n5]+" "+c6[n6]+".\n";
			if(i==4) {
				l+="\n";
			}else if (i==8) {
				l+="\n";
			}
		}
		return l;
	}
	
}
