package z04;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Osoba implements Serializable{
	private String ime = "", prezime = "";
	
	public Osoba(String ime, String prezime){
		this.ime = ime;
		this.prezime = prezime;
	}
	
	@Override
	public String toString(){
		return "IME: " + ime + " PREZIME: " + prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
}
