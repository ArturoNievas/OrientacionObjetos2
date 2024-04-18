package ar.edu.info.unlp.ejercicio_6;

import java.util.*;

public class Compuesta extends Topografia {
	
	private List<Topografia> topografias;
	
	public Compuesta(Topografia topografia1, Topografia topografia2, Topografia topografia3, Topografia topografia4) {
		this.topografias = new ArrayList<Topografia>();
		this.topografias.add(topografia1);
		this.topografias.add(topografia2);
		this.topografias.add(topografia3);
		this.topografias.add(topografia4);
	}
	
	public List<Topografia> getTopografias(){
		return this.topografias;
	}
	
	@Override
	public double proporcionTierra() {
		return this.topografias.stream().mapToDouble(t -> t.proporcionTierra()).sum()/4;
	}

	@Override
	public double proporcionAgua() {
		return this.topografias.stream().mapToDouble(t -> t.proporcionAgua()).sum()/4;
	}

	@Override
	public boolean equals(Topografia topografia) {
		return topografia.equalsCompuesta(this);
	}

	@Override
	public boolean equalsAgua() {
		return false;
	}

	@Override
	public boolean equalsTierra() {
		return false;
	}

	@Override
	public boolean equalsPantano() {
		return false;
	}

	@Override
	public boolean equalsCompuesta(Compuesta topografia) {
		return this.topografias.equals(topografia.getTopografias());
	}
	
	

}
