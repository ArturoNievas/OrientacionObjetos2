package ar.edu.info.unlp.ejercicio_15;

import java.time.*;

public interface FileOO2 {

	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public int getTamanio();
	public LocalDateTime getFechaDeCreacion();
	public LocalDateTime getFechaDeModificacion();
	public String getPermisos();
	
	
}
