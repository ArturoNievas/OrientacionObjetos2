package ar.edu.info.unlp.ejercicio_11;

public class Construccion extends Etapa {

	@Override
	public void aprobarEtapa(Proyecto proyecto) {
		if (proyecto.precioDelProyecto() > 0) {
			proyecto.setEtapa(new Evaluacion());
		} else {
			throw new RuntimeException("Error: No se puede aprobar un proyecto cuyo precio es 0");
		}
	}

	@Override
	public void modificarMargenDeGanancia(Proyecto proyecto, double porcentaje) {
		if (porcentaje >= 8 && porcentaje <=10) {
			proyecto.setMargenDeGanancia(porcentaje);
		}
	}

	@Override
	public void cancelarProyecto(Proyecto proyecto) {
		proyecto.setObjetivo("Cancelado");
		proyecto.setEtapa(new Cancelado());
	}

}
