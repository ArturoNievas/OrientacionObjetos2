package ar.edu.info.unlp.ejercicio_15;

public class AspectExtension extends Aspect {

	public AspectExtension(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.component.getExtension();
	}

}
