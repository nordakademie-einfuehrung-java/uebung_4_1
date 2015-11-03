
public class Bruch {

	public static void bruchDarstellen(int zaehler, int nenner) {
		
		double z = zaehler;
		double n = nenner;
		double kommazahl = z / n;
		
		System.out.println(zaehler);
		System.out.println("----- = " + (kommazahl));
		System.out.println(nenner + "\n");
		
		
		return;
	}
	
	
	public static void main(String[] args) {
		
		bruchDarstellen(2, 3);
		bruchDarstellen(3, 4);
		bruchDarstellen(100, 97);
		
	//Goldener Schnitt	
		
		System.out.println("Goldener Schnitt:");
		
		double z = 1;
		double n = 1;
				
		double zn;
		double nn;
		
		for (int i = 1; i < 1000; i++) {
			zn = n;
			nn = z + n;
			
			z = zn;
			n = nn;	
		}
		
		System.out.println(z / n);
		
		
		
		
	}
		
		

}
