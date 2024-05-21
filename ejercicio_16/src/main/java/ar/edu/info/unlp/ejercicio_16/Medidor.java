package ar.edu.info.unlp.ejercicio_16;

import java.util.*;

public class Medidor {

	private List<Double> temperaturasPrueba;
	private int i;
	
	public Medidor() {
		this.temperaturasPrueba = new ArrayList<Double>();
		this.i = 0;
		this.temperaturasPrueba.add(80.6);
		this.temperaturasPrueba.add(89.6);
		this.temperaturasPrueba.add(87.8);
		this.temperaturasPrueba.add(86.0);
	}
	
	public double medirTemperatura() {
		return this.temperaturasPrueba.get(this.i++);
	}

	public double medirPresion() {
		return 1008;
	}
	
	public double medirRadiacionSolar() {
		return 200;
	}
	
}
