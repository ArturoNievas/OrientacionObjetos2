package ar.edu.info.unlp.ejercicioDemo;

public class ConstructorSangucheVegano extends Constructor {

	@Override
	Ingrediente agregarPan() {
		return new RealIngrediente("Pan integral", 100);
	}

	@Override
	Ingrediente agregarAderezo() {
		return new RealIngrediente("Salsa criolla", 20);
	}

	@Override
	Ingrediente agregarPrincipal() {
		return new RealIngrediente("Milanesa de girgolas", 500);
	}

	@Override
	Ingrediente agregarAdicional() {
		return new NullIngrediente();
	}

}
