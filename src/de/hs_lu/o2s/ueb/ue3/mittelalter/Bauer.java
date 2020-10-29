package de.hs_lu.o2s.ueb.ue3.mittelalter;

public class Bauer extends Einwohner{

	public Bauer(int einkommen) {
		this.einkommen = einkommen;
	}
	
	public Bauer() {
		this.einkommen= 20 ;
	}
	
	public String druckDich() {
		String inforLine ="Bauer mit zu versteuernden Eikommen"+ getZuVersteuerndesEinkommen() ;
		return inforLine;
	}
}
