package de.hs_lu.o2s.ueb.ue3.mittelalter;

public class Leibeigener extends Bauer{

	public Leibeigener(int einkommen) {
		this.einkommen = einkommen;
	}
	
	public Leibeigener() {
		this.einkommen= 20 ;
	}
	
	@Override
	public int getSteuer() {
		int verechneteSteuer = (int) Math.round(Math.round(einkommen*10/8)*0.19);
		
		if(einkommen<=12) {
			return 0 ;
		}else {
			return verechneteSteuer;
		}
	}
	
	public String druckDich() {
		String inforLine ="Leibeigener mit zu versteuernden Eikommen"+ getZuVersteuerndesEinkommen() ;
		return inforLine;
	}
}
