package model;

public class Spieler {

	/*
	 * Hier stehen die Variablen fuer die Klasse Spieler
	 */
	private String name;

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
