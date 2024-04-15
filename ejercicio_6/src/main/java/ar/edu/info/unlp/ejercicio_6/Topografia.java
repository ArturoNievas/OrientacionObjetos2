package ar.edu.info.unlp.ejercicio_6;

public abstract class Topografia {

	public Topografia(){
		
	}
	
	public double proporcionTierra() {
		return 1 - this.proporcionAgua();
	}
	
	public abstract double proporcionAgua();
	public abstract boolean equals(Topografia topografia);
	public abstract boolean equals(Atomica topografia);
	public abstract boolean equals(Compuesta topografia);
}
