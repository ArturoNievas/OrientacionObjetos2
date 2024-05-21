package ar.edu.info.unlp.ejercicio_7;

import java.util.*;

public class Directorio extends Elemento {
	
	private List<Elemento> contenido;
	
	public Directorio(String nombre) {
		super(nombre);
		this.contenido = new ArrayList<Elemento>();
	}
	
	public void agregar(Elemento elemento) {
		this.contenido.add(elemento);
	}

	@Override
	public int tamanio() {
		return this.contenido.stream().mapToInt(e -> e.tamanio()).sum() + 32*1024;
	}
	
	@Override
	public Archivo archivoMasGrande() {
		return this.contenido.stream().map(e -> e.archivoMasGrande()).filter(a -> a!= null).max(Comparator.comparingInt(Archivo::tamanio)).orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this.contenido.stream().map(e -> e.archivoMasNuevo()).filter(a -> a!= null).max((f1,f2) -> f1.getFechaDeCreacion().compareTo(f2.getFechaDeCreacion())).orElse(null);
	}

	@Override
	public Elemento buscar(String nombre) {
		if (this.nombre.equals(nombre)) {
			return this;
		} else {
			return this.contenido.stream().map(e -> e.buscar(nombre)).filter(e -> e !=null).findFirst().orElse(null);
		}
	}

	@Override
	public List<Elemento> buscarTodos(String nombre) {
		List<Elemento> l = new ArrayList<Elemento>();
		if (this.nombre.equals(nombre)) {
			l.add(this);
		}
		this.contenido.stream().forEach(e -> l.addAll(e.buscarTodos(nombre)));
		return l;
	}

	@Override
	public String listadoDeContenido(String padre) {
		String padreNuevo = padre + "/" + this.nombre;
		StringBuilder listado = new StringBuilder(padreNuevo).append("\n");
	    if (!this.contenido.isEmpty()) {
	        this.contenido.forEach(e -> listado.append(e.listadoDeContenido(padreNuevo)));
	    }
	    return listado.toString();
	}

}
