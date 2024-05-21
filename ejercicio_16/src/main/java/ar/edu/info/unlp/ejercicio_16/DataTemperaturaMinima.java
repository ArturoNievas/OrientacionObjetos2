package ar.edu.info.unlp.ejercicio_16;

public class DataTemperaturaMinima extends Data {
	
	public DataTemperaturaMinima(WeatherData component) {
		super(component);
	}
	
	@Override
	public String displayData(){
		return super.displayData() + "Minimo: " + Math.round(this.component.getTemperaturas().stream().min(Double::compareTo).orElse(null)*10)/10 + "; ";
	}

}
