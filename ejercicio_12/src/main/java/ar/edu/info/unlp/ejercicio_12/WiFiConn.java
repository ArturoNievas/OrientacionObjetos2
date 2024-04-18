package ar.edu.info.unlp.ejercicio_12;

public class WiFiConn implements Connection {
	
	private String pict;

	@Override
	public String send(String data, int crc) {
		return null;
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
