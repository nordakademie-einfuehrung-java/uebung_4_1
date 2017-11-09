package uebung_4_1;

public class Bruchdarstellen {

	public static void bruchDarstellen(int zaehler, int nenner) {
		// TODO Auto-generated method stub
		double zaehlerd;
		double nennerd;
		zaehlerd = zaehler;
		nennerd = nenner;
		
		double kommazahl = zaehlerd / nennerd;
		
		System.out.println(zaehler);
		System.out.println("--------------- = " + kommazahl);
		System.out.println(nenner);
		

	}



/*public static void main  (String [] args) {

	
	
	bruchDarstellen(7,5);
	bruchDarstellen(4,2);
	bruchDarstellen(10,9);
}*/
public static void main  (String [] args) {
	
	int zaehler = 1;
	int nenner = 1;
	int zaehler0 = 0;
	int nenner0 = 0;
	
	for ( int x = 1; x < 10 ; x = x +1 ){
		bruchDarstellen(zaehler, nenner);
		
		zaehler0 = nenner;
		nenner0 = nenner + zaehler;
		
		zaehler = zaehler0;
		nenner = nenner0;
		
		
	}
	
	
	
	
	
}

}