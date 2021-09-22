package co.edu.unbosque.model;

public class Voladores {
	
	private Airplane a;
	private Bird b;
	private Superman s;
	private SeaPlane sp;
	private Helicopter h;
	
	public Voladores() {
		a = new Airplane();
		b = new Bird();
		s = new Superman();
		sp = new SeaPlane();
		h = new Helicopter();
	}

	public Airplane getA() {
		return a;
	}

	public void setA(Airplane a) {
		this.a = a;
	}

	public Bird getB() {
		return b;
	}

	public void setB(Bird b) {
		this.b = b;
	}

	public Superman getS() {
		return s;
	}

	public void setS(Superman s) {
		this.s = s;
	}

	public SeaPlane getSp() {
		return sp;
	}

	public void setSp(SeaPlane sp) {
		this.sp = sp;
	}

	public Helicopter getH() {
		return h;
	}

	public void setH(Helicopter h) {
		this.h = h;
	}
	
}
