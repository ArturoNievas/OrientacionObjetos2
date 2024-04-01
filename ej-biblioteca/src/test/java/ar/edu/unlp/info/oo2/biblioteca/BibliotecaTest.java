package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

	Biblioteca biblioteca;
	
	@BeforeEach
	void setUp() throws Exception {
		this.biblioteca = new Biblioteca();
		this.biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		this.biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}
	
    @Test
    public void testAgregarUsuario() {
    	assertEquals(this.biblioteca.exportarSocios(),"[\n"
    			+ "    {\n"
    			+ "   	 \"nombre\": \"Arya Stark\",\n"
    			+ "   	 \"email\": \"needle@stark.com\",\n"
    			+ "   	 \"legajo\": \"5234-5\"\n"
    			+ "    },\n"
    			+ "    {\n"
    			+ "   	 \"nombre\": \"Tyron Lannister\",\n"
    			+ "   	 \"email\": \"tyron@thelannisters.com\",\n"
    			+ "   	 \"legajo\": \"2345-2\"\n"
    			+ "    }\n"
    			+ "]\n"
    			+ "");
    }

}
