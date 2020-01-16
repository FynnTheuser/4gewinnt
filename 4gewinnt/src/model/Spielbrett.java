package model;

public class Spielbrett {

	/*
	 * Dieses 2-dim Array repräsentiert das Spielbrett mit 6 Reihen und 7 Spalten.
	 */
	private Spielstein[][] spielbrett = new Spielstein[6][7];

	public Spielbrett() {

	};

	public Spielstein getSpielsteinVonSpielfeld(int zeile, int spalte) {
		return spielbrett[zeile][spalte];

	}
}