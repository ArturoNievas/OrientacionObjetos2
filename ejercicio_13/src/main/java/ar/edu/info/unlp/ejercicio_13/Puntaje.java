package ar.edu.info.unlp.ejercicio_13;

import java.util.*;

public class Puntaje implements Sugerencia {
	
	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador deco) {
		return deco.getGrillaDePeliculas().stream().sorted(Comparator.comparingDouble(Pelicula::getPuntaje).thenComparingDouble(Pelicula::getAnioDeEstreno).reversed()).limit(3).toList();
	}

}