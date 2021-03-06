package paket;

public class Krug {
	private double r, povrsina, obim;
	
	public Krug(double r){
		this.r = r;
	}
	
	public Krug(Krug k){
		this.r = k.r;
		this.povrsina = k.povrsina;
		this.obim = k.obim;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getPovrsina() {
		return r * r * 3.14;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}

	public double getObim() {
		return 2 * this.r;
	}

	public void setObim(double obim) {
		this.obim = obim;
	}
}
