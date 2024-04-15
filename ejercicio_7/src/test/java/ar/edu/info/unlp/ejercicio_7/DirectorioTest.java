package ar.edu.info.unlp.ejercicio_7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectorioTest {

	private Directorio raiz;
	private Directorio d1;
	private Directorio d2;
	private Archivo a1;
	private Archivo a2;
	private Archivo a3;
	
	@BeforeEach
	void setUp() throws Exception {
		this.raiz = new Directorio("home");
		this.d1 = new Directorio("directorio vacio");
		this.d2 = new Directorio("directorio con cosas");
		this.a1 = new Archivo("trucosgta",32);
		this.a2 = new Archivo("sarasa",64);
		this.a3 = new Archivo("sarasa",16);
		
		this.raiz.agregar(a1);
		this.d2.agregar(a2);
		this.raiz.agregar(d2);
		this.raiz.agregar(d1);
		this.raiz.agregar(a3);
	}
	
    @Test
    public void testTamanio() {
        assertEquals(this.raiz.tamanio(),98416);
    }
    
    @Test
    public void testArchivoMasGrande() {
        assertEquals(this.a2,this.raiz.archivoMasGrande());
    }
    
    @Test
    public void testArchivoMasNuevo() {
        assertEquals(this.a3,this.raiz.archivoMasNuevo());
    }
    
    @Test
    public void buscar() {
        assertEquals(this.raiz.buscar("sarasa"),this.a2);
        assertEquals(this.raiz.buscar("directorio con cosas"),this.d2);
        assertNull(this.raiz.buscar("papas"));
    }
    
    @Test
    public void buscarTodos() {
    	assertEquals(this.raiz.buscarTodos("sarasa").size(),2);
        assertTrue(this.raiz.buscarTodos("papas").isEmpty());
    }
    
    @Test
    public void listadoDeContenido() {
        assertEquals(this.raiz.listadoDeContenido("/home"),"/home/home\n" +
        													"/home/home/trucosgta\n" +
        													"/home/home/directorio con cosas\n" +
        													"/home/home/directorio con cosas/sarasa\n" +
        													"/home/home/directorio vacio\n" +
        													"/home/home/sarasa\n");
    }
}
