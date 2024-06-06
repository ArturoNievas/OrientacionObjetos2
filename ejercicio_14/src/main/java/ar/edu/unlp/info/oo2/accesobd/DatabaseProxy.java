package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
			Logger.getLogger("DatabaseProxy").log(Level.INFO, "Datos recuperados de la base de datos");
			return this.database.getSearchResults(queryString);
		} else {
			Logger.getLogger("DatabaseProxy").log(Level.SEVERE, "Intento de acceso sin autenticar a la base de datos");
			throw new RuntimeException("Error: Debe iniciar sesion para acceder a la base de datos");
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.logueado) {
			Logger.getLogger("DatabaseProxy").log(Level.WARNING, "Datos cargados a la base de datos");
			return this.database.insertNewRow(rowData);
		} else {
			Logger.getLogger("DatabaseProxy").log(Level.SEVERE, "Intento de acceso sin autenticar a la base de datos");
			throw new RuntimeException("Error: Debe iniciar sesion para acceder a la base de datos");
		}
	}

}
