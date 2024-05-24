package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends TipoLlamada {

	@Override
	public double calcularMonto(int duracion) {
		double monto = duracion*3;
		return agregarIVA(monto);
	}

}
