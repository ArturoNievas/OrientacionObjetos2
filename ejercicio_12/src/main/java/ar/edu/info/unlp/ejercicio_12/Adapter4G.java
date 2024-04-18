package ar.edu.info.unlp.ejercicio_12;

public class Adapter4G implements Connection {

	private _4GConnection adaptado;
	
	@Override
	public String send(String data, int crc) {
		return this.adaptado.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.adaptado.symb();
	}

}
