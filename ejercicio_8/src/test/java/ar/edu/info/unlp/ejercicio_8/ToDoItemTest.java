package ar.edu.info.unlp.ejercicio_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	private ToDoItem tarea;
	
	@BeforeEach
	void setUp() throws Exception {
		this.tarea = new ToDoItem("Arreglar el techo");
	}
	
    @Test
    public void testStart() {
    	assertTrue(this.tarea.getEstado() instanceof Pending);
    	this.tarea.start();
        assertTrue(this.tarea.getEstado() instanceof InProgress);
    }
    
    @Test
    public void testTogglePause() {
    	
    }
}
