package ar.edu.info.unlp.ejercicio_15;

import java.time.LocalDateTime;

public abstract class Aspect implements FileOO2 {
	
	protected FileOO2 component;

	public Aspect(FileOO2 component) {
		this.component = component;
	}

	@Override
	public String prettyPrint() {
		return this.component.prettyPrint() + " ";
	}

	@Override
	public String getNombre() {
		return this.component.getNombre();
	}

	@Override
	public String getExtension() {
		return this.component.getExtension();
	}

	@Override
	public int getTamanio() {
		return this.component.getTamanio();
	}

	@Override
	public LocalDateTime getFechaDeCreacion() {
		return this.component.getFechaDeCreacion();
	}

	@Override
	public LocalDateTime getFechaDeModificacion() {
		return this.component.getFechaDeModificacion();
	}

	@Override
	public String getPermisos() {
		return this.component.getPermisos();
	}

}
