package ar.edu.info.unlp.ejercicioDemo;

public class SubteWay {

	private Constructor constructor;

	public SubteWay(Constructor constructor) {
		this.constructor = constructor;
	}

	public Constructor getConstructor() {
		return constructor;
	}

	public void setConstructor(Constructor constructor) {
		this.constructor = constructor;
	}
	
	public Sanguche hacerSanguche() {
		return this.constructor.obtenerSanguche();
	}
}
