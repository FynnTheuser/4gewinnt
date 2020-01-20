package model;

import java.awt.Color;
import java.util.Scanner;

public class Spiel {

	// Variable

	Spielbrett sp1 = new Spielbrett();
	Spieler spieler1 = new Spieler("Spieler1", Color.GREEN);
	Spieler spieler2 = new Spieler("Spieler2", Color.RED);

	public static void main(String[] args) {

		Spielbrett spielbrett = new Spielbrett();

		Spielstein spielsteinVonSpielfeld = spielbrett.getSpielsteinVonSpielfeld(0, 2);

		System.out.println(spielsteinVonSpielfeld);

		Scanner scanner = new Scanner(System.in);
		String line;
		while (!(line = scanner.nextLine()).equals("quit")) {

		}
	}

public static void printSpielfeld(Spielstein[][] spielbrett) {
		for (Spielstein[] x : spielbrett) {
			for (Spielstein spielstein : x) {
				/*1.if benutzen, um zu schauen, ob dort ein Spielstein ist und welche Farbe dieser hat 2. array hübsch formatieren 3. durch scannen lassen
			}
		}
	}

}
