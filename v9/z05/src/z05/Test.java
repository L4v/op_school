package z05;

/*
 * Test klasa
 */
public class Test {

	public static Restoran restoran;
	
	public static void main(String[] args) {
		restoran = new Restoran("Masinac", "Nebitno");
		restoran.load("src/z05/Jelovnik.txt");
		restoran.export("src/z05/" + restoran.getNaziv() + ".txt");
	}

}