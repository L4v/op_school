package z05;

public class Stavka {
	private String naziv = "";
	private double cena;
	
	public Stavka(String naziv, double cena) {
		this.naziv = naziv;
		this.cena = cena;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Stavka [naziv=" + naziv + ", cena=" + cena + "]";
	}
	
}
