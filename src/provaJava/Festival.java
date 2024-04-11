package provaJava;

import java.text.SimpleDateFormat;

public class Festival {
	public static void main(String[] args) {
		Artista artista = new Artista("eu", 3000, null);
		Palco palco = new Palco("Palco Principal",2000,
				new SimpleDateFormat("12/12/2021'T'19:30"),
				new Artista("Emanuel", 0, null));
		System.out.println(palco);
	}
}
