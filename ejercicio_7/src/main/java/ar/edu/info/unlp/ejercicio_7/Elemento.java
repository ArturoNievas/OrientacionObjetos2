package ar.edu.info.unlp.ejercicio_7;

import java.time.LocalDate;
import java.util.*;

public abstract class Elemento {

	protected String nombre;
	protected LocalDate fechaDeCreacion;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
		this.fechaDeCreacion = LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	
	public abstract int tamanio();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract Elemento buscar(String nombre);
	public abstract List<Elemento> buscarTodos(String nombre);
	public abstract String listadoDeContenido(String padre);
	
}
