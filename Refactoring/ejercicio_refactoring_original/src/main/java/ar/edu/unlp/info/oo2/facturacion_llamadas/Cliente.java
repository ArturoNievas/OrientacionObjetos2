package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	protected List<Llamada> llamadas;
	private String nombre;
	private String numeroTelefono;

	public Cliente(String nombre, String numeroTelefono) {
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public List<Llamada> getLlamadas(){
		return this.llamadas;
	}
	
	public Llamada registrarLlamada(Cliente destino, TipoLlamada tipoLlamada, int duracion) {
		Llamada llamada = new Llamada(tipoLlamada, this.numeroTelefono, destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		return llamada;
	}
	
	public abstract double calcularMontoTotalLlamadas();
	
	
}
