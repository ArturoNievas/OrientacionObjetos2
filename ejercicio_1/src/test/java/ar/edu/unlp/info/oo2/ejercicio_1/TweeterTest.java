package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TweeterTest {
	
	Tweeter tw;
	Usuario maslaton;
	Usuario rebord;
	TweetRaiz tuit1;
	Retweet tuit2;
	
	@BeforeEach
	void setUp() throws Exception {
		tw = new Tweeter();
		
		rebord = tw.agregarUsuario("haa");
		tuit1 = rebord.tweetear("gol de boca");
		
		maslaton = tw.agregarUsuario("bullish");
		maslaton.tweetear("milanesa con papas");
		tuit2 = maslaton.retweetear(tuit1);
	}
	
    @Test
    public void testAgregarUsuario() {
        assertNull(tw.agregarUsuario("bullish"));
    }
    
    @Test
    public void testEliminarUsuario() {
    	tw.eliminarUsuario("haa"); 	
    	assertEquals(rebord.getTweets().size(),0);
    	assertNull(tuit2.getTweetOriginal());
    }
}
