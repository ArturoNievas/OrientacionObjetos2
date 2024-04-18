package ar.edu.info.unlp.ejercicio_6;

public class Pantano extends Atomica {

	@Override
	public double proporcionAgua() {
		return 0.7;
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
		return true;
	}

	@Override
	public boolean equals(Topografia topografia) {
		return topografia.equalsPantano();
	}
}
