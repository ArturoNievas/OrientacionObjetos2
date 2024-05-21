package ar.edu.info.unlp.ejercicio_15;

public class AspectNombre extends Aspect {

	public AspectNombre(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getNombre();
	}
}
