package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubteWayTest {

	private SubteWay local;
	
	@BeforeEach
	void setUp() throws Exception {
		this.local = new SubteWay(new ConstructorSangucheClasico());
	}
	
    @Test
    public void testClasico() {
    	assertEquals(this.local.hacerSanguche().calcularMonto(),500);
    }
    
    @Test
    public void testVegetariano() {
    	this.local.setConstructor(new ConstructorSangucheVegetariano());
    	assertEquals(this.local.hacerSanguche().calcularMonto(),420);
    }
    
    @Test
    public void testVegano() {
    	this.local.setConstructor(new ConstructorSangucheVegano());
    	assertEquals(this.local.hacerSanguche().calcularMonto(),620);
    }
}
