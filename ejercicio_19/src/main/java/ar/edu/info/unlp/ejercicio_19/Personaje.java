package ar.edu.info.unlp.ejercicio_19;

import java.util.List;

import arma.Arma;
import armadura.Armadura;
import habilidad.Habilidad;

public class Personaje {

	private String nombre;
	private double vida;
	private Arma arma;
	private Armadura armadura;
	private List<Habilidad> habilidades;

	public Personaje(String nombre, Arma arma, Armadura armadura, List<Habilidad> habilidades) {
		this.nombre = nombre;
		this.vida = 100;
		this.arma = arma;
		this.armadura = armadura;
		this.habilidades = habilidades;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public List<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}
	
	public void atacar(Personaje enemigo) {
		if (this.vida > 0) {
			enemigo.recibirDanio(this);
		}
	}
	
	public void recibirDanio(Personaje enemigo) {
		if (this.vida > 0) {
			double danio = enemigo.getArma().hacerDanio(this.armadura);
			if (this.vida -danio > 0) {
				this.vida = this.vida - danio;
			} else {
				this.vida = 0;
			}
		}
	}

}
