package ar.edu.info.unlp.ejercicio_11;

public class Confirmado extends Etapa {

	@Override
	public void aprobarEtapa(Proyecto proyecto) {

	}

	@Override
	public void modificarMargenDeGanancia(Proyecto proyecto, double porcentaje) {
		
	}

	@Override
	public void cancelarProyecto(Proyecto proyecto) {
		proyecto.setObjetivo("Cancelado");
		proyecto.setEtapa(new Cancelado());
	}

}
