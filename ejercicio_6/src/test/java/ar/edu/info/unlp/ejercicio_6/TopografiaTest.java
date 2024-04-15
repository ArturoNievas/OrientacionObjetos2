package ar.edu.info.unlp.ejercicio_6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {

	private Topografia t1;
	private Topografia t2;
	private Topografia agua1;
	private Topografia agua2;
	private Topografia tierra1;
	private Topografia tierra2;
	private Topografia mixta1a;
	private Topografia mixta2a;
	
	@BeforeEach
	void setUp() throws Exception {
		this.agua1 = new Agua();
		this.agua2 = new Agua();
		this.tierra1 = new Tierra();
		this.tierra2 = new Tierra();
		Topografia pantano1 = new Pantano();
		Topografia pantano2 = new Pantano();
		
		this.mixta1a = new Compuesta(agua1, tierra1, agua1, tierra1);
		this.t1 = new Compuesta(agua1, tierra1, agua1, mixta1a);
		
		this.mixta2a = new Compuesta(agua2, tierra2, agua2, tierra2);
		this.t2 = new Compuesta(agua2, tierra2, agua2, mixta2a);
		
	}
	
    @Test
    public void testProporcionAgua() {
        assertEquals(this.t1.proporcionAgua(),0.625);
    }
    
    @Test
    public void testProporcionTierra() {
    	assertEquals(this.t1.proporcionTierra(),0.375);
    }
    
    @Test
    public void testEquals() {
        assertTrue(this.t1.equals(this.t2));
        assertFalse(this.t1.equals(this.agua1));
        assertTrue(this.agua1.equals(this.agua2));
        assertFalse(this.agua1.equals(this.tierra1));
        assertFalse(this.agua1.equals(this.mixta1a));
        assertTrue(this.mixta1a.equals(this.mixta2a));
    }
	
}
