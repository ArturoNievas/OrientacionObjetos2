package ar.edu.info.unlp.ejercicio_6;

public class Agua extends Atomica {

	@Override
	public double proporcionAgua() {
		return 1;
	}

	@Override
	public boolean equals(Tierra topografia) {
		return false;
	}

	@Override
	public boolean equals(Agua topografia) {
		return true;
	}

	@Override
	public boolean equals(Pantano topografia) {
		return false;
	}

}
