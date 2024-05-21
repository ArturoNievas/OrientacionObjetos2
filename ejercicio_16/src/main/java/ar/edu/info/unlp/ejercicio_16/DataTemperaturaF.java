package ar.edu.info.unlp.ejercicio_16;

public class DataTemperaturaF extends Data {
	
	public DataTemperaturaF(WeatherData component) {
		super(component);
	}
	
	@Override
	public String displayData(){
		return super.displayData() + "Temperatura F: " + this.component.getTemperatura() + "; ";
	}
}
