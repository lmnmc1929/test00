package de.hs_lu.o2s.ueb.ue3.mittelalter;

public class Adel extends Einwohner{

	public Adel(int einkommen) {
		this.einkommen = einkommen;
	}
	
	public Adel() {
		this.einkommen= 20 ;
	}
	
	
	// Methode getSteuer 
	@Override
	public int getSteuer() {
		int verechneteSteuer = (int) Math.round(Math.round(einkommen*10/8)*0.19);
		
		if(verechneteSteuer<20) {
			return 20;
		}else {
			return verechneteSteuer;
		}
	}
	
	public String druckDich() {
		String inforLine ="Adel mit zu versteuernden Eikommen"+ getZuVersteuerndesEinkommen() ;
		return inforLine;
	}
}
