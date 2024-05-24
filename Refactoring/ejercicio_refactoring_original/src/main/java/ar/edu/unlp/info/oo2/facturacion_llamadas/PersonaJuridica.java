package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaJuridica extends Cliente {

	private String ciut;
	static double descuentoJur = 0.15;
	
	public PersonaJuridica(String nombre, String numeroTelefono, String ciut) {
		super(nombre, numeroTelefono);
		this.ciut = ciut;
	}

	public String getCuit() {
		return ciut;
	}

	public void setCuit(String ciut) {
		this.ciut = ciut;
	}
	
	public double calcularMontoTotalLlamadas() {
		return this.llamadas.stream().mapToDouble(l -> l.calcularMonto()*(1-descuentoJur)).sum();
	}
}
