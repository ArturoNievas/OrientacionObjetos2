package ar.edu.info.unlp.ejercicio_6;

public abstract class Topografia {

	public Topografia(){
		
	}
	
	public double proporcionTierra() {
		return 1 - this.proporcionAgua();
	}
	
	public abstract double proporcionAgua();
	
	public abstract boolean equals(Topografia topografia);
	public abstract boolean equalsAgua();
	public abstract boolean equalsTierra();
	public abstract boolean equalsPantano();
	public abstract boolean equalsCompuesta(Compuesta topografia);
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if (!(o instanceof Topografia)) {
			return false;
		}
		return this.equals((Topografia) o);
	}
}
