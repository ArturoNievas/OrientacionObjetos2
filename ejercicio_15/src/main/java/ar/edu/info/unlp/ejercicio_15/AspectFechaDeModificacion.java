package ar.edu.info.unlp.ejercicio_15;

public class AspectFechaDeModificacion extends Aspect {

	public AspectFechaDeModificacion(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.component.getFechaDeModificacion();
	}

}
