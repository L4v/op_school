package z01;

import java.util.ArrayList;

import z01.CDDisk;

public class XCDStorage{
	private ArrayList<CDDisk> diskovi;
	
	public XCDStorage(){
		diskovi = new ArrayList<CDDisk>();
	}
	
	public boolean addCD(CDDisk disk){
		for(CDDisk d : diskovi){
			if(d.getId() == disk.getId())
				return false;
		}
		diskovi.add(disk);
		return true;
	}
	
	public CDDisk removeCD(int id){
		for(int i = 0; i < diskovi.size(); i ++){
			if(diskovi.get(i).getId() == id){
				return diskovi.remove(i);
			}
		}
		return null;
	}
	
	public CDDisk findCD(int id){
		for(CDDisk d : diskovi){
			if(d.getId() == id)
				return d;
		}
		return null;
	}
	
	public void empty(){
		diskovi.clear();
	}
	
	@Override
	public String toString(){
		String temp = new String("Diskovi:\n");
		for(CDDisk d : diskovi){
			temp += d + "\n";
		}
		return temp;
	}
	
}
