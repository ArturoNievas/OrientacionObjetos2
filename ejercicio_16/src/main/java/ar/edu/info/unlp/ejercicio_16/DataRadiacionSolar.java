package ar.edu.info.unlp.ejercicio_16;

public class DataRadiacionSolar extends Data {
	
	public DataRadiacionSolar(WeatherData component) {
		super(component);
	}
	
	@Override
	public String displayData(){
		return super.displayData() + "Radiación solar: " + this.component.getRadiacionSolar() + "; ";
	}

}
