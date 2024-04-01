package ar.edu.info.unlp.ejercicio_4;

public class Temporario extends Empleado {

	private int horasTrabajadas;
	private boolean casado;
	private int hijes;
	
	public Temporario(int horasTrabajadas, boolean casado, int hijes) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.casado = casado;
		this.hijes = hijes;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getHijes() {
		return hijes;
	}

	public void setHijes(int hijes) {
		this.hijes = hijes;
	}

	@Override
	public double basico() {
		return 20000 + this.horasTrabajadas*300;
	}

	@Override
	public double adicional() {
		double adicional = 0;
		if (this.casado) {
			adicional += 5000;
		}
		return adicional + this.hijes*2000;
	}

	@Override
	public double descuento() {
		return 0.13*this.basico() + 0.05*this.adicional();
	}

}
