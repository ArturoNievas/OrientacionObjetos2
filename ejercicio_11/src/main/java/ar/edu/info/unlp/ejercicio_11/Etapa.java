package ar.edu.info.unlp.ejercicio_11;

public abstract class Etapa {

	public abstract void aprobarEtapa(Proyecto proyecto);
	public abstract void modificarMargenDeGanancia(Proyecto proyecto, double porcentaje);
	public abstract void cancelarProyecto(Proyecto proyecto);
	
}
