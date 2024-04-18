package ar.edu.info.unlp.ejercicio_9;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	
	private Excursion e;
	private Usuario u1;
	private Usuario u3;
	private Usuario u2;
	
	@BeforeEach
	void setUp() throws Exception {
		LocalDateTime f1 = LocalDateTime.of(2015, Month.JULY, 29, 19, 30, 40);
		LocalDateTime f2 = LocalDateTime.of(2015, Month.JULY, 29, 23, 30, 40);
		this.e = new Excursion("Dos días en kayak bajando el Paraná", f1, f2, "Obelisco", 1, 2, 100);
		this.u1 = new Usuario("Arturo", "Nievas", "arturo98nievas@gmail.com");
		this.u2 = new Usuario("Tomás", "Rebord", "haa@gmail.com");
		this.u3 = new Usuario("Damian", "Betular", "pastelito@gmail.com");
	}
	
    @Test
    public void testInscribir() {
    	assertTrue(this.e.getEstado() instanceof Provisoria);
    	this.e.inscribir(this.u1);
    	assertTrue(this.e.getEstado() instanceof Definitiva);
    	this.e.inscribir(this.u2);
    	assertTrue(this.e.getEstado() instanceof Completa);
    	assertEquals(this.e.getInscriptos().size(),2);
    	assertEquals(this.e.getListaDeEspera().size(),0);
    	this.e.inscribir(this.u3);
    	assertEquals(this.e.getInscriptos().size(),2);
    	assertEquals(this.e.getListaDeEspera().size(),1);
    }

}
