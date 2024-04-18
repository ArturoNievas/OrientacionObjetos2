package ar.edu.info.unlp.ejercicio_9;

import java.time.*;
import java.util.*;

public class Excursion {
	
	private String nombre;
	private LocalDateTime comienzo;
	private LocalDateTime fin;
	private Estado estado;
	private String puntoDeEncuentro;
	private int cupoMinimo;
	private int cupoMaximo;
	private double costo;
	private List<Usuario> inscriptos;
	private List<Usuario> listaDeEspera;
	
	public Excursion(String nombre, LocalDateTime comienzo, LocalDateTime fin, String puntoDeEncuentro, int cupoMinimo,
			int cupoMaximo, double costo) {
		this.nombre = nombre;
		this.comienzo = comienzo;
		this.fin = fin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.costo = costo;
		this.estado = new Provisoria();
		this.inscriptos = new ArrayList<Usuario>();
		this.listaDeEspera = new ArrayList<Usuario>();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDateTime getComienzo() {
		return comienzo;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}
	
	public double getCosto() {
		return costo;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public List<Usuario> getListaDeEspera() {
		return listaDeEspera;
	}

	public void inscribir(Usuario usuario) {
		this.estado.inscribir(this, usuario);
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion(this);
	}
	
	public void agregarInscripto(Usuario usuario) {
		this.inscriptos.add(usuario);
	}
	
	public void agregarAListaDeEspera(Usuario usuario) {
		this.listaDeEspera.add(usuario);
	}

}
