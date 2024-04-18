package ar.edu.info.unlp.ejercicio_13;

import java.util.*;

public class Pelicula {
	
	private String titulo;
	private int anioDeEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, int anioDeEstreno, double puntaje) {
		this.titulo = titulo;
		this.anioDeEstreno = anioDeEstreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioDeEstreno() {
		return anioDeEstreno;
	}

	public void setAnioDeEstreno(int anioDeEstreno) {
		this.anioDeEstreno = anioDeEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}
	
	public void agregarSimilar(Pelicula pelicula) {
		if (!this.similares.contains(pelicula)) {
			this.similares.add(pelicula);
			pelicula.agregarSimilar(this);
		}
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}

}
