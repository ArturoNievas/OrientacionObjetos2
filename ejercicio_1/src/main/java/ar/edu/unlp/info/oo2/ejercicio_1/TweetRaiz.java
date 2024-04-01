package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.*;

public class TweetRaiz extends Tweet {
	private String texto;
	private List<Retweet> retweets;

	public TweetRaiz(String texto) {
		super();
		this.texto = texto;
		this.retweets = new ArrayList<Retweet>();
	}
	
	@Override
	public String getTexto() {
		return texto;
	}

	public List<Retweet> getRetweets() {
		return retweets;
	}

	public void retweet(Retweet retweet) {
		this.retweets.add(retweet);
	}
	
	public void eliminarReferencia() {
		this.retweets.stream().forEach(r -> r.eliminarReferencia());
	}

}
