package factory;

import ar.edu.info.unlp.ejercicio_19.Personaje;
import arma.*;
import armadura.*;
import habilidad.*;
import java.util.*;

public class CreadorGuerrero extends CreadorPersonaje {

	public Personaje crear(String nombre) {
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add(new CombateCuerpoACuerpo());
		return new Personaje(nombre, new Espada(), new ArmaduraAcero(), habilidades);
	}
	
}
