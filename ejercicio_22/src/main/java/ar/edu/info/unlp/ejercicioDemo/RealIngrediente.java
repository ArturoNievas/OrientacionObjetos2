package ar.edu.info.unlp.ejercicioDemo;

public class RealIngrediente implements Ingrediente{

	private String tipo;
	private double precio;
	
	public RealIngrediente(String tipo, double precio) {
		this.tipo = tipo;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
