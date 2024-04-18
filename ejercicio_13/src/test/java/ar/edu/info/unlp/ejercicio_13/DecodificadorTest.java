package ar.edu.info.unlp.ejercicio_13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	
	private Decodificador d;
	
	@BeforeEach
	void setUp() throws Exception {
		this.d = new Decodificador(new Novedad());
		Pelicula thor = new Pelicula("String", 2007, 7.9);
		Pelicula capitanAmerica = new Pelicula("Capitan America", 2016, 7.8);
		Pelicula ironMan = new Pelicula("Iron man", 2010, 7.9);
		Pelicula dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
		Pelicula rocky = new Pelicula("Rocky", 1976, 8.1);
		Pelicula rambo = new Pelicula("Rambo", 1979, 7.8);
		
		thor.agregarSimilar(capitanAmerica);
		thor.agregarSimilar(ironMan);
		capitanAmerica.agregarSimilar(thor);
		capitanAmerica.agregarSimilar(ironMan);
		ironMan.agregarSimilar(thor);
		ironMan.agregarSimilar(capitanAmerica);
		rocky.agregarSimilar(rambo);
		rambo.agregarSimilar(rocky);
		
		this.d.agregarPelicula(thor);
		this.d.agregarPelicula(capitanAmerica);
		this.d.agregarPelicula(ironMan);
		this.d.agregarPelicula(dunkirk);
		this.d.agregarPelicula(rocky);
		this.d.agregarPelicula(rambo);
		
		this.d.reproducirPelicula(thor);
		this.d.reproducirPelicula(rocky);
	}
	
    @Test
    public void testSugerirPeliculas() {
    	assertEquals(this.d.sugerirPeliculas().stream().map(p -> p.getTitulo()).toList().toString(),"[Dunkirk, Capitan America, Iron man]");
    	
    	this.d.configurarSugerencias(new Similaridad());
    	assertEquals(this.d.sugerirPeliculas().stream().map(p -> p.getTitulo()).toList().toString(),"[Capitan America, Iron man, Rambo]");
    	
    	this.d.configurarSugerencias(new Puntaje());
    	assertEquals(this.d.sugerirPeliculas().stream().map(p -> p.getTitulo()).toList().toString(),"[Rocky, Dunkirk, Iron man]");
    }
	    

}
