package ar.edu.unlp.info.oo1.ejercicio5;

import java.time.LocalDate;

public class RealMamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public RealMamifero() {
		this.madre = new NullObjectMamifero();
		this.padre = new NullObjectMamifero();
	}
	public RealMamifero(String identificador) {
		this.identificador = identificador;
		this.madre = new NullObjectMamifero();
		this.padre = new NullObjectMamifero();
	}
	public RealMamifero(String identificador, String especie, LocalDate fechaNacimiento, Mamifero madre, Mamifero padre) {
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		this.madre = madre;
		this.padre = padre;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaNacimiento = fechaDeNacimiento;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return this.ancestroMaterno(unMamifero) || this.ancestroPaterno(unMamifero);
	}

	private boolean ancestroMaterno(Mamifero unMamifero){
		return this.getMadre() == unMamifero || this.getMadre().tieneComoAncestroA(unMamifero);
	}

	private boolean ancestroPaterno(Mamifero unMamifero){
		return this.getPadre() == unMamifero || this.getPadre().tieneComoAncestroA(unMamifero);
	}
}
