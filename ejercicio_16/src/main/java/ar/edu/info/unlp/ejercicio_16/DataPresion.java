package ar.edu.info.unlp.ejercicio_16;

public class DataPresion extends Data {
	
	public DataPresion(WeatherData component) {
		super(component);
	}
	
	@Override
	public String displayData(){
		return super.displayData() + "Presion atmosf: " + this.component.getPresion() + "; ";
	}

}
