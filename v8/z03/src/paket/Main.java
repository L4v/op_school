package paket;
import paket.Valjak;

public class Main {
	
	public static Valjak valjak;
	public static Pravougaonik p;
	public static Krug k;
	
	public static void main(String[] args) {
		p = new Pravougaonik(10, 20);
		k = new Krug(20);
		
		valjak = new Valjak(k, p);
		
		System.out.println("Ispis valjka:\n" + "Zapremina: " + valjak.getV() + "\nPovrsina: " + valjak.getP());

	}

}