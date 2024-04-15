package ar.edu.info.unlp.ejercicio_8;

import java.time.*;

public class Finished extends Estado {

	@Override
	public void start(ToDoItem tarea) {
		
	}

	@Override
	public void togglePause(ToDoItem tarea) {
		throw new RuntimeException("La tarea no se encuentra en Pending ni en InProgress");
	}

	@Override
	public void finish(ToDoItem tarea) {
		
	}

	@Override
	public void addComment(ToDoItem tarea, String comment) {
		
	}

	@Override
	public Duration workedTime(ToDoItem tarea) {
		return Duration.between(tarea.getComienzo(), tarea.getFin());
	}

}
