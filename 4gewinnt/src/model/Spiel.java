package model;

public class Spiel {

	// Variable

	Spielbrett sp1 = new Spielbrett();
	Spieler spieler1 = new Spieler();
	Spieler spieler2 = new Spieler();
	Spielstein spielstein = new Spielstein();

	public static void main(String[] args) {

		Spielbrett spielbrett = new Spielbrett();

		Spielstein spielsteinVonSpielfeld = spielbrett.getSpielsteinVonSpielfeld(0, 2);

		System.out.println(spielsteinVonSpielfeld);

	}
}
