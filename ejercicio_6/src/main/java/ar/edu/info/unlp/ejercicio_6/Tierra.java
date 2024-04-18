package ar.edu.info.unlp.ejercicio_6;

public class Tierra extends Atomica {

	@Override
	public double proporcionAgua() {
		return 0;
	}

	@Override
	public boolean equalsAgua() {
		return false;
	}

	@Override
	public boolean equalsTierra() {
		return true;
	}

	@Override
	public boolean equalsPantano() {
		return false;
	}

	@Override
	public boolean equals(Topografia topografia) {
		return topografia.equalsTierra();
	}

	
	
}
