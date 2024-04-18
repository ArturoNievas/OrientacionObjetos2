package ar.edu.info.unlp.ejercicio_8;

import java.time.*;
import java.util.*;

public class ToDoItem {
	
	private String nombre;
	private LocalDateTime comienzo;
	private LocalDateTime fin;
	private Estado estado;
	private List<String> comentarios;
	
	
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	public ToDoItem(String nombre) {
		this.nombre = nombre;
		this.comienzo = LocalDateTime.now();
		this.fin = null;
		this.estado = new Pending();
		this.comentarios = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}
	
	// Se implementa solo para poder testear la clase
	public void setComienzo(LocalDateTime comienzo) {
		this.comienzo = comienzo;
	}
	
	public LocalDateTime getComienzo() {
		return fin;
	}
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public List<String> getComentarios() {
		return comentarios;
	}
	
	public void agregarComentario(String comentario) {
		this.comentarios.add(comentario);
	}

	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	public void start() {
		this.estado.start(this);
	}
	
	/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	public void togglePause() {
		this.estado.togglePause(this);
	}
	
	/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	public void finish() {
		this.estado.finish(this);
	}
	
	/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	public Duration workedTime() {
		return this.estado.workedTime(this);
	}
	
	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	public void addComment(String comment) {
		this.estado.addComment(this, comment);
	}

}
