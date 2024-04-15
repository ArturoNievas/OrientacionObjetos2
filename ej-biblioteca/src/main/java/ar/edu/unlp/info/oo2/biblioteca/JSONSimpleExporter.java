package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.*;

public class JSONSimpleExporter extends VoorheesExporter {

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
