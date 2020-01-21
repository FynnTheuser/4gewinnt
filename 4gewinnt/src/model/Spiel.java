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
				if (spielbrett == ' ') }
				else (spielbrett == Color.GREEN || Color.RED)
					if(Color.GREEN == spielstein)
						Spielstein = spielsteinGrün;
					if(Color.RED == spielstein)
						spielbrett = spielsteinRot;
					
				}

	public static int gewonnenVertikal(char spielbrett[][], char spielstein, String name, int i) {

		for (int z = 5; z >= 3; z--) {
			for (int s = 0; s < spielbrett[z].length; s++) {
				if (spielbrett[z][s] == spielstein && spielbrett[z - 1][s] == spielstein
						&& spielbrett[z - 2][s] == spielstein && spielbrett[z - 3][s] == spielstein) {
					System.out.println(name + " hat gewonnen!");

				}
			}
		}

	public static int gewonnenWaagerecht(char spielbrett[][],
				char spielstein, String name, int i) {

			for (int z = 0; z < spielbrett.length; z++) 
			{
				for (int s = 0; s <= 3; s++) 
				{
					if (spielbrett[z][s] == spielstein
							&& spielbrett[z][s + 1] == spielstein
							&& spielbrett[z][s + 2] == spielstein
							&& spielbrett[z][s + 3] == spielstein)
					{
						System.out.println("Sieger" + name);
					
					}
				}
			}

	public static int gewonnenDiagonal1(char spielbrett[][],
					char spielstein, String name, int i) {

				for (int z = 0; z <= 2; z++) 
				{
					for (int s = 0; s <= 3; s++)
					{
					if (spielbrett[z][s] == spielstein
							&& spielbrett[z + 1][s + 1] == spielstein
							&& spielbrett[z + 2][s + 2] == spielstein
							&& spielbrett[z + 3][s + 3] == spielstein)

						System.out.println("Sieger" + name);
					}
				}
	
	}

	public static int gewonnenDiagonal2(char spielbrett[][],
						char spielstein, String name, int i) {

					for (int z = 0; z <= 2; z++) 
					{
						for (int s = 6; s >= 3; s--) 
							if (spielbrett[z][s] == spielstein
									&& spielbrett[z + 1][s - 1] == spielstein
									&& spielbrett[z + 2][s - 2] == spielstein
									&& spielbrett[z + 3][s - 3] == spielstein) {
								System.out.println( "Sieger" + name);	
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
	/*
	 * 1.if benutzen, um zu schauen, ob dort ein Spielstein ist und welche Farbe
	 * dieser hat 2. array hübsch formatieren 3. durch scannen lassen
	 */

}
