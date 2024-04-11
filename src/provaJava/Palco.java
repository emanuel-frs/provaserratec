package provaJava;

import java.text.SimpleDateFormat;

public class Palco {
	private String nomeDoPalco;
	private int capacidade;
	private SimpleDateFormat horarios;
	private Artista artista;
	
	public Palco(String nomeDoPalco, int capacidade, SimpleDateFormat horarios, Artista artista) {
		super();
		this.nomeDoPalco = nomeDoPalco;
		this.capacidade = capacidade;
		this.horarios = horarios;
		this.artista = artista;
	}
	public String getNomeDoPalco() {
		return nomeDoPalco;
	}
	public void setNomeDoPalco(String nomeDoPalco) {
		this.nomeDoPalco = nomeDoPalco;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public SimpleDateFormat getDatas() {
		return horarios;
	}
	public void setDatas(SimpleDateFormat datas) {
		this.horarios = datas;
	}
	@Override
	public String toString() {
		return String.format("%s:\nCapacidade:%s %nHorários:\n%s- %s",nomeDoPalco,capacidade,horarios,artista);
	}
	
	
}
