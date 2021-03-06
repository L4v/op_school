package z01;

public class CDDisk {
	protected int id;
	protected String naziv, izvodjac;
	
	public CDDisk(){
		this.id = 0;
		this.naziv = new String("NAZIV");
		this.izvodjac = new String("IZVODJAC");
	}
	
	public CDDisk(int id, String naziv, String izvodjac) {
		this.id = id;
		this.naziv = naziv;
		this.izvodjac = izvodjac;
	}

	@Override
	public String toString(){
		return "ID: " + Integer.toString(id) + " IZVODJAC: " + izvodjac + " NAZIV: " + naziv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getIzvodjac() {
		return izvodjac;
	}

	public void setIzvodjac(String izvodjac) {
		this.izvodjac = izvodjac;
	}
}
