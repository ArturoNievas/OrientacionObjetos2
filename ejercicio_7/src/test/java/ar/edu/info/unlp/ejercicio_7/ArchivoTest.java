package ar.edu.info.unlp.ejercicio_7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {

	private Archivo a1;
	
	@BeforeEach
	void setUp() throws Exception {
		this.a1 = new Archivo("sarasa",32);
	}
	
    @Test
    public void testTamanio() {
        assertEquals(this.a1.tamanio(),32);
    }
    
    @Test
    public void testArchivoMasGrande() {
        assertEquals(this.a1,this.a1.archivoMasGrande());
    }
    
    @Test
    public void testArchivoMasNuevo() {
        assertEquals(this.a1,this.a1.archivoMasNuevo());
    }
    
    @Test
    public void buscar() {
        assertEquals(this.a1.buscar("sarasa"),this.a1);
        assertNull(this.a1.buscar("papas"));
    }
    
    @Test
    public void buscarTodos() {
    	assertEquals(this.a1.buscarTodos("sarasa").size(),1);
        assertTrue(this.a1.buscarTodos("papas").isEmpty());
    }
    
    @Test
    public void listadoDeContenido() {
        assertEquals(this.a1.listadoDeContenido("/home"),"/home/sarasa\n");
    }
    
    
}
