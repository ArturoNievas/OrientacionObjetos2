package ar.edu.info.unlp.ejercicioDemo;

public class Sanguche {

	private Ingrediente pan;
	private Ingrediente aderezo;
	private Ingrediente principal;
	private Ingrediente adicional;
	
	public Sanguche(Ingrediente pan, Ingrediente aderezo, Ingrediente principal, Ingrediente adicional) {
		this.pan = pan;
		this.aderezo = aderezo;
		this.principal = principal;
		this.adicional = adicional;
	}

	public Ingrediente getPan() {
		return pan;
	}

	public void setPan(Ingrediente pan) {
		this.pan = pan;
	}

	public Ingrediente getAderezo() {
		return aderezo;
	}

	public void setAderezo(Ingrediente aderezo) {
		this.aderezo = aderezo;
	}

	public Ingrediente getPrincipal() {
		return principal;
	}

	public void setPrincipal(Ingrediente principal) {
		this.principal = principal;
	}

	public Ingrediente getAdicional() {
		return adicional;
	}

	public void setAdicional(Ingrediente adicional) {
		this.adicional = adicional;
	}
	
	public double calcularMonto() {
		return this.pan.getPrecio() + this.aderezo.getPrecio() + this.principal.getPrecio() + this.adicional.getPrecio();
 	}
}
