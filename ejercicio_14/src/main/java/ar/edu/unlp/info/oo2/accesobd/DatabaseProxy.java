package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {

	private DatabaseRealAccess database;
	private boolean logueado;
	private String pswd;
	
	public DatabaseProxy(DatabaseRealAccess database, String pswd) {
		this.database = database;
		this.logueado = false;
		this.pswd = pswd;
	}
	
	public void iniciarSesion(String pswd) {
		if (this.pswd.equals(pswd)) {
			this.logueado = true;
		}
	}
	
	public void cerrarSesion() {
		this.logueado = false;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.logueado) {
			return this.database.getSearchResults(queryString);
		} else {
			throw new RuntimeException("Error: Debe iniciar sesion para acceder a la base de datos");
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.logueado) {
			return this.database.insertNewRow(rowData);
		} else {
			throw new RuntimeException("Error: Debe iniciar sesion para acceder a la base de datos");
		}
	}

}
