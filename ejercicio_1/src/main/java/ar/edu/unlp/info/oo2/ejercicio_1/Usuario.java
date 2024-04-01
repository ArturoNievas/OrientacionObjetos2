package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.*;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public List<Tweet> getTweets() {
		return tweets;
	}
	
	public Tweet getLastTweet() {
		return this.tweets.get(this.tweets.size()-1);
	}

	public TweetRaiz tweetear(String texto) {
		if (texto.length()<=280 && texto.length()>=1) {
			TweetRaiz tuit = new TweetRaiz(texto);
			tweets.add(tuit);
			return tuit;
		} else {
			return null;
		}
	}
	
	public Retweet retweetear(TweetRaiz tweet) {
		Retweet t = new Retweet(tweet);
		this.tweets.add(t);
		return t;
	}
	
	public void eliminarTweets() {
		this.tweets.stream().forEach(t -> t.eliminarReferencia());
		this.tweets.clear();
	}
	

}
