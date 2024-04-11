package provaJava;

import java.util.Scanner;

public enum Genero {
	ROCK("Rock"),
	POP("Pop"),
	INDIE("Indie"),
	FUNK("Funk"),
	FORRO("Forró"),
	PAGODE("Pagode");
	
	Scanner sc = new Scanner(System.in);
	private String genero;
		Genero(String genero) {
			this.genero = genero;
	}
	public String getGenero() {
		return genero;
	}
	public String toString() {
		return genero;
	}
}
