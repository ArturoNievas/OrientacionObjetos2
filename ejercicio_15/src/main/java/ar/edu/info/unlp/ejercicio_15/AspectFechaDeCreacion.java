package ar.edu.info.unlp.ejercicio_15;

public class AspectFechaDeCreacion extends Aspect {

	public AspectFechaDeCreacion(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.component.getFechaDeCreacion().toString();
	}
}
