package ar.edu.info.unlp.ejercicio_8;

import java.time.*;

public abstract class Estado {

	public abstract void start(ToDoItem tarea);
	public abstract void togglePause(ToDoItem tarea);
	public abstract void finish(ToDoItem tarea);
	
	public Duration workedTime(ToDoItem tarea) {
		return Duration.between(tarea.getComienzo(), LocalDateTime.now());
	}
	
	public void addComment(ToDoItem tarea, String comment) {
		tarea.agregarComentario(comment);
	}

}
