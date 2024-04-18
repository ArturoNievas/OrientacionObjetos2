package ar.edu.info.unlp.ejercicio_13;

import java.util.Comparator;
import java.util.List;

public class Novedad implements Sugerencia {

	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador deco) {
		return deco.getGrillaDePeliculas().stream().sorted(Comparator.comparingInt(Pelicula::getAnioDeEstreno).reversed()).limit(3).toList();
	}

}
