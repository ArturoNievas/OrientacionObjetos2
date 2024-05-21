package ar.edu.info.unlp.ejercicio_16;

public class DataTemperaturaMaxima extends Data {

	public DataTemperaturaMaxima(WeatherData component) {
		super(component);
	}
	
	@Override
	public String displayData(){
		return super.displayData() + "Maximo: " + Math.round(this.component.getTemperaturas().stream().max(Double::compareTo).orElse(null)*10)/10 + "; ";
	}
}
