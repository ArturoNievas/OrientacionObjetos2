package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaFisica extends Cliente {

	private String dni;
	static double descuentoFis = 0;
	
	public PersonaFisica(String nombre, String numeroTelefono, String dni) {
		super(nombre, numeroTelefono);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public double calcularMontoTotalLlamadas() {
		return this.llamadas.stream().mapToDouble(l -> l.calcularMonto()*(1-descuentoFis)).sum();
	}

}
