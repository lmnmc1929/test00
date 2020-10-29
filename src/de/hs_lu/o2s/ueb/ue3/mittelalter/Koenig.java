package de.hs_lu.o2s.ueb.ue3.mittelalter;

public class Koenig extends Einwohner{

	public Koenig(int einkommen) {
		this.einkommen = einkommen;
	}
	
	public Koenig() {
		this.einkommen= 20 ;
		}
	@Override
	public int getSteuer() {
		int verechneteSteuer = (int) Math.round(Math.round(einkommen*10/8)*0.1);
		return verechneteSteuer;
	}
	
	public String druckDich() {
		String inforLine ="Achtung , Koenig mit zu versteuernden Eikommen"+ getZuVersteuerndesEinkommen() ;
		return inforLine;
	}
	
	
}
