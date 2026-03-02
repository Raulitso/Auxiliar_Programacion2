package tarea;

import java.util.Arrays;

public class Anime {
	public String nombre;
	public String genero;
	private int nroEpisodios;
	private String[] episodios;
	
	public Anime(String nombre, String genero, int nroEpisodios) {
		this.nombre = nombre;
		this.genero = genero;
		this.nroEpisodios = nroEpisodios;
	}
	
	@Override
	public String toString() {
		return "Anime [nombre=" + nombre + ", genero=" + genero + ", nroEpisodios=" + nroEpisodios + ", episodios="
				+ Arrays.toString(episodios) + "]";
	}

	
	
	

}
