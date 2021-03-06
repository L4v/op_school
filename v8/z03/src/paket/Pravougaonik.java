package paket;

public class Pravougaonik {
	private double a, b;
	private double povrsina, obim;
	
	public Pravougaonik(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public Pravougaonik(Pravougaonik p){
		this.a = p.a;
		this.b = p.b;
		this.povrsina = p.povrsina;
		this.obim = p.obim;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getPovrsina() {
		return this.a*this.b;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}

	public double getObim() {
		return 2*this.a + 2* this.b;
	}

	public void setObim(double obim) {
		this.obim = obim;
	}
	
	
	
}
