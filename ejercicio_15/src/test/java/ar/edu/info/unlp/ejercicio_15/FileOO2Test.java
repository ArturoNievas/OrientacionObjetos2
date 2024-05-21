package ar.edu.info.unlp.ejercicio_15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {

	private FileOO2 f1;
	private FileOO2 f2;
	private FileOO2 f3;
	private File f;
	
	@BeforeEach
	void setUp() throws Exception {
		this.f = new File("notas", ".txt", 32, "rwxr-xr-x");
		
		//nombre - extensión
		this.f1 = new AspectExtension(new AspectNombre(this.f));
		
		//nombre - extensión - fecha de creación
		this.f2 = new AspectFechaDeCreacion(new AspectExtension(new AspectNombre(this.f)));
		
		//permisos - nombre - extensión - tamaño
		this.f3 = new AspectTamanio(new AspectExtension(new AspectNombre(new AspectPermisos(this.f))));
	}
	
    @Test
    public void testPrettyPrint() {
        assertEquals(this.f1.prettyPrint(),"Datos: notas .txt");
        
        assertEquals(this.f2.prettyPrint(),"Datos: notas .txt " + this.f.getFechaDeCreacion());
        
        assertEquals(this.f3.prettyPrint(),"Datos: rwxr-xr-x notas .txt 32");
    }
}
