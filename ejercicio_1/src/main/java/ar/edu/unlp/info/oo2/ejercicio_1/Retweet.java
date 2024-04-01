package ar.edu.unlp.info.oo2.ejercicio_1;

public class Retweet extends Tweet {
	private TweetRaiz tweetOriginal;

	public Retweet(TweetRaiz tweetOriginal) {
		super();
		this.tweetOriginal = tweetOriginal;
	}

	public TweetRaiz getTweetOriginal() {
		return tweetOriginal;
	}
	
	public void eliminarReferencia() {
		this.tweetOriginal = null;
	}

}
