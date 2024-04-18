package ar.edu.info.unlp.ejercicio_11;

public class Evaluacion extends Etapa {

	@Override
	public void aprobarEtapa(Proyecto proyecto) {
		proyecto.setEtapa(new Confirmado());
	}

	@Override
	public void modificarMargenDeGanancia(Proyecto proyecto, double porcentaje) {
		if (porcentaje >= 11 && porcentaje <=15) {
			proyecto.setMargenDeGanancia(porcentaje);
		}
	}

	@Override
	public void cancelarProyecto(Proyecto proyecto) {
		proyecto.setObjetivo("Cancelado");
		proyecto.setEtapa(new Cancelado());
	}

}
