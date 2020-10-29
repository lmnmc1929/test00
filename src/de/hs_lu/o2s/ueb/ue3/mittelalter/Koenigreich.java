package de.hs_lu.o2s.ueb.ue3.mittelalter;

public class Koenigreich {
	// array einwohnerA definieren 
	
	public static Einwohner[] einwohnerA;
	
	static void koenigreichAnlegen() { 
		Einwohner[] einWohner =new Einwohner[12];
		Koenig koenig = new Koenig(300);
		einWohner[0]= koenig;
		
		Adel Adel1 = new Adel(100);
		Adel Adel2 = new Adel(100);
		Adel Adel3 = new Adel(100);
		einWohner[1]= Adel1;
		einWohner[2]= Adel2;
		einWohner[3]= Adel3;
		
		Bauer bauer1 = new Bauer(40);
		Bauer bauer2 = new Bauer(40);
		Bauer bauer3 = new Bauer(40);
		Bauer bauer4 = new Bauer(40);
		einWohner[4]= bauer1;
		einWohner[5]= bauer2;
		einWohner[6]= bauer2;
		einWohner[7]= bauer4;

		Leibeigener Leibeigene1 = new Leibeigener(50);
		Leibeigener Leibeigene2 = new Leibeigener(50);
		Leibeigener Leibeigene3 = new Leibeigener(50);
		Leibeigener Leibeigene4 = new Leibeigener(50);
		einWohner[8]= Leibeigene1;
		einWohner[9]= Leibeigene2;
		einWohner[10]= Leibeigene3;
		einWohner[11]= Leibeigene4;

		einwohnerA= einWohner;
		
	}
	
	public static int steuernImKoenigreich() {
		int summe = 0 ;
		for (int i = 0; i < einwohnerA.length; i++) {
			summe+= einwohnerA[i].getSteuer();
			System.out.println(			einwohnerA[i].druckDich());
		}
		System.out.println("gesammte Steuer im Koenigreich ist : "+ summe );
		return summe;
		
	}

	/**
	 * Legt vier Einwohner unterschiedlichen Standes mit jeweils 20 Talern Einkommen
	 * an.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		 steuerbescheid(new Koenig(20));
//		 steuerbescheid(new Adel(20));
//		 steuerbescheid(new Bauer(20));
//		 steuerbescheid(new Leibeigener(20));
		
		koenigreichAnlegen();
		steuernImKoenigreich();
	}
	


	

	/**
	 * Gibt das zu versteuernde Einkommen fuer einen Einwohner aus
	 * 
	 * @param einwohner
	 *            Der Einwohner
	 * @param einkommen
	 *            Das Jahreseinkommen des Einwohners
	 */
	// static void steuerbescheid(Einwohner einwohner) {
	//
	// System.out.println(einwohner.getClass().getSimpleName() +
	// ": Einkommen " + einwohner.einkommen +
	// ", zu versteuerndes Einkommen " + einwohner.getZuVersteuerndesEinkommen() +
	// ", Steuer " + einwohner.getSteuer());
	// }
	
	
	
}