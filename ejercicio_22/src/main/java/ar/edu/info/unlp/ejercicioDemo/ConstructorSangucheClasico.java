package ar.edu.info.unlp.ejercicioDemo;

public class ConstructorSangucheClasico extends Constructor {

	@Override
	Ingrediente agregarPan() {
		return new RealIngrediente("Pan Brioche", 100);
	}

	@Override
	Ingrediente agregarAderezo() {
		return new RealIngrediente("Mayonesa", 20);
	}

	@Override
	Ingrediente agregarPrincipal() {
		return new RealIngrediente("Carne de ternera", 300);
	}

	@Override
	Ingrediente agregarAdicional() {
		return new RealIngrediente("Tomate", 80);
	}

}
