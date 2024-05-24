package factory;

import ar.edu.info.unlp.ejercicio_19.Personaje;

import arma.*;
import armadura.*;
import habilidad.*;
import java.util.*;

public class CreadorArquero extends CreadorPersonaje {

	public Personaje crear(String nombre) {
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add(new CombateADistancia());
		return new Personaje(nombre, new Arco(), new ArmaduraCuero(), habilidades);
	}
	
}
