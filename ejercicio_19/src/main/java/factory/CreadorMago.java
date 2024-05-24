package factory;

import ar.edu.info.unlp.ejercicio_19.Personaje;
import arma.*;
import armadura.*;
import habilidad.*;
import java.util.*;

public class CreadorMago extends CreadorPersonaje {

	public Personaje crear(String nombre) {
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add(new Magia());
		habilidades.add(new CombateADistancia());
		return new Personaje(nombre, new BastonMago(), new ArmaduraCuero(), habilidades);
	}
}
