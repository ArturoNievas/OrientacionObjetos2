package ar.edu.info.unlp.ejercicio_9;

public class Provisoria extends Estado {

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) {
		excursion.agregarInscripto(usuario);
		if (excursion.getInscriptos().size() == excursion.getCupoMinimo()) {
			excursion.setEstado(new Definitiva());
		}
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return excursion.getNombre() + "\n"
				+ "Costo: " + excursion.getCosto() + "\n"
				+ "Fecha de inicio: " + excursion.getComienzo() + "\n"
				+ "Fecha de fin: " + excursion.getFin() + "\n"
				+ "Punto de encuentro: " + excursion.getPuntoDeEncuentro() + "\n"
				+ "Cantidad faltante para completar el cupo minimo: " + (excursion.getCupoMinimo() - excursion.getInscriptos().size());
	}

}
