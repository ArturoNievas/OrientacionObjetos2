package ar.edu.unlp.oo1.ejercicio1.app;

import java.util.*;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FilterHandler extends Handler {

	private Handler handler;
	private List<String> palabrasCensuradas;
	
	public FilterHandler(Handler handler, List<String> palabrasCensuradas) {
		this.handler = handler;
		this.palabrasCensuradas = palabrasCensuradas;
	}
	
	public FilterHandler(Handler handler) {
		this.handler = handler;
		this.palabrasCensuradas = new ArrayList<String>();
	}
	
	public void agregarPalabraCensurada(String palabra) {
		this.palabrasCensuradas.add(palabra);
	}
	
	public String censurar(String mensaje) {
		for (String palabra : palabrasCensuradas) {
            mensaje = mensaje.replace(palabra, "***");
        }
		return mensaje;
	}

	@Override
	public void publish(LogRecord record) {
		record.setMessage(censurar(record.getMessage()));
		this.handler.publish(record);
	}

	@Override
	public void flush() {
		this.handler.flush();
	}

	@Override
	public void close() throws SecurityException {
		this.handler.close();
	}

}
