package ar.edu.info.unlp.ejercicio_16;

import java.util.*;

public class DataTemperaturaC extends Data {

	public DataTemperaturaC(WeatherData component) {
		super(component);
	}
	
	@Override
	public double getTemperatura() {
		return Math.round((this.component.getTemperatura() - 32)*10/1.8)/10;
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.component.getTemperaturas().stream().map(t -> (t-32)/1.8).toList();
	}
	
	@Override
	public String displayData(){
		return super.displayData() + "Temperatura C: " + this.getTemperatura() + "; ";
	}

}
