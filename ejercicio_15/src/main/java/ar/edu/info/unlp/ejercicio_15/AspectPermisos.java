package ar.edu.info.unlp.ejercicio_15;

public class AspectPermisos extends Aspect {

	public AspectPermisos(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.component.getPermisos();
	}
}
