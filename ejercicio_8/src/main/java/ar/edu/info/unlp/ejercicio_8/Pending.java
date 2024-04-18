package ar.edu.info.unlp.ejercicio_8;

import java.time.*;

public class Pending extends Estado {

	@Override
	public void start(ToDoItem tarea) {
		tarea.setEstado(new InProgress());	
	}

	@Override
	public void togglePause(ToDoItem tarea) {
		throw new RuntimeException("Error: La tarea debe estar pausada o en progreso");
	}

	@Override
	public void finish(ToDoItem tarea) {

	}
	
	@Override
	public Duration workedTime(ToDoItem tarea) {
		throw new RuntimeException("Error: La tarea aun no comenzó a ejecutarse");
	}

}
