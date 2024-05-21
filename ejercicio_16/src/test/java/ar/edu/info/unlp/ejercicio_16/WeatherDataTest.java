package ar.edu.info.unlp.ejercicio_16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherDataTest {
	
	private HomeWeatherStation h;
	private WeatherData wf;
	private WeatherData wc;
	
	@BeforeEach
	void setUp() throws Exception {
		this.h = new HomeWeatherStation(new Medidor());
		this.h.getTemperatura();
		this.h.getTemperatura();
		
		this.wf = new DataTemperaturaMaxima(new DataTemperaturaMinima(new DataPromedioTemperatura(new DataRadiacionSolar(new DataPresion(new DataTemperaturaF(this.h))))));
		this.wc = new DataTemperaturaMaxima(new DataTemperaturaMinima(new DataPromedioTemperatura(new DataRadiacionSolar(new DataPresion(new DataTemperaturaC(this.h))))));
	}
	
    @Test
    public void testDisplayDataF() {
    	assertEquals(this.wf.displayData(),"Temperatura F: 86; Presión atmosf: 1008; Radiación solar: 200; Promedio: 86; Mínimo: 80.6 Máximo: 89.6;");
    }
    
    @Test
    public void testDisplayDataC() {
    	assertEquals(this.wc.displayData(),"Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30; Mínimo: 27 Máximo: 32;");
    }

}
