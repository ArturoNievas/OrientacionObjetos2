package ar.edu.info.unlp.ejercicio_4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmpleado {
	Temporario temp;
	Pasante pas;
	Planta planta;
	
	@BeforeEach
	void setUp() throws Exception {
		this.temp = new Temporario(40,true,2);
		this.pas = new Pasante(15);
		this.planta = new Planta(false,3,4);
	}
	
    @Test
    public void testAgregarUsuario() {
        assertEquals(this.temp.sueldo(),36390);
        assertEquals(this.pas.sueldo(),45900);
        assertEquals(this.planta.sueldo(),56800);
    }
	    

}
