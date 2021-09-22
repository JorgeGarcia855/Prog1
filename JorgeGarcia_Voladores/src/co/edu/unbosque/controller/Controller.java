package co.edu.unbosque.controller;

import co.edu.unbosque.model.Voladores;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Voladores v;
	private View gui;
	
	public Controller() {
		gui = new View();
		v = new Voladores();
		funcionar();
	}
	
	public void funcionar() {
		String texto1 = v.getA().takeOff()+"\n"+v.getA().fly()+"\n"+v.getA().land()+"\n"+v.getA().vehiculoConducible()+"\n\n";
		String texto2 = v.getSp().takeOff()+"\n"+v.getSp().fly()+"\n"+v.getSp().land()+"\n"+v.getSp().vehiculoConducible()+"\n\n";
		String texto3 = v.getH().takeOff()+"\n"+v.getH().fly()+"\n"+v.getH().land()+"\n"+v.getH().vehiculoConducible()+"\n\n";
		String texto4 = v.getB().takeOff()+"\n"+v.getB().fly()+"\n"+v.getB().land()+"\n"+v.getB().buildNest()+"\n"+v.getB().layEggs()+"\n"+v.getB().eat()+"\n\n";
		String texto5 = v.getS().takeOff()+"\n"+v.getS().fly()+"\n"+v.getS().land()+"\n"+v.getS().leapBuilding()+"\n"+v.getS().stopBullet()+"\n"+v.getS().eat()+"\n"+v.getS().habitanteKryptonia()+"\n\n";
		
		gui.mostrarResultados(texto1+texto2+texto3+texto4+texto5);
	}
}
