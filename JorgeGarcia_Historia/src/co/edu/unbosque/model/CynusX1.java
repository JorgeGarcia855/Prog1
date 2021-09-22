package co.edu.unbosque.model;

public class CynusX1 {
	
	private Heroes h1, h2;
	private Mortales m;
	private Desterrados d;
	
	public CynusX1() {
		h1 = new Heroes("Kira",40, 3.0, "verde", true);
		h2 = new Heroes("Astar", 24, 3.0, "azul", true);
		m = new Mortales("Jorge",18, 1.7, "violeta", true);
		d = new Desterrados("Renk",1500, 1.8, "rojo", false);
	}

	public Heroes getH1() {
		return h1;
	}

	public void setH1(Heroes h1) {
		this.h1 = h1;
	}

	public Heroes getH2() {
		return h2;
	}

	public void setH2(Heroes h2) {
		this.h2 = h2;
	}

	public Mortales getM() {
		return m;
	}

	public void setM(Mortales m) {
		this.m = m;
	}

	public Desterrados getD() {
		return d;
	}

	public void setD(Desterrados d) {
		this.d = d;
	}

}
