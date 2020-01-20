package model;

public class Spielbrett {

	/*
	 * Dieses 2-dim Array repräsentiert das Spielbrett mit 6 Reihen und 7 Spalten.
	 */
	private Spielstein[][] spielbrett = new Spielstein[7][6];

	public String Color;

	/* Konstruktor ohne Wert */
	public Spielbrett() {

	};

	public Spielstein getSpielsteinVonSpielfeld(int zeile, int spalte) {
		return spielbrett[spalte][zeile];

	}

	public void setSpielstein(int zeile, int spalte, java.awt.Color farbe) {
		spielbrett[spalte][zeile] = new Spielstein(farbe);
	}

	/* Konstruktor ohne Wert */

	/* Wert mit Konstruktor fuer Variable "spielstein" */

	public Spielbrett(String farbe) {
		this.Color = farbe;

	}

	/* Getter */
	public String getColor() {
		return Color;

	}

	public int ermittleErsteFreieStelle(int spalte) {
		for (int i = 0; i < spielbrett[spalte].length; i++)
			if (getSpielsteinVonSpielfeld(i, spalte) == null)
				return i;
		return -1;

	}

	public void setzeSpielsteinAnErsteFreieStelle(int spalte, java.awt.Color farbe) {
		int zeile = ermittleErsteFreieStelle(spalte);

		setSpielstein(zeile, spalte, farbe);
	}

	public Spielstein[][] getSpielbrett() {
		return spielbrett;
	}

}
