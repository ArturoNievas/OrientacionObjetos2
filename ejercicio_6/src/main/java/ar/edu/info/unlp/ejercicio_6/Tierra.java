package ar.edu.info.unlp.ejercicio_6;

public class Tierra extends Atomica {

	@Override
	public double proporcionAgua() {
		return 0;
	}
	
	@Override
	public boolean equals(Tierra topografia) {
		return true;
	}
	
	@Override
	public boolean equals(Agua topografia) {
		return false;
	}

	@Override
	public boolean equals(Pantano topografia) {
		return false;
	}
	
}
