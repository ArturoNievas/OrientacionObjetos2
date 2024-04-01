package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.*;

public class Tweeter {
	private List<Usuario> usuarios;
	
	public Tweeter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario agregarUsuario(String screenName) {
		if (!this.usuarios.stream().anyMatch(u -> u.getScreenName().equals(screenName))) {
			Usuario usuario = new Usuario(screenName);
			this.usuarios.add(usuario);
			return usuario;
		} else {
			return null;
		}
	}
	
	public void eliminarUsuario(String screenName) {
		Usuario usuario = this.usuarios.stream().filter(u -> u.getScreenName().equals(screenName)).findFirst().orElse(null);
		if (usuario != null) {
			usuario.eliminarTweets();
			this.usuarios.remove(usuario);
		}
	}

}
