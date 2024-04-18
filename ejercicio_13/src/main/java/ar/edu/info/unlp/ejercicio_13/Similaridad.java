package ar.edu.info.unlp.ejercicio_13;

import java.util.List;

public class Similaridad implements Sugerencia {

	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador deco) {
		return deco.getReproducidas().stream().map(r -> r.getSimilares()).flatMap(List::stream).distinct().limit(3).toList();
	}

}
