package ar.edu.info.unlp.ejercicio_8;

import java.time.*;

public class Pending extends Estado {

	@Override
	public void start(ToDoItem tarea) {
		tarea.setEstado(new InProgress());	
	}

	@Override
	public void togglePause(ToDoItem tarea) {
		throw new RuntimeException("La tarea no se encuentra en Pending ni en InProgress");
	}

	@Override
	public void finish(ToDoItem tarea) {

	}
	
	@Override
	public Duration workedTime(ToDoItem tarea) {
		throw new RuntimeException("La tarea se encuentra en Pending");
	}

}
