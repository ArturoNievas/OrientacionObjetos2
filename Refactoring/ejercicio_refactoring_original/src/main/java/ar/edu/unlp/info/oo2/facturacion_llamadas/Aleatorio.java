package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class Aleatorio extends ModoDeObtencion {

	@Override
	public String obtenerNumeroLibre(SortedSet<String> lineas) {
		Random random = new Random();
		return new ArrayList<String>(lineas)
				.get(random.nextInt(lineas.size()));
	}

}
