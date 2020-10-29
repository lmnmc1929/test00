package de.hs_lu.o2s.ueb.ue3.mittelalter;

public class Einwohner {

	int einkommen ;

	public Einwohner(int einkommen) {
		this.einkommen = einkommen;
	}
	
	public Einwohner() {
		this.einkommen= 20 ;
	}
	
	// methode getZuVersteuerndesEinkommen
	public int getZuVersteuerndesEinkommen() {
		// Math.round zum get  Versteuern des Einkommen
		return (int) Math.round(einkommen*0.8);
	}
	
	
	// Methode getSteuer 
	public int getSteuer() {
		int verechneteSteuer = (int) Math.round(Math.round(einkommen*10/8)*0.19);
		
		if(verechneteSteuer<5) {
			return 5;
		}else {
			return verechneteSteuer;
		}
	}
	
	public String druckDich() {
		String inforLine ="Person mit einkommen"+ einkommen ;
		return inforLine;
	}
}
