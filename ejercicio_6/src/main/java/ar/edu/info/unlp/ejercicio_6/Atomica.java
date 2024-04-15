package ar.edu.info.unlp.ejercicio_6;

public abstract class Atomica extends Topografia {

	@Override
	public boolean equals(Topografia topografia) {
		return topografia.equals(this);
	}
	
	@Override
	public boolean equals(Atomica topografia) {
		return topografia.equals(this);
	}
	
	@Override
	public boolean equals(Compuesta topografia) {
		return false;
	}
	
	public abstract boolean equals(Tierra topografia);
	public abstract boolean equals(Agua topografia);
	public abstract boolean equals(Pantano topografia);
	
}
