package model;

import java.awt.Color;

public class Spieler {

	/*
	 * Hier stehen die Variablen fuer die Klasse Spieler
	 */
	private String name;
	public Color farbe;
	Spielstein spielstein = new Spielstein(Color.blue);

	/* Konstruktor ohne Werte fuer Variablen */
	public Spieler() {

	}

	/*
	 * Konstruktor mit Wert fuer die Variable "name"
	 */
	public Spieler(String name) {
		this.name = name;
	}

	/*
	 * Getter
	 */
	public String getName() {
		return name;
	}

	/*
	 * Setter
	 */
	public void setName(String name) {
		this.name = name;
	}

}
