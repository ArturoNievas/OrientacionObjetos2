package ar.edu.info.unlp.ejercicio_7;

import java.util.*;

public class Archivo extends Elemento {

	private int tamanio;
	
	public Archivo(String nombre, int tamanio) {
		super(nombre);
		this.tamanio = tamanio;
	}

	@Override
	public int tamanio() {
		return this.tamanio;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	@Override
	public Elemento buscar(String nombre) {
		if (this.nombre.equals(nombre)) {
			return this;
		} else {
			return null;
		}
	}

	@Override
	public List<Elemento> buscarTodos(String nombre) {
		List<Elemento> l = new ArrayList<Elemento>();
		if (this.nombre.equals(nombre)) {
			l.add(this);
		}
		return l;
	}

	@Override
	public String listadoDeContenido(String padre) {
		return padre + "/" + this.nombre + "\n";
	}

}
