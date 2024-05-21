package ar.edu.info.unlp.ejercicio_16;

import java.util.*;

public class HomeWeatherStation implements WeatherData {
	
	private Medidor medidor;
	private List<Double> temperaturas;
	
	public HomeWeatherStation(Medidor medidor) {
		this.medidor = medidor;
		this.temperaturas = new ArrayList<Double>();
	}

	//retorna la temperatura en grados Fahrenheit.
	@Override
	public double getTemperatura() {
		double t = this.medidor.medirTemperatura();
		this.temperaturas.add(t);
		return t;
	}

	//retorna la presión atmosférica en hPa
	@Override
	public double getPresion() {
		return this.medidor.medirPresion();
	}

	//retorna la radiación solar
	@Override
	public double getRadiacionSolar() {
		return this.medidor.medirRadiacionSolar();
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	@Override
	public List<Double> getTemperaturas() {
		return this.temperaturas;
	}

	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	@Override
	public String displayData(){
		return "Temperatura F: " + this.getTemperatura() +
		   	  "Presión atmosf: " + this.getPresion() +
		   	  "Radiación solar: " + this.getRadiacionSolar();
	}

}
