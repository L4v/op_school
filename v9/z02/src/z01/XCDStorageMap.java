package z01;

import java.util.HashMap;
import java.util.Map;

public class XCDStorageMap {
	private HashMap<Integer, CDDisk> mapa;
	
	public XCDStorageMap(){
		mapa = new HashMap<Integer, CDDisk>();
	}
	
	public boolean addCD(CDDisk cd){
		for(int i = 0; i < mapa.size(); i ++){
			if(mapa.containsKey(cd))
				return false;
		}
		mapa.put(cd.getId(), cd);
		return true;
	}
	
	public CDDisk removeCD(int id){
		return mapa.remove(id);
	}
	
	public CDDisk findCD(int id){
		return mapa.get(id);
	}
	
	public void empty(){
		mapa.clear();
	}
	
	public String toString(){
		String temp = new String("Mapa: ");
		for (Map.Entry<Integer, CDDisk> m : mapa.entrySet()) {
			temp += "ID: " + m.getKey() + "\tDISK: " + m.getValue();
		}
		return temp;
	}
	
}