package ar.edu.info.unlp.ejercicio_15;

public class AspectTamanio extends Aspect {

	public AspectTamanio(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.component.getTamanio();
	}

}
