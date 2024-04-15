package ar.edu.info.unlp.ejercicio_8;

import java.time.*;

public class Paused extends Estado {

	@Override
	public void start(ToDoItem tarea) {
		
	}

	@Override
	public void togglePause(ToDoItem tarea) {
		tarea.setEstado(new InProgress());
	}

	@Override
	public void finish(ToDoItem tarea) {
		tarea.setEstado(new Finished());
		tarea.setFin(LocalDateTime.now());
	}

}
