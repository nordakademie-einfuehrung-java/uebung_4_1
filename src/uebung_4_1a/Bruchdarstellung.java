package uebung_4_1a;

public class Bruchdarstellung {

	public static void bruchdarstellung(int zaehler, int nenner) {
		double kommazahl;
		double zaehler1 = zaehler;
		double nenner1 = nenner;

		kommazahl = zaehler1 / nenner1;

		System.out.println("   " + zaehler);
		System.out.println("-------" + " = " + kommazahl);
		System.out.println("   " + nenner);

	}

	public static void main(String[] args) {
		bruchdarstellung(1, 2);
		bruchdarstellung(97, 32);
		bruchdarstellung(73, 13);

	}
}
