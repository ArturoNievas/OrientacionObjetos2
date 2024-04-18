package ar.edu.info.unlp.ejercicio_11;

import java.time.*;

public class Proyecto {
	
	private String nombre;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private String objetivo;
	private int cantidadIntegrantes;
	private double pagoPorDia;
	private double margenDeGanancia;
	private Etapa etapa;
	
	public Proyecto(String nombre, LocalDateTime fechaInicio, LocalDateTime fechaFin, String objetivo,
			int cantidadIntegrantes, double pagoPorDia) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.cantidadIntegrantes = cantidadIntegrantes;
		this.pagoPorDia = pagoPorDia;
		this.margenDeGanancia = 7;
		this.etapa = new Construccion();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public int getCantidadIntegrantes() {
		return cantidadIntegrantes;
	}

	public void setCantidadIntegrantes(int cantidadIntegrantes) {
		this.cantidadIntegrantes = cantidadIntegrantes;
	}

	public double getPagoPorDia() {
		return pagoPorDia;
	}

	public void setPagoPorDia(double pagoPorDia) {
		this.pagoPorDia = pagoPorDia;
	}

	public double getMargenDeGanancia() {
		return margenDeGanancia;
	}
	
	public void setMargenDeGanancia(double porcentaje) {
		this.margenDeGanancia = porcentaje;
	}

	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public void aprobarEtapa() {
		this.etapa.aprobarEtapa(this);
	}
	
	public double costoDelProyecto() {
		return this.cantidadIntegrantes * this.pagoPorDia * Duration.between(this.fechaInicio,this.fechaFin).toDays();
	}
	
	public double precioDelProyecto() {
		return this.costoDelProyecto()*(1+this.margenDeGanancia/100);
	}
	
	public void modificarMargenDeGanancia(double porcentaje) {
		this.etapa.modificarMargenDeGanancia(this,porcentaje);
	}
	
	public void cancelarProyecto() {
		this.etapa.cancelarProyecto(this);
	}
}
