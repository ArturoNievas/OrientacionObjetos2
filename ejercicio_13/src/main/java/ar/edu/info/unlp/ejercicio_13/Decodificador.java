package ar.edu.info.unlp.ejercicio_13;

import java.util.*;

public class Decodificador {
	
	private Sugerencia sugerencia;
	private List<Pelicula> grillaDePeliculas;
	private List<Pelicula> reproducidas;
	
	public Decodificador(Sugerencia sugerencia) {
		this.sugerencia = sugerencia;
		this.grillaDePeliculas = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
	}

	public Sugerencia getSugerencia() {
		return sugerencia;
	}

	public void configurarSugerencias(Sugerencia sugerencia) {
		this.sugerencia = sugerencia;
	}

	public List<Pelicula> getGrillaDePeliculas() {
		return new ArrayList<Pelicula>(grillaDePeliculas);
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		this.grillaDePeliculas.add(pelicula);
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return this.sugerencia.sugerirPeliculas(this);
	}
	
	public void reproducirPelicula(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}
	
	public List<Pelicula> getReproducidas(){
		return this.reproducidas;
	}

}
