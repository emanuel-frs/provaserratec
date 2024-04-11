package provaJava;

import provaJava.Genero;

public class Artista {
	private String nome;
	private double cache;
	Genero genero;
	public Artista(String nome, double cache, Genero genero) {
		super();
		this.nome = nome;
		this.cache = cache;
		this.genero = genero;
	}
	public double getCache() {
		return cache;
	}
	public void setCache(double cache) {
		this.cache = cache;
	}
	public String getNome() {
		return nome;
	}
	public Genero getGenero() {
		return genero;
	}
	@Override
	public String toString() {
		return nome;
	}
	
	
}
