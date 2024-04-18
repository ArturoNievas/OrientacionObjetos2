package ar.edu.info.unlp.ejercicio_12;

public class Dispositivo {

	private Connection conexion;
	private CRC crcCalculator;
	private Ringer ringer;
	private Display display;
	
	public String send(String data) {
		return this.conexion.send(data, this.crcCalculator.crcFor(data));
	}
	
	public void conectarCon(Connection conexion) {
		this.conexion = conexion;
	}
	
	public void configurarCRC(CRC crcCalculator) {
		this.crcCalculator = crcCalculator;
	}
	
}
