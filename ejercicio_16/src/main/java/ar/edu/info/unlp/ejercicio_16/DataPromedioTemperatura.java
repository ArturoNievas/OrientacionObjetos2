package ar.edu.info.unlp.ejercicio_16;

public class DataPromedioTemperatura extends Data {

	public DataPromedioTemperatura(WeatherData component) {
		super(component);
	}
	
	@Override
	public String displayData(){
		return super.displayData() + "Promedio: " + Math.round(this.component.getTemperaturas().stream().mapToDouble(t -> t).sum()/this.component.getTemperaturas().size()*10)/10 + "; ";
	}
}
