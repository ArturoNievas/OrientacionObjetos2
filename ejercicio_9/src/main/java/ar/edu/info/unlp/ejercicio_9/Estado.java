package ar.edu.info.unlp.ejercicio_9;

public abstract class Estado {

	public abstract void inscribir(Excursion excursion, Usuario usuario);
	public abstract String obtenerInformacion(Excursion excursion);
}
