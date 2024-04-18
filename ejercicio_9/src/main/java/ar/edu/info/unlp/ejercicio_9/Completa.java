package ar.edu.info.unlp.ejercicio_9;

public class Completa extends Estado {

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) {
		excursion.agregarAListaDeEspera(usuario);
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return excursion.getNombre() + "\n"
				+ "Costo: " + excursion.getCosto() + "\n"
				+ "Fecha de inicio: " + excursion.getComienzo() + "\n"
				+ "Fecha de fin: " + excursion.getFin() + "\n"
				+ "Punto de encuentro: " + excursion.getPuntoDeEncuentro() + "\n";
	}

}
