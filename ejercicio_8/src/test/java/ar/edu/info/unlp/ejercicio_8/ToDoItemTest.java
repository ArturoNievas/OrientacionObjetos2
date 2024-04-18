package ar.edu.info.unlp.ejercicio_8;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	private ToDoItem tarea1;
	private ToDoItem tarea2;
	
	@BeforeEach
	void setUp() throws Exception {
		this.tarea1 = new ToDoItem("Arreglar el techo");
		this.tarea2 = new ToDoItem("Pintar la casa");
	}
	
    @Test
    public void testStart() {
    	assertTrue(this.tarea1.getEstado() instanceof Pending);
    	this.tarea1.start();
        assertTrue(this.tarea1.getEstado() instanceof InProgress);
    }
    
    @Test
    public void testTogglePause() {
    	Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.tarea1.togglePause();});
	    assertEquals("Error: La tarea debe estar pausada o en progreso",exceptionPending.getMessage());
    	
    	this.tarea1.start();
    	this.tarea1.togglePause();
    	assertTrue(this.tarea1.getEstado() instanceof Paused);
    	this.tarea1.togglePause();
    	assertTrue(this.tarea1.getEstado() instanceof InProgress);
    	
    	this.tarea1.finish();
    	Exception exceptionFinished = assertThrows(RuntimeException.class, () -> {this.tarea1.togglePause();});
	    assertEquals("Error: La tarea debe estar pausada o en progreso",exceptionFinished.getMessage());
    }
    
    @Test
    public void testFinish() {
    	this.tarea1.finish();
        assertTrue(this.tarea1.getEstado() instanceof Pending);
        
        this.tarea1.start();
        this.tarea1.finish();
        assertTrue(this.tarea1.getEstado() instanceof Finished);
        
        this.tarea2.start();
        this.tarea2.togglePause();
        assertTrue(this.tarea1.getEstado() instanceof Finished);
    }
    
    @Test
    public void testWorkedTime() {        
    	Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.tarea1.workedTime();});
		assertEquals("Error: La tarea aun no comenzó a ejecutarse",exceptionPending.getMessage());
		
		this.tarea2.start();
		this.tarea2.finish();
		this.tarea2.setComienzo(LocalDateTime.of(2023, 3, 31, 15, 32, 0));
		this.tarea2.setFin(LocalDateTime.of(2023, 3, 31, 16, 32, 30));
		assertEquals(3630,this.tarea2.workedTime().getSeconds());
    }
    
    @Test
	public void testAddComment() {
    	this.tarea1.addComment("Hola esto es un comentario");
		this.tarea1.addComment("Hola esto es 2do comentario");
		assertEquals("Hola esto es un comentario",this.tarea1.getComentarios().get(0));
		assertEquals("Hola esto es 2do comentario",this.tarea1.getComentarios().get(1));
		
    	
    	this.tarea1.start();
    	this.tarea1.addComment("Hola esto es 3er comentario");
		this.tarea1.addComment("Hola esto es 4to comentario");
		assertEquals("Hola esto es 3er comentario",this.tarea1.getComentarios().get(2));
		assertEquals("Hola esto es 4to comentario",this.tarea1.getComentarios().get(3));
		
		this.tarea1.togglePause();
		this.tarea1.addComment("Hola esto es 5to comentario");
		this.tarea1.addComment("Hola esto es 6to comentario");
		assertEquals("Hola esto es 5to comentario",this.tarea1.getComentarios().get(4));
		assertEquals("Hola esto es 6to comentario",this.tarea1.getComentarios().get(5));
		
		this.tarea1.finish();
		this.tarea1.addComment("Hola esto es un comentario");
		assertEquals(6,this.tarea1.getComentarios().size());
	}
}
