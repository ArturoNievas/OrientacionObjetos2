package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.*;

public class VoorheesExporter {

	/*
	private String exportar(Socio socio) {
		String separator = System.lineSeparator();
		return "\t{" + separator
			+ "\t\t\"nombre\": \"" + socio.getNombre() + "\"," + separator
			+ "\t\t\"email\": \"" + socio.getEmail() + "\"," + separator
			+ "\t\t\"legajo\": \"" + socio.getLegajo() + "\"" + separator
			+ "\t}";
	}

	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder("[" + separator);
		socios.forEach(socio -> {
			buffer.append(this.exportar(socio))
				.append(",")
				.append(separator);
		});
		// remueve la última coma y fin de línea
		buffer.setLength(buffer.length() - (separator.length() + 1));
		buffer.append(separator).append("]");
		return buffer.toString();
	}
	*/
	
	private JSONObject exportar(Socio socio) {
		JSONObject jsonO = new JSONObject();
		jsonO.put("nombre", socio.getNombre());
		jsonO.put("email", socio.getEmail());
		jsonO.put("legajo", socio.getLegajo());
		return jsonO;
	}
	
	public String exportar(List<Socio> socios) {
		JSONArray jsonA = new JSONArray();
		socios.stream().map(s -> jsonA.add(this.exportar(s)));
		return jsonA.toJSONString();
	}
}
