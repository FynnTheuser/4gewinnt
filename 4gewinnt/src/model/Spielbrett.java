package model;

import java.awt.Color;

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

	public boolean setzeSpielsteinAnErsteFreieStelle(int spalte, java.awt.Color farbe) {
		int zeile = ermittleErsteFreieStelle(spalte);

		setSpielstein(zeile, spalte, farbe);
		return gewinnBedingungVierNebeneinander(zeile, spalte, farbe);

	}

	public Spielstein[][] getSpielbrett() {
		return spielbrett;
	}

	public int getAnzahlSelberFarbeRelativZuPosition(Color farbe, int aktuelleSpalte, int aktuelleZeile,
			int richtungSpalte, int richtungZeile) {
		Color steinfarbe = null;
		int anzahl = 0;
		boolean istGleicheFarbe = false;
		do {
			aktuelleSpalte += richtungSpalte;
			aktuelleZeile += richtungZeile;
			if (!(aktuelleSpalte < 0 || aktuelleSpalte >= spielbrett.length || aktuelleZeile < 0
					|| aktuelleZeile >= spielbrett[aktuelleSpalte].length)) {

				Spielstein spielstein = spielbrett[aktuelleSpalte][aktuelleZeile];
				if (spielstein == null)
					return anzahl;
				else
					steinfarbe = spielstein.getFarbe();
				if (farbe.equals(steinfarbe)) {
					anzahl++;
					istGleicheFarbe = true;

				} else
					return anzahl;
			} else
				return anzahl;

		} while (istGleicheFarbe);
		return anzahl;
	}

	public boolean waagerechtGewonnen(Color farbe, int aktuelleZeile, int aktuelleSpalte) {
		int anzahlGleicherFarbe = 1;
		anzahlGleicherFarbe += getAnzahlSelberFarbeRelativZuPosition(farbe, aktuelleZeile, aktuelleSpalte, -1, 0);
		anzahlGleicherFarbe += getAnzahlSelberFarbeRelativZuPosition(farbe, aktuelleZeile, aktuelleSpalte, 1, 0);
		return anzahlGleicherFarbe >= 4;
	}

	public boolean diagonalGewonnen1(Color farbe, int aktuelleZeile, int aktuelleSpalte) {
		int anzahlGleicherFarbe = 1;
		anzahlGleicherFarbe += getAnzahlSelberFarbeRelativZuPosition(farbe, aktuelleZeile, aktuelleSpalte, -1, 1);
		anzahlGleicherFarbe += getAnzahlSelberFarbeRelativZuPosition(farbe, aktuelleZeile, aktuelleSpalte, 1, -1);
		return anzahlGleicherFarbe >= 4;

	}

	public boolean diagonalGewonnen2(Color farbe, int aktuelleZeile, int aktuelleSpalte) {
		int anzahlGleicherFarbe = 1;
		anzahlGleicherFarbe += getAnzahlSelberFarbeRelativZuPosition(farbe, aktuelleZeile, aktuelleSpalte, 1, 1);
		anzahlGleicherFarbe += getAnzahlSelberFarbeRelativZuPosition(farbe, aktuelleZeile, aktuelleSpalte, -1, -1);
		return anzahlGleicherFarbe >= 4;
	}

	public boolean senkrechtGewonnen(Color farbe, int aktuelleZeile, int aktuelleSpalte) {
		int anzahlGleicherFarbe = 1;
		anzahlGleicherFarbe += getAnzahlSelberFarbeRelativZuPosition(farbe, aktuelleZeile, aktuelleSpalte, 0, -1);
		return anzahlGleicherFarbe >= 4;
	}

	public boolean gewinnBedingungVierNebeneinander(int aktuelleSpalte, int aktuelleZeile, Color farbe) {
		if (waagerechtGewonnen(farbe, aktuelleZeile, aktuelleSpalte))
			return true;
		if (senkrechtGewonnen(farbe, aktuelleZeile, aktuelleSpalte))
			return true;
		if (diagonalGewonnen1(farbe, aktuelleZeile, aktuelleSpalte))
			return true;
		if (diagonalGewonnen2(farbe, aktuelleZeile, aktuelleSpalte))
			return true;
		return false;
	}

}
