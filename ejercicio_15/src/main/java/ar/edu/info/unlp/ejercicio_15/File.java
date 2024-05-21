package ar.edu.info.unlp.ejercicio_15;

import java.time.LocalDateTime;

public class File implements FileOO2 {

	private String nombre;
	private String extension;
	private int tamanio;
	private LocalDateTime fechaDeCreacion;
	private LocalDateTime fechaDeModificacion;
	private String permisos;
	
	public File(String nombre, String extension, int tamanio, String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
		this.permisos = permisos;
		this.fechaDeCreacion = LocalDateTime.now();
		this.fechaDeModificacion = LocalDateTime.now();
	}

	@Override
	public String prettyPrint() {
		return "Datos:";
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getExtension() {
		return this.extension;
	}

	@Override
	public int getTamanio() {
		return this.tamanio;
	}

	@Override
	public LocalDateTime getFechaDeCreacion() {
		return this.fechaDeCreacion;
	}

	@Override
	public LocalDateTime getFechaDeModificacion() {
		return this.fechaDeModificacion;
	}

	@Override
	public String getPermisos() {
		return this.permisos;
	}
	
	public void modificar() {
		this.fechaDeModificacion = LocalDateTime.now();
	}

}
