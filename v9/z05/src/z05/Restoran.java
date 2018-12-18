package z05;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Restoran {
	private String naziv = "", adresa = "";
	private ArrayList<Stavka> jelovnik;
	
	
	
	public Restoran(String naziv, String adresa) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.jelovnik = new ArrayList<Stavka>();
	}
	/*
	 * Getteri i setteri
	 */
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public void load(String s){
		BufferedReader in = null;
		Stavka temp = null;
		String line;
		ArrayList<String> lajne = new ArrayList<String>();
		try{
			in = new BufferedReader(new FileReader(s));
			while((line = in.readLine()) != null)
				lajne.add(line);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(in != null){
				try{
					in.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		ArrayList<String> tokens = new ArrayList<String>();
		String st, tmpString;
		boolean prosao = false;
		for (int i = 0; i < lajne.size(); i ++) {
			st = lajne.get(i);
			
			if(st.contains("Restoran")){
				this.setNaziv(st.substring(st.indexOf("\"")).replace("\"", ""));
			}else if(st.contains("Adresa")){
				this.setAdresa(st.replace("Adresa: ", ""));
			}else if(st.contains("******************") && !prosao){
				prosao = true;
				while((st = lajne.get(i + 1)) != "******************"){
					double cena = Double.parseDouble(st.split(" ")[st.split(" ").length - 1]);
					String naziv = null;
					//TODO	ZAVRSITI
				}
			}
		}
	}
}
