package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	
	Usuario usuario1;
	TweetRaiz tuit1;
	
	@BeforeEach
	void setUp() throws Exception {
		tuit1 = new TweetRaiz("Tweet de menos de 280 caracteres");
		usuario1 = new Usuario("asdogvu");
	}
	
    @Test
    public void testTweetear() {
        assertNotNull(usuario1.tweetear("Tweet de menos de 280 caracteres"));
        assertEquals(usuario1.getLastTweet().getTexto(),"Tweet de menos de 280 caracteres");
        assertNotNull(usuario1.tweetear("Tweet de 280 caracteres. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. AAAAAAAAAAAAAAAAAAAAAAA"));
        assertEquals(usuario1.getLastTweet().getTexto(),"Tweet de 280 caracteres. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. AAAAAAAAAAAAAAAAAAAAAAA");
        assertNull(usuario1.tweetear("Tweet de mas de 280 caracteres. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
        assertEquals(usuario1.getLastTweet().getTexto(),"Tweet de 280 caracteres. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. AAAAAAAAAAAAAAAAAAAAAAA");
    }
    
    @Test
    public void testRetweetear() {
    	assertNotNull(usuario1.retweetear(tuit1).getTweetOriginal());
    	assertNull(usuario1.getLastTweet().getTexto());
    	// assertEquals(usuario1.getLastTweet().getTweetOriginal(),tuit1);
    }
    
    @Test
    public void testEliminarTweets() {
    	assertNotNull(usuario1.retweetear(tuit1).getTweetOriginal());
    	assertNull(usuario1.getLastTweet().getTexto());
    	// assertEquals(usuario1.getLastTweet().getTweetOriginal(),tuit1);
    }

}
