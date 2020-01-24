package model;

import java.awt.Color;
import java.util.HashMap;
import java.util.Scanner;

public class Spiel {

	// Variable

	public HashMap<String, String> colors = new HashMap<String, String>() {
		{
			put(Color.GREEN.toString(), "X");
			put(Color.BLUE.toString(), "O");
		}
	};

	public static void main(String[] args) {
		new Spiel();
	}

	public Spiel() {
		Spielbrett spielbrett = new Spielbrett();
		Spieler spieler1 = new Spieler("Spieler1", Color.GREEN);
		Spieler spieler2 = new Spieler("Spieler2", Color.BLUE);
		Spielstein spielsteinVonSpielfeld = spielbrett.getSpielsteinVonSpielfeld(0, 2);

		System.out.println("Herzlich Willkommen!");
		System.out.println("Spieler 1 beginnt!");
		System.out.println("Schreibe eine Zahl von 1-7!");
		printSpielfeld(spielbrett.getSpielbrett());
		Scanner scanner = new Scanner(System.in);
		String line;
		Spieler currentSpieler = spieler1;

		while (!(line = scanner.nextLine()).equals("0")) {
			try {
				int eingabe = Integer.parseInt(line);
				boolean gewonnen = spielbrett.setzeSpielsteinAnErsteFreieStelle(eingabe - 1, currentSpieler.getFarbe());

				if (eingabe <= 0 || Integer.parseInt(line) >= 8) {

					System.out.println("Bitte wählen Sie eine Zahl zwischen 1 und 7!");
				}
				if (gewonnen == true) {
					System.out.println("Herzlichen Glückwunsch " + currentSpieler.getName() + " hat gewonnen!");
					System.out.println("0 drücken um neu zu beginnen!");
					break;
				}
				if (currentSpieler == spieler1)
					currentSpieler = spieler2;
				else
					currentSpieler = spieler1;
				printSpielfeld(spielbrett.getSpielbrett());
				System.out.println(currentSpieler.getName() + " ist dran!");

			} catch (NumberFormatException e) {
				System.out.println("Fehlerhafte Eingabe, bitte erneut probieren.");

			}

		}
	}

	public void printSpielfeld(Spielstein[][] spielbrett) {
		int spaltenNummer = 1;
		for (Spielstein[] x : spielbrett) {
			for (Spielstein spielstein : x) {

				if (spielstein == null)
					System.out.print("-");
				else
					System.out.print(colors.get(spielstein.getFarbe().toString()));
				System.out.print("|");
			}
			System.out.print(" " + spaltenNummer++ + "\n");

		}
	}

}