package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class TipoLlamada {

	public abstract double calcularMonto(int duracion);
	
	public double agregarIVA(double monto) {
		return monto*1.21;
	}
	
}
