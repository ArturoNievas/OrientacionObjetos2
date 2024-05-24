package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends TipoLlamada {

	@Override
	public double calcularMonto(int duracion) {
		double monto = duracion*150;
		return agregarIVA(monto) + 50;
	}

}
