package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas;
	private ModoDeObtencion modoObtencion;
	
	public GestorNumerosDisponibles() {
		this.lineas = new TreeSet<String>();
		this.modoObtencion = new Ultimo();
	}

	public SortedSet<String> getLineas() {
		return lineas;
	}
	
	public boolean agregarNumeroTelefono(String str) {
		return this.lineas.add(str);
	}

	public String obtenerNumeroLibre() {
		String linea = this.modoObtencion.obtenerNumeroLibre(this.lineas);
		this.lineas.remove(linea);
		return linea;
	}

	public void cambiarTipoGenerador( ModoDeObtencion modoObtencion) {
		this.modoObtencion = modoObtencion;
	}
}
