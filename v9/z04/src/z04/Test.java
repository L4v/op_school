package z04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {
/*
 * NIJE URADJENO TREBA ZAVRSITI
 */
	public static Osoba o1, o2, o3, o4;
	public static void main(String[] args) {
		o1 = new Osoba("Pera", "Peric");
		o2 = new Osoba("Neko", "Nestovic");
		o3 = new Osoba("Mare", "Marac");
		o4 = new Osoba("Cet", "Cetvrti");
		
		save("test.txt", o1);
	}
	
	public static void save(String file, Osoba o){
		ObjectOutputStream out = null;
		
		try{
			out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			out.writeObject(o);
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			try{
				out.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}

}
