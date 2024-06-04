package ar.edu.info.unlp.ejercicioDemo;

public class ConstructorSangucheVegetariano extends Constructor {

	@Override
	Ingrediente agregarPan() {
		return new RealIngrediente("Pan con semillas", 120);
	}

	@Override
	Ingrediente agregarAderezo() {
		return new NullIngrediente();
	}

	@Override
	Ingrediente agregarPrincipal() {
		return new RealIngrediente("Provoleta grillada", 200);
	}

	@Override
	Ingrediente agregarAdicional() {
		return new RealIngrediente("Berenjenas al escabeche", 100);
	}

}
