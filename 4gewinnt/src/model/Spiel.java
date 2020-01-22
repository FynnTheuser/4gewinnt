package model;

import java.awt.Color;
import java.util.Scanner;

public class Spiel {

	// Variable

	Spielbrett sp1 = new Spielbrett();

	public static void main(String[] args) {

		Spielbrett spielbrett = new Spielbrett();
		Spieler spieler1 = new Spieler("Spieler1", Color.GREEN);
		Spieler spieler2 = new Spieler("Spieler2", Color.RED);
		Spielstein spielsteinVonSpielfeld = spielbrett.getSpielsteinVonSpielfeld(0, 2);

		System.out.println(spielsteinVonSpielfeld);

		spielbrett.setzeSpielsteinAnErsteFreieStelle(0, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(1, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(2, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(3, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(0, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(1, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(2, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(3, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(0, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(0, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(5, spieler1.getFarbe());
		spielbrett.setzeSpielsteinAnErsteFreieStelle(1, spieler1.getFarbe());
		printSpielfeld(spielbrett.getSpielbrett());
		Scanner scanner = new Scanner(System.in);
		String line;
		while (!(line = scanner.nextLine()).equals("quit")) {

		}
	}

	public static void printSpielfeld(Spielstein[][] spielbrett) {
		for (Spielstein[] x : spielbrett) {
			for (Spielstein spielstein : x) {
				if (spielstein == null)
					System.out.print("-");
				else
					System.out.print(spielstein.getFarbe().toString());
				System.out.print("|");
			}
			System.out.print("\n");
		}
	}

}