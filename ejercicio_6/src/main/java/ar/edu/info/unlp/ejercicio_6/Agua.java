package ar.edu.info.unlp.ejercicio_6;

public class Agua extends Atomica {

	@Override
	public double proporcionAgua() {
		return 1;
	}

	@Override
	public boolean equalsAgua() {
		return true;
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
	public boolean equals(Topografia topografia) {
		return topografia.equalsAgua();
	}


}
