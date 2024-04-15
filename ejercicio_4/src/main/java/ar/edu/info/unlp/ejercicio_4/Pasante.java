package ar.edu.info.unlp.ejercicio_4;

public class Pasante extends Empleado {

	private int examenes;
	
	public Pasante(int examenes) {
		this.examenes = examenes;
	}
	
	public int getExamenes() {
		return examenes;
	}

	public void setExamenes(int examenes) {
		this.examenes = examenes;
	}

	@Override
	public double basico() {
		return 20000;
	}

	@Override
	public double adicional() {
		return this.examenes*2000;
	}

}
