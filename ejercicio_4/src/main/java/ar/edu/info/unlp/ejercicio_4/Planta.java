package ar.edu.info.unlp.ejercicio_4;

public class Planta extends Empleado {

	private boolean casado;
	private int hijes;
	private int antiguedad;

	public Planta(boolean casado, int hijes, int antiguedad) {
		super();
		this.casado = casado;
		this.hijes = hijes;
		this.antiguedad = antiguedad;
	}

	@Override
	public double basico() {
		return 50000;
	}

	@Override
	public double adicional() {
		double adicional = 0;
		if (this.casado) {
			adicional += 5000;
		}
		return adicional + this.hijes*2000 + this.antiguedad*2000;
	}

	@Override
	public double descuento() {
		return 0.13*this.basico() + 0.05*this.adicional();
	}

}
