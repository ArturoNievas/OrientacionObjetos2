package ar.edu.info.unlp.ejercicio_9;

public class Definitiva extends Estado {

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) {
		excursion.agregarInscripto(usuario);
		if (excursion.getInscriptos().size() == excursion.getCupoMaximo()) {
			excursion.setEstado(new Completa());
		}
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		StringBuilder correos = new StringBuilder("");
		excursion.getInscriptos().forEach(e -> correos.append(e.getEmail() + "\n"));
		
		return excursion.getNombre() + "\n"
				+ "Costo: " + excursion.getCosto() + "\n"
				+ "Fecha de inicio: " + excursion.getComienzo() + "\n"
				+ "Fecha de fin: " + excursion.getFin() + "\n"
				+ "Punto de encuentro: " + excursion.getPuntoDeEncuentro() + "\n"
				+ "Direcciones de correo de los inscriptos: \n"
				+ correos.toString()
				+ "Cantidad faltante para completar el cupo maximo: " + (excursion.getCupoMaximo() - excursion.getInscriptos().size());
	}

}
