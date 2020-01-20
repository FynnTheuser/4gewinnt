package model;

import java.awt.Color;

public class Spieler {

	/*
	 * Hier stehen die Variablen fuer die Klasse Spieler
	 */
	private String name;
	private Color farbe;

	/*
	 * Konstruktor mit Wert fuer die Variable "name"
	 */
	public Spieler(String name, Color farbe) {
		this.name = name;
		this.farbe = farbe;
	}

	/*
	 * Getter
	 */
	public String getName() {
		return name;
	}

	public Color getFarbe() {
		return farbe;
	}
}
