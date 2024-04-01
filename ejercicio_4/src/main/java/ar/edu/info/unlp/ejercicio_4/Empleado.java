package ar.edu.info.unlp.ejercicio_4;

public abstract class Empleado {
	
	public double sueldo() {
		return this.basico() + this.adicional() - this.descuento();
	}
	
	public abstract double basico();
	public abstract double adicional();
	public abstract double descuento();
	
}
