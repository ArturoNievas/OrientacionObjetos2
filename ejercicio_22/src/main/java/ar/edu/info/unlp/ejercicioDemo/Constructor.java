package ar.edu.info.unlp.ejercicioDemo;

public abstract class Constructor {

	public Constructor(){
		
	}
	
	abstract Ingrediente agregarPan();
	abstract Ingrediente agregarAderezo();
	abstract Ingrediente agregarPrincipal();
	abstract Ingrediente agregarAdicional();
	
	public Sanguche obtenerSanguche() {
		return new Sanguche(this.agregarPan(),this.agregarAderezo(),this.agregarPrincipal(),this.agregarAdicional());
	}
}
